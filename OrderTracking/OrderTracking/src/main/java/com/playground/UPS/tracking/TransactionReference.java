
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
    "CustomerContext"
})
public class TransactionReference {

    @JsonProperty("CustomerContext")
    private String customerContext;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The customerContext
     */
    @JsonProperty("CustomerContext")
    public String getCustomerContext() {
        return customerContext;
    }

    /**
     * 
     * @param customerContext
     *     The CustomerContext
     */
    @JsonProperty("CustomerContext")
    public void setCustomerContext(String customerContext) {
        this.customerContext = customerContext;
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
