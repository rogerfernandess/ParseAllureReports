package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Time {

    @JsonProperty("start")
    private Long start;

    @JsonProperty("stop")
    private Long stop;

    @JsonProperty("duration")
    private Long duration;

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getStop() {
        return stop;
    }

    public void setStop(Long stop) {
        this.stop = stop;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}
