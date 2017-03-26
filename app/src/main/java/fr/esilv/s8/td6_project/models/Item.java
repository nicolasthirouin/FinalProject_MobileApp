package fr.esilv.s8.td6_project.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TRN on 22/03/2017.
 */

public class Item {


        @SerializedName("kind")
        private String kind;
        @SerializedName("etag")
        private String etag;
        @SerializedName("id")
        private Id id;
        @SerializedName("snippet")
        private Snippet snippet;

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

        @SerializedName("id")
        public Id getId() {
            return id;
        }

        @SerializedName("id")
        public void setId(Id id) {
            this.id = id;
        }

        @SerializedName("snippet")
        public Snippet getSnippet() {
            return snippet;
        }


    public int size() {
        return this.size();
    }
}
