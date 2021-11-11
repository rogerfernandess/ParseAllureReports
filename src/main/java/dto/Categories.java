package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class Categories {

    @JsonProperty("name")
    private String name;

    @JsonProperty("matchedStatuses")
    private Arrays[] matchedStatuses;

    @JsonProperty("flaky")
    private Boolean flaky;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Arrays[] getMatchedStatuses() {
        return matchedStatuses;
    }

    public void setMatchedStatuses(Arrays[] matchedStatuses) {
        this.matchedStatuses = matchedStatuses;
    }

    public Boolean getFlaky() {
        return flaky;
    }

    public void setFlaky(Boolean flaky) {
        this.flaky = flaky;
    }
}
