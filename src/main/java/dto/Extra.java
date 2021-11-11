package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Extra {

    @JsonProperty("severity")
    private String severity;

    @JsonProperty("retries")
    private Arrays[] retries;

    @JsonProperty("categories")
    private Categories[] categories;

    @JsonProperty("tags")
    private List tags;

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Arrays[] getRetries() {
        return retries;
    }

    public void setRetries(Arrays[] retries) {
        this.retries = retries;
    }

    public Categories[] getCategories() {
        return categories;
    }

    public void setCategories(Categories[] categories) {
        this.categories = categories;
    }

    public List getTags() {
        return tags;
    }

    public void setTags(List tags) {
        this.tags = Arrays.asList(tags);
    }
}
