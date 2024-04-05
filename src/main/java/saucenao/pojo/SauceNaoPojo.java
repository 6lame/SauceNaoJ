
package saucenao.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.base.MoreObjects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "header",
    "results"
})
@Generated("jsonschema2pojo")
public class SauceNaoPojo {

    @JsonProperty("header")
    private Header header;
    @JsonProperty("results")
    private List<Result> results = new ArrayList<>();

    @JsonProperty("header")
    public Header getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(Header header) {
        this.header = header;
    }

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("header", header)
                .add("results", results)
                .toString();
    }
}
