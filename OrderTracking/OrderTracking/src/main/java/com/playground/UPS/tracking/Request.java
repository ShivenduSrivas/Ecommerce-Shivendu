
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
    "RequestOption",
    "TransactionReference"
})
public class Request {

    @JsonProperty("RequestOption")
    private String requestOption;
    @JsonProperty("TransactionReference")
    private TransactionReference transactionReference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The requestOption
     */
    @JsonProperty("RequestOption")
    public String getRequestOption() {
        return requestOption;
    }

    /**
     * 
     * @param requestOption
     *     The RequestOption
     */
    @JsonProperty("RequestOption")
    public void setRequestOption(String requestOption) {
        this.requestOption = requestOption;
    }

    /**
     * 
     * @return
     *     The transactionReference
     */
    @JsonProperty("TransactionReference")
    public TransactionReference getTransactionReference() {
        return transactionReference;
    }

    /**
     * 
     * @param transactionReference
     *     The TransactionReference
     */
    @JsonProperty("TransactionReference")
    public void setTransactionReference(TransactionReference transactionReference) {
        this.transactionReference = transactionReference;
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
