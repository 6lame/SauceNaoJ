
package saucenao.pojo;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.base.MoreObjects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "similarity",
    "thumbnail",
    "index_id",
    "index_name",
    "dupes",
    "hidden"
})
@Generated("jsonschema2pojo")
public class Header__1 {

    @JsonProperty("similarity")
    private String similarity;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("index_id")
    private Integer indexId;
    @JsonProperty("index_name")
    private String indexName;
    @JsonProperty("dupes")
    private Integer dupes;
    @JsonProperty("hidden")
    private Integer hidden;

    @JsonProperty("similarity")
    public String getSimilarity() {
        return similarity;
    }

    @JsonProperty("similarity")
    public void setSimilarity(String similarity) {
        this.similarity = similarity;
    }

    @JsonProperty("thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    @JsonProperty("thumbnail")
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @JsonProperty("index_id")
    public Integer getIndexId() {
        return indexId;
    }

    @JsonProperty("index_id")
    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    @JsonProperty("index_name")
    public String getIndexName() {
        return indexName;
    }

    @JsonProperty("index_name")
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    @JsonProperty("dupes")
    public Integer getDupes() {
        return dupes;
    }

    @JsonProperty("dupes")
    public void setDupes(Integer dupes) {
        this.dupes = dupes;
    }

    @JsonProperty("hidden")
    public Integer getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("similarity", similarity)
                .add("thumbnail", thumbnail)
                .add("indexId", indexId)
                .add("indexName", indexName)
                .add("dupes", dupes)
                .add("hidden", hidden)
                .toString();
    }
}
