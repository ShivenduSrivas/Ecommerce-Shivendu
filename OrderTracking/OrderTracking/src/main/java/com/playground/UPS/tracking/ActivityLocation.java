
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
    "Address",
    "Code",
    "Description",
    "SignedForByName"
})
public class ActivityLocation {

    @JsonProperty("Address")
    private Address_ address;
    @JsonProperty("Code")
    private String code;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("SignedForByName")
    private String signedForByName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("Address")
    public Address_ getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The Address
     */
    @JsonProperty("Address")
    public void setAddress(Address_ address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The code
     */
    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The Code
     */
    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The Description
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The signedForByName
     */
    @JsonProperty("SignedForByName")
    public String getSignedForByName() {
        return signedForByName;
    }

    /**
     * 
     * @param signedForByName
     *     The SignedForByName
     */
    @JsonProperty("SignedForByName")
    public void setSignedForByName(String signedForByName) {
        this.signedForByName = signedForByName;
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
