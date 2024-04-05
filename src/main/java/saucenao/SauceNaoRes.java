package saucenao;

import com.google.common.base.MoreObjects;
import saucenao.pojo.Result;
import saucenao.pojo.SauceNaoPojo;

import java.util.ArrayList;


public class SauceNaoRes {
    private final SauceNaoPojo pojo;

    public SauceNaoRes(SauceNaoPojo pojo) {
        this.pojo = pojo;
        sortBySimilarity();
    }

    /**
     * @return the pojo representation of the json response
     */
    public SauceNaoPojo getPojo() {
        return pojo;
    }

    /**
     * @return link to the source with maximum similarity
     */
    public String getBestResult(){
        for (Result result : pojo.getResults()){
            if (result.getData().getExtUrls() != null){
                return result.getData().getExtUrls().get(0);
            }
        }
        return "Not found";
    }

    /**
     * @return a list of links sorted by similarity
     */
    public ArrayList<String> getAllResults(){
        ArrayList<String> results = new ArrayList<>();
        for (Result result : pojo.getResults()) {
            if (result.getData().getExtUrls() != null) {
                results.add(result.getData().getExtUrls().get(0));
            }
        }
        return results;
    }

    private void sortBySimilarity() {
        pojo.getResults().sort((o1, o2) -> {
            double o1d = Double.parseDouble(o1.getHeader().getSimilarity());
            double o2d = Double.parseDouble(o2.getHeader().getSimilarity());
            return Double.compare(o2d, o1d);
        });
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("pojo", pojo)
                .toString();
    }
}
