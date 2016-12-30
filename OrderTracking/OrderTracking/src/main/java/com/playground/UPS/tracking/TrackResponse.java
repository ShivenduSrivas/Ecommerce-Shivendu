
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
    "Response",
    "Shipment"
})
public class TrackResponse {

    @JsonProperty("Response")
    private Response response;
    @JsonProperty("Shipment")
    private Shipment shipment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The response
     */
    @JsonProperty("Response")
    public Response getResponse() {
        return response;
    }

    /**
     * 
     * @param response
     *     The Response
     */
    @JsonProperty("Response")
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * 
     * @return
     *     The shipment
     */
    @JsonProperty("Shipment")
    public Shipment getShipment() {
        return shipment;
    }

    /**
     * 
     * @param shipment
     *     The Shipment
     */
    @JsonProperty("Shipment")
    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
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
