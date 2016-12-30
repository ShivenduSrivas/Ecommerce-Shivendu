
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
    "TrackResponse"
})
public class UPSTrackRespone {

    @JsonProperty("TrackResponse")
    private TrackResponse trackResponse;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The trackResponse
     */
    @JsonProperty("TrackResponse")
    public TrackResponse getTrackResponse() {
        return trackResponse;
    }

    /**
     * 
     * @param trackResponse
     *     The TrackResponse
     */
    @JsonProperty("TrackResponse")
    public void setTrackResponse(TrackResponse trackResponse) {
        this.trackResponse = trackResponse;
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
