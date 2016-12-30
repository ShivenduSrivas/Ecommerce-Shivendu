
package com.playground.UPS.tracking;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "UPSSecurity",
    "TrackRequest"
})
public class UPSTrackRequest extends JSONObject {

    @JsonProperty("UPSSecurity")
    private UPSSecurity uPSSecurity;
    @JsonProperty("TrackRequest")
    private TrackRequest trackRequest;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The uPSSecurity
     */
    @JsonProperty("UPSSecurity")
    public UPSSecurity getUPSSecurity() {
        return uPSSecurity;
    }

    /**
     * 
     * @param uPSSecurity
     *     The UPSSecurity
     */
    @JsonProperty("UPSSecurity")
    public void setUPSSecurity(UPSSecurity uPSSecurity) {
        this.uPSSecurity = uPSSecurity;
    }

    /**
     * 
     * @return
     *     The trackRequest
     */
    @JsonProperty("TrackRequest")
    public TrackRequest getTrackRequest() {
        return trackRequest;
    }

    /**
     * 
     * @param trackRequest
     *     The TrackRequest
     */
    @JsonProperty("TrackRequest")
    public void setTrackRequest(TrackRequest trackRequest) {
        this.trackRequest = trackRequest;
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
