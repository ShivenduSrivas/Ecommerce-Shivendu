
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
    "Request",
    "InquiryNumber"
})
public class TrackRequest {

    @JsonProperty("Request")
    private Request request;
    @JsonProperty("InquiryNumber")
    private String inquiryNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The request
     */
    @JsonProperty("Request")
    public Request getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The Request
     */
    @JsonProperty("Request")
    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * 
     * @return
     *     The inquiryNumber
     */
    @JsonProperty("InquiryNumber")
    public String getInquiryNumber() {
        return inquiryNumber;
    }

    /**
     * 
     * @param inquiryNumber
     *     The InquiryNumber
     */
    @JsonProperty("InquiryNumber")
    public void setInquiryNumber(String inquiryNumber) {
        this.inquiryNumber = inquiryNumber;
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
