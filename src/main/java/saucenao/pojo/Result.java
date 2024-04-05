
package saucenao.pojo;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.base.MoreObjects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "header",
    "data"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("header")
    private Header__1 header;
    @JsonProperty("data")
    private Data data;

    @JsonProperty("header")
    public Header__1 getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(Header__1 header) {
        this.header = header;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("header", header)
                .add("data", data)
                .toString();
    }
}
