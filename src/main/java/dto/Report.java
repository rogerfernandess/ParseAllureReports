package dto;

import com.fasterxml.jackson.annotation.*;

import java.util.Arrays;

public class Report {


    @JsonProperty("uid")
    private String uid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("fullName")
    private String fullName;

    @JsonProperty("historyId")
    private String historyId;

    @JsonProperty("time")
    private Time time;

    @JsonProperty("status")
    private String status;

    @JsonProperty("statusMessage")
    private String statusMessage;

    @JsonProperty("statusTrace")
    private String statusTrace;

    @JsonProperty("flaky")
    private Boolean flaky;

    @JsonProperty("newFailed")
    private Boolean newFailed;

    @JsonProperty("beforeStages")
    private BeforeStages[] beforeStages;

    @JsonProperty("testStage")
    private TestStage testStage;

    @JsonProperty("afterStages")
    private AfterStages[] afterStages;

    @JsonProperty("labels")
    private Labels[] labels;

    @JsonProperty("parameters")
    private Arrays[] parameters;

    @JsonProperty("links")
    private Arrays[] links;

    @JsonProperty("hidden")
    private Boolean hidden;

    @JsonProperty("retry")
    private Boolean retry;

    @JsonProperty("extra")
    private Extra extra;

    @JsonProperty("source")
    private String source;

    @JsonProperty("parameterValues")
    private Arrays[] parameterValues;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getHistoryId() {
        return historyId;
    }

    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

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

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusTrace() {
        return statusTrace;
    }

    public void setStatusTrace(String statusTrace) {
        this.statusTrace = statusTrace;
    }

    public Boolean getFlaky() {
        return flaky;
    }

    public void setFlaky(Boolean flaky) {
        this.flaky = flaky;
    }

    public Boolean getNewFailed() {
        return newFailed;
    }

    public void setNewFailed(Boolean newFailed) {
        this.newFailed = newFailed;
    }

    public Labels[] getLabels() {
        return labels;
    }

    public void setLabels(Labels[] labels) {
        this.labels = labels;
    }

    public Arrays[] getParameters() {
        return parameters;
    }

    public void setParameters(Arrays[] parameters) {
        this.parameters = parameters;
    }

    public Arrays[] getLinks() {
        return links;
    }

    public void setLinks(Arrays[] links) {
        this.links = links;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getRetry() {
        return retry;
    }

    public void setRetry(Boolean retry) {
        this.retry = retry;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Arrays[] getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(Arrays[] parameterValues) {
        this.parameterValues = parameterValues;
    }
}
