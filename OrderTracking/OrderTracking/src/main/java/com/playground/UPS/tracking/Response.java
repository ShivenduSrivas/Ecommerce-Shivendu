
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
    "ResponseStatus",
    "TransactionReference"
})
public class Response {

    @JsonProperty("ResponseStatus")
    private ResponseStatus responseStatus;
    @JsonProperty("TransactionReference")
    private TransactionReference transactionReference;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The responseStatus
     */
    @JsonProperty("ResponseStatus")
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * 
     * @param responseStatus
     *     The ResponseStatus
     */
    @JsonProperty("ResponseStatus")
    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
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
