package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AfterStages {

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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StepsDoTestStage[] getSteps() {
        return steps;
    }

    public void setSteps(StepsDoTestStage[] steps) {
        this.steps = steps;
    }

    public Attachments[] getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachments[] attachments) {
        this.attachments = attachments;
    }

    public Parameters[] getParameters() {
        return parameters;
    }

    public void setParameters(Parameters[] parameters) {
        this.parameters = parameters;
    }

    public Integer getStepsCount() {
        return stepsCount;
    }

    public void setStepsCount(Integer stepsCount) {
        this.stepsCount = stepsCount;
    }

    public Integer getAttachmentsCount() {
        return attachmentsCount;
    }

    public void setAttachmentsCount(Integer attachmentsCount) {
        this.attachmentsCount = attachmentsCount;
    }

    public Boolean getShouldDisplayMessage() {
        return shouldDisplayMessage;
    }

    public void setShouldDisplayMessage(Boolean shouldDisplayMessage) {
        this.shouldDisplayMessage = shouldDisplayMessage;
    }

    public Boolean getHasContent() {
        return hasContent;
    }

    public void setHasContent(Boolean hasContent) {
        this.hasContent = hasContent;
    }
}
