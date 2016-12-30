
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
    "Code",
    "Value"
})
public class ReferenceNumber {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Value")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The value
     */
    @JsonProperty("Value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The Value
     */
    @JsonProperty("Value")
    public void setValue(String value) {
        this.value = value;
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
