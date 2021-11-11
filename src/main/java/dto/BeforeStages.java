package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BeforeStages {

    @JsonProperty("time")
    private Time time;

    @JsonProperty("status")
    private String status;

    @JsonProperty("steps")
    private StepsDoTestStage[] steps;

    @JsonProperty("attachments")
    private Attachments[] attachments;

    @JsonProperty("parameters")
    private Parameters[] parameters;

    @JsonProperty("stepsCount")
    private Integer stepsCount;

    @JsonProperty("attachmentsCount")
    private Integer attachmentsCount;

    @JsonProperty("shouldDisplayMessage")
    private Boolean shouldDisplayMessage;

    @JsonProperty("hasContent")
    private Boolean hasContent;

}
