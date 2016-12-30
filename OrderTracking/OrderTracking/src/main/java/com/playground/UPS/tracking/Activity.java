
package com.playground.UPS.tracking;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ActivityLocation",
    "Status",
    "Date",
    "Time"
})
public class Activity {

    @JsonProperty("ActivityLocation")
    private ActivityLocation activityLocation;
    @JsonProperty("Status")
    private Status status;
    @JsonProperty("Date")
    private String date;
    @JsonProperty("Time")
    private String time;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The activityLocation
     */
    @JsonProperty("ActivityLocation")
    public ActivityLocation getActivityLocation() {
        return activityLocation;
    }

    /**
     * 
     * @param activityLocation
     *     The ActivityLocation
     */
    @JsonProperty("ActivityLocation")
    public void setActivityLocation(ActivityLocation activityLocation) {
        this.activityLocation = activityLocation;
    }

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("Status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The Status
     */
    @JsonProperty("Status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The Date
     */
    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The time
     */
    @JsonProperty("Time")
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The Time
     */
    @JsonProperty("Time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
