package fr.esilv.s8.td6_project.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TRN on 22/03/2017.
 */

public class Thumbnails {

        @SerializedName("default")
        private Default _default;
        @SerializedName("medium")
        private Medium medium;
        @SerializedName("high")
        private High high;

        @SerializedName("default")
        public Default getDefault() {
            return _default;
        }

        @SerializedName("default")
        public void setDefault(Default _default) {
            this._default = _default;
        }

        @SerializedName("medium")
        public Medium getMedium() {
            return medium;
        }

        @SerializedName("medium")
        public void setMedium(Medium medium) {
            this.medium = medium;
        }

        @SerializedName("high")
        public High getHigh() {
            return high;
        }

        @SerializedName("high")
        public void setHigh(High high) {
            this.high = high;
        }
}
