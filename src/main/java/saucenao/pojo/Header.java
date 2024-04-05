
package saucenao.pojo;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.base.MoreObjects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

    "user_id",
    "message",
    "account_type",
    "short_limit",
    "long_limit",
    "long_remaining",
    "short_remaining",
    "status",
    "results_requested",
    "search_depth",
    "minimum_similarity",
    "query_image_display",
    "query_image",
    "results_returned"
})
@Generated("jsonschema2pojo")
public class Header {

    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("message")
    private String message;
    @JsonProperty("account_type")
    private String accountType;
    @JsonProperty("short_limit")
    private String shortLimit;
    @JsonProperty("long_limit")
    private String longLimit;
    @JsonProperty("long_remaining")
    private Integer longRemaining;
    @JsonProperty("short_remaining")
    private Integer shortRemaining;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("results_requested")
    private String resultsRequested;
    @JsonProperty("search_depth")
    private String searchDepth;
    @JsonProperty("minimum_similarity")
    private Double minimumSimilarity;
    @JsonProperty("query_image_display")
    private String queryImageDisplay;
    @JsonProperty("query_image")
    private String queryImage;
    @JsonProperty("results_returned")
    private Integer resultsReturned;

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("account_type")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("account_type")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("short_limit")
    public String getShortLimit() {
        return shortLimit;
    }

    @JsonProperty("short_limit")
    public void setShortLimit(String shortLimit) {
        this.shortLimit = shortLimit;
    }

    @JsonProperty("long_limit")
    public String getLongLimit() {
        return longLimit;
    }

    @JsonProperty("long_limit")
    public void setLongLimit(String longLimit) {
        this.longLimit = longLimit;
    }

    @JsonProperty("long_remaining")
    public Integer getLongRemaining() {
        return longRemaining;
    }

    @JsonProperty("long_remaining")
    public void setLongRemaining(Integer longRemaining) {
        this.longRemaining = longRemaining;
    }

    @JsonProperty("short_remaining")
    public Integer getShortRemaining() {
        return shortRemaining;
    }

    @JsonProperty("short_remaining")
    public void setShortRemaining(Integer shortRemaining) {
        this.shortRemaining = shortRemaining;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("results_requested")
    public String getResultsRequested() {
        return resultsRequested;
    }

    @JsonProperty("results_requested")
    public void setResultsRequested(String resultsRequested) {
        this.resultsRequested = resultsRequested;
    }

    @JsonProperty("search_depth")
    public String getSearchDepth() {
        return searchDepth;
    }

    @JsonProperty("search_depth")
    public void setSearchDepth(String searchDepth) {
        this.searchDepth = searchDepth;
    }

    @JsonProperty("minimum_similarity")
    public Double getMinimumSimilarity() {
        return minimumSimilarity;
    }

    @JsonProperty("minimum_similarity")
    public void setMinimumSimilarity(Double minimumSimilarity) {
        this.minimumSimilarity = minimumSimilarity;
    }

    @JsonProperty("query_image_display")
    public String getQueryImageDisplay() {
        return queryImageDisplay;
    }

    @JsonProperty("query_image_display")
    public void setQueryImageDisplay(String queryImageDisplay) {
        this.queryImageDisplay = queryImageDisplay;
    }

    @JsonProperty("query_image")
    public String getQueryImage() {
        return queryImage;
    }

    @JsonProperty("query_image")
    public void setQueryImage(String queryImage) {
        this.queryImage = queryImage;
    }

    @JsonProperty("results_returned")
    public Integer getResultsReturned() {
        return resultsReturned;
    }

    @JsonProperty("results_returned")
    public void setResultsReturned(Integer resultsReturned) {
        this.resultsReturned = resultsReturned;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("userId", userId)
                .add("message", message)
                .add("accountType", accountType)
                .add("shortLimit", shortLimit)
                .add("longLimit", longLimit)
                .add("longRemaining", longRemaining)
                .add("shortRemaining", shortRemaining)
                .add("status", status)
                .add("resultsRequested", resultsRequested)
                .add("searchDepth", searchDepth)
                .add("minimumSimilarity", minimumSimilarity)
                .add("queryImageDisplay", queryImageDisplay)
                .add("queryImage", queryImage)
                .add("resultsReturned", resultsReturned)
                .toString();
    }
}
