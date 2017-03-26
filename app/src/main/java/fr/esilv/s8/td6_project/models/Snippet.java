package fr.esilv.s8.td6_project.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TRN on 22/03/2017.
 */

public class Snippet {

        @SerializedName("publishedAt")
        private String publishedAt;
        @SerializedName("channelId")
        private String channelId;
        @SerializedName("title")
        private String title;
        @SerializedName("description")
        private String description;
        @SerializedName("thumbnails")
        private Thumbnails thumbnails;
        @SerializedName("channelTitle")
        private String channelTitle;
        @SerializedName("liveBroadcastContent")
        private String liveBroadcastContent;

        @SerializedName("publishedAt")
        public String getPublishedAt() {
            return publishedAt;
        }

        @SerializedName("publishedAt")
        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        @SerializedName("channelId")
        public String getChannelId() {
            return channelId;
        }

        @SerializedName("channelId")
        public void setChannelId(String channelId) {
            this.channelId = channelId;
        }

        @SerializedName("title")
        public String getTitle() {
            return title;
        }

        @SerializedName("title")
        public void setTitle(String title) {
            this.title = title;
        }

        @SerializedName("description")
        public String getDescription() {
            return description;
        }

        @SerializedName("description")
        public void setDescription(String description) {
            this.description = description;
        }

        @SerializedName("thumbnails")
        public Thumbnails getThumbnails() {
            return thumbnails;
        }

        @SerializedName("thumbnails")
        public void setThumbnails(Thumbnails thumbnails) {
            this.thumbnails = thumbnails;
        }

        @SerializedName("channelTitle")
        public String getChannelTitle() {
            return channelTitle;
        }

        @SerializedName("channelTitle")
        public void setChannelTitle(String channelTitle) {
            this.channelTitle = channelTitle;
        }

        @SerializedName("liveBroadcastContent")
        public String getLiveBroadcastContent() {
            return liveBroadcastContent;
        }

        @SerializedName("liveBroadcastContent")
        public void setLiveBroadcastContent(String liveBroadcastContent) {
            this.liveBroadcastContent = liveBroadcastContent;
        }
}
