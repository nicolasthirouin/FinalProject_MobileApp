package fr.esilv.s8.td6_project.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TRN on 22/03/2017.
 */

public class Id {

        @SerializedName("kind")
        private String kind;
        @SerializedName("videoId")
        private String videoId;

        @SerializedName("kind")
        public String getKind() {
            return kind;
        }

        @SerializedName("kind")
        public void setKind(String kind) {
            this.kind = kind;
        }

        @SerializedName("videoId")
        public String getVideoId() {
            return videoId;
        }

        @SerializedName("videoId")
        public void setVideoId(String videoId) {
            this.videoId = videoId;
        }

    }
