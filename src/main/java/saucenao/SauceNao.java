package saucenao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import okhttp3.*;
import saucenao.pojo.SauceNaoPojo;
import java.io.File;
import java.io.IOException;

public class SauceNao {
    private static final String URL = "https://saucenao.com/search.php";
    private final Integer db;
    private final String apiKey;
    private final Integer testMode;
    private final Integer dbMaskEnable;
    private final Integer dbMaskDisable;
    private final Integer numberOfResults;
    private final Integer outputType;

    private SauceNao(Integer db, String apiKey, Integer testMode, Integer dbMaskEnable, Integer dbMaskDisable, Integer numberOfResults) {
        this.outputType = 2;
        this.db = db;
        this.apiKey = Preconditions.checkNotNull(apiKey, "apiKey can not be null");
        this.testMode = testMode;
        this.dbMaskEnable = dbMaskEnable;
        this.dbMaskDisable = dbMaskDisable;
        this.numberOfResults = numberOfResults;
    }

    /**
     * @param file the image whose source you are looking for
     */
    public SauceNaoRes getSource(File file) throws SauceNaoException, IOException {
        OkHttpClient client = new OkHttpClient();
        RequestBody body = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("file", "file",
                        RequestBody.create(MediaType.parse("multipart/form-data"),
                                file))
                .build();
        Request request = new Request.Builder()
                .url(getUrl())
                .post(body)
                .build();
        Response response = client.newCall(request).execute();
        return new SauceNaoRes(checkError(response));
    }

    /**
     * @param url link to the image whose source you are looking for
     */
    public SauceNaoRes getSource(String url) throws SauceNaoException, IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(getUrl(url))
                .get()
                .build();
        Response response = client.newCall(request).execute();
        return new SauceNaoRes(checkError(response));
    }

    private SauceNaoPojo checkError(Response response) throws SauceNaoException, IOException {
        SauceNaoPojo pojo = getPojo(response.body().string());
        if (pojo.getHeader() == null){
            throw new SauceNaoException("Http code " + response.code());
        } else if(pojo.getHeader().getStatus() != 0){
            throw new SauceNaoException(pojo.getHeader().getMessage());
        }
        return pojo;
    }

    private String getUrl() {
        String url = URL + "?" + "api_key=" + apiKey;
        url += "&output_type=" + outputType.toString();
        if (testMode != null) {
            url += "&testmode=" + testMode.toString();
        }
        if (dbMaskEnable != null) {
            url += "&dbmask=" + dbMaskEnable.toString();
        }
        if (dbMaskDisable != null) {
            url += "&dbmaski=" + dbMaskDisable.toString();
        }
        if (numberOfResults != null) {
            url += "&numres=" + numberOfResults.toString();
        }
        if (db != null) {
            url += "&db=" + db.toString();
        }
        return url;
    }

    private String getUrl(String url){
        return getUrl() + "&url=" + url;
    }

    private SauceNaoPojo getPojo(String jsonString) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(jsonString, SauceNaoPojo.class);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("db", db)
                .add("apiKey", apiKey)
                .add("testMode", testMode)
                .add("dbMaskEnable", dbMaskEnable)
                .add("dbMaskDisable", dbMaskDisable)
                .add("numberOfResults", numberOfResults)
                .add("outputType", outputType)
                .toString();
    }

    public static class SauceNaoBuilder {
        private Integer db;
        private String apiKey;
        private Integer testMode;
        private Integer dbMaskEnable;
        private Integer dbMaskDisable;
        private Integer numberOfResults;

        public SauceNaoBuilder() {

        }

        /**
         * @param db search a specific index number or all without needing to generate a bitmask.
         */
        public SauceNaoBuilder db(int db) {
            this.db = db;
            return this;
        }

        /**
         * @param apiKey your api key
         */
        public SauceNaoBuilder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * @param testMode
         */
        public SauceNaoBuilder testMode(int testMode) {
            this.testMode = testMode;
            return this;
        }

        /**
         * @param dbMaskEnable
         */
        public SauceNaoBuilder dbMaskEnable(int dbMaskEnable) {
            this.dbMaskEnable = dbMaskEnable;
            return this;
        }

        /**
         * @param dbMaskDisable
         */
        public SauceNaoBuilder dbMaskDisable(int dbMaskDisable) {
            this.dbMaskDisable = dbMaskDisable;
            return this;
        }

        /**
         * @param numberOfResults
         */
        public SauceNaoBuilder numberOfResults(int numberOfResults) {
            this.numberOfResults = numberOfResults;
            return this;
        }

        public SauceNao build() {
            return new SauceNao(db, apiKey, testMode, dbMaskEnable, dbMaskDisable, numberOfResults);
        }
    }
}