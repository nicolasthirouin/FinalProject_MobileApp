package fr.esilv.s8.td6_project.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by TRN on 22/03/2017.
 */

public class PageInfo {

        @SerializedName("totalResults")
        private Integer totalResults;
        @SerializedName("resultsPerPage")
        private Integer resultsPerPage;
        @SerializedName("totalResults")
        public Integer getTotalResults() {
            return totalResults;
        }

        @SerializedName("totalResults")
        public void setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
        }

        @SerializedName("resultsPerPage")
        public Integer getResultsPerPage() {
            return resultsPerPage;
        }

        @SerializedName("resultsPerPage")
        public void setResultsPerPage(Integer resultsPerPage) {
            this.resultsPerPage = resultsPerPage;
        }

}
