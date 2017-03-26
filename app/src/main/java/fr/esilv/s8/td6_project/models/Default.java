package fr.esilv.s8.td6_project.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TRN on 22/03/2017.
 */

public class Default {
    @SerializedName("url")
    private String url;
    @SerializedName("width")
    private Integer width;
    @SerializedName("height")
    private Integer height;

    @SerializedName("url")
    public String getUrl() {
        return url;
    }

    @SerializedName("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @SerializedName("width")
    public Integer getWidth() {
        return width;
    }

    @SerializedName("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @SerializedName("height")
    public Integer getHeight() {
        return height;
    }

    @SerializedName("height")
    public void setHeight(Integer height) {
        this.height = height;
    }
}
