
package saucenao.pojo;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.common.base.MoreObjects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ext_urls",
    "title",
    "pixiv_id",
    "member_name",
    "member_id",
    "yandere_id",
    "material",
    "characters",
    "source",
    "danbooru_id",
    "gelbooru_id",
    "eng_name",
    "jp_name",
    "bcy_id",
    "member_link_id",
    "bcy_type"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("ext_urls")
    private List<String> extUrls;
    @JsonProperty("title")
    private String title;
    @JsonProperty("pixiv_id")
    private Integer pixivId;
    @JsonProperty("member_name")
    private String memberName;
    @JsonProperty("member_id")
    private Integer memberId;
    @JsonProperty("yandere_id")
    private Integer yandereId;
    @JsonProperty("material")
    private String material;
    @JsonProperty("characters")
    private String characters;
    @JsonProperty("source")
    private String source;
    @JsonProperty("danbooru_id")
    private Integer danbooruId;
    @JsonProperty("gelbooru_id")
    private Integer gelbooruId;
    @JsonProperty("eng_name")
    private String engName;
    @JsonProperty("jp_name")
    private String jpName;
    @JsonProperty("bcy_id")
    private Integer bcyId;
    @JsonProperty("member_link_id")
    private Integer memberLinkId;
    @JsonProperty("bcy_type")
    private String bcyType;

    @JsonProperty("ext_urls")
    public List<String> getExtUrls() {
        return extUrls;
    }

    @JsonProperty("ext_urls")
    public void setExtUrls(List<String> extUrls) {
        this.extUrls = extUrls;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("pixiv_id")
    public Integer getPixivId() {
        return pixivId;
    }

    @JsonProperty("pixiv_id")
    public void setPixivId(Integer pixivId) {
        this.pixivId = pixivId;
    }

    @JsonProperty("member_name")
    public String getMemberName() {
        return memberName;
    }

    @JsonProperty("member_name")
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @JsonProperty("member_id")
    public Integer getMemberId() {
        return memberId;
    }

    @JsonProperty("member_id")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @JsonProperty("yandere_id")
    public Integer getYandereId() {
        return yandereId;
    }

    @JsonProperty("yandere_id")
    public void setYandereId(Integer yandereId) {
        this.yandereId = yandereId;
    }

    @JsonProperty("material")
    public String getMaterial() {
        return material;
    }

    @JsonProperty("material")
    public void setMaterial(String material) {
        this.material = material;
    }

    @JsonProperty("characters")
    public String getCharacters() {
        return characters;
    }

    @JsonProperty("characters")
    public void setCharacters(String characters) {
        this.characters = characters;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("danbooru_id")
    public Integer getDanbooruId() {
        return danbooruId;
    }

    @JsonProperty("danbooru_id")
    public void setDanbooruId(Integer danbooruId) {
        this.danbooruId = danbooruId;
    }

    @JsonProperty("gelbooru_id")
    public Integer getGelbooruId() {
        return gelbooruId;
    }

    @JsonProperty("gelbooru_id")
    public void setGelbooruId(Integer gelbooruId) {
        this.gelbooruId = gelbooruId;
    }

    @JsonProperty("eng_name")
    public String getEngName() {
        return engName;
    }

    @JsonProperty("eng_name")
    public void setEngName(String engName) {
        this.engName = engName;
    }

    @JsonProperty("jp_name")
    public String getJpName() {
        return jpName;
    }

    @JsonProperty("jp_name")
    public void setJpName(String jpName) {
        this.jpName = jpName;
    }

    @JsonProperty("bcy_id")
    public Integer getBcyId() {
        return bcyId;
    }

    @JsonProperty("bcy_id")
    public void setBcyId(Integer bcyId) {
        this.bcyId = bcyId;
    }

    @JsonProperty("member_link_id")
    public Integer getMemberLinkId() {
        return memberLinkId;
    }

    @JsonProperty("member_link_id")
    public void setMemberLinkId(Integer memberLinkId) {
        this.memberLinkId = memberLinkId;
    }

    @JsonProperty("bcy_type")
    public String getBcyType() {
        return bcyType;
    }

    @JsonProperty("bcy_type")
    public void setBcyType(String bcyType) {
        this.bcyType = bcyType;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("extUrls", extUrls)
                .add("title", title)
                .add("pixivId", pixivId)
                .add("memberName", memberName)
                .add("memberId", memberId)
                .add("yandereId", yandereId)
                .add("material", material)
                .add("characters", characters)
                .add("source", source)
                .add("danbooruId", danbooruId)
                .add("gelbooruId", gelbooruId)
                .add("engName", engName)
                .add("jpName", jpName)
                .add("bcyId", bcyId)
                .add("memberLinkId", memberLinkId)
                .add("bcyType", bcyType)
                .toString();
    }
}
