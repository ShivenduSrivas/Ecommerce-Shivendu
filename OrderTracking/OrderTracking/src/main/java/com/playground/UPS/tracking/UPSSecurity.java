
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
    "UsernameToken",
    "ServiceAccessToken"
})
public class UPSSecurity {

    @JsonProperty("UsernameToken")
    private UsernameToken usernameToken;
    @JsonProperty("ServiceAccessToken")
    private ServiceAccessToken serviceAccessToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The usernameToken
     */
    @JsonProperty("UsernameToken")
    public UsernameToken getUsernameToken() {
        return usernameToken;
    }

    /**
     * 
     * @param usernameToken
     *     The UsernameToken
     */
    @JsonProperty("UsernameToken")
    public void setUsernameToken(UsernameToken usernameToken) {
        this.usernameToken = usernameToken;
    }

    /**
     * 
     * @return
     *     The serviceAccessToken
     */
    @JsonProperty("ServiceAccessToken")
    public ServiceAccessToken getServiceAccessToken() {
        return serviceAccessToken;
    }

    /**
     * 
     * @param serviceAccessToken
     *     The ServiceAccessToken
     */
    @JsonProperty("ServiceAccessToken")
    public void setServiceAccessToken(ServiceAccessToken serviceAccessToken) {
        this.serviceAccessToken = serviceAccessToken;
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
