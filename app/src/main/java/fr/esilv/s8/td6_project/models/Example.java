package fr.esilv.s8.td6_project.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by TRN on 22/03/2017.
 */

public class Example {

    @SerializedName("kind")
    private String kind;
    @SerializedName("etag")
    private String etag;
    @SerializedName("nextPageToken")
    private String nextPageToken;
    @SerializedName("regionCode")
    private String regionCode;
    @SerializedName("pageInfo")
    private PageInfo pageInfo;
    @SerializedName("items")
    private ArrayList<Item> items = null;

    @SerializedName("kind")
    public String getKind() {
        return kind;
    }

    @SerializedName("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @SerializedName("etag")
    public String getEtag() {
        return etag;
    }

    @SerializedName("etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    @SerializedName("nextPageToken")
    public String getNextPageToken() {
        return nextPageToken;
    }

    @SerializedName("nextPageToken")
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    @SerializedName("regionCode")
    public String getRegionCode() {
        return regionCode;
    }

    @SerializedName("regionCode")
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @SerializedName("pageInfo")
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    @SerializedName("pageInfo")
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @SerializedName("items")
    public ArrayList<Item> getItems() {
        return items;
    }

    @SerializedName("items")
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

}
