
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
    "AddressLine",
    "City",
    "StateProvinceCode",
    "PostalCode",
    "CountryCode"
})
public class Address {

    @JsonProperty("AddressLine")
    private String addressLine;
    @JsonProperty("City")
    private String city;
    @JsonProperty("StateProvinceCode")
    private String stateProvinceCode;
    @JsonProperty("PostalCode")
    private String postalCode;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The addressLine
     */
    @JsonProperty("AddressLine")
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * 
     * @param addressLine
     *     The AddressLine
     */
    @JsonProperty("AddressLine")
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The City
     */
    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The stateProvinceCode
     */
    @JsonProperty("StateProvinceCode")
    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * 
     * @param stateProvinceCode
     *     The StateProvinceCode
     */
    @JsonProperty("StateProvinceCode")
    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    /**
     * 
     * @return
     *     The postalCode
     */
    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The PostalCode
     */
    @JsonProperty("PostalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * @return
     *     The countryCode
     */
    @JsonProperty("CountryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 
     * @param countryCode
     *     The CountryCode
     */
    @JsonProperty("CountryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
