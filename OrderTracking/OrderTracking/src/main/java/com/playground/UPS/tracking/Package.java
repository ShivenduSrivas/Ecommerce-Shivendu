
package com.playground.UPS.tracking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TrackingNumber",
    "Activity",
    "PackageWeight",
    "ReferenceNumber"
})
public class Package {

    @JsonProperty("TrackingNumber")
    private String trackingNumber;
    @JsonProperty("Activity")
    private List<Activity> activity = null;
    @JsonProperty("PackageWeight")
    private PackageWeight packageWeight;
    @JsonProperty("ReferenceNumber")
    private List<ReferenceNumber_> referenceNumber = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The trackingNumber
     */
    @JsonProperty("TrackingNumber")
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * 
     * @param trackingNumber
     *     The TrackingNumber
     */
    @JsonProperty("TrackingNumber")
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    /**
     * 
     * @return
     *     The activity
     */
    @JsonProperty("Activity")
    public List<Activity> getActivity() {
        return activity;
    }

    /**
     * 
     * @param activity
     *     The Activity
     */
    @JsonProperty("Activity")
    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }

    /**
     * 
     * @return
     *     The packageWeight
     */
    @JsonProperty("PackageWeight")
    public PackageWeight getPackageWeight() {
        return packageWeight;
    }

    /**
     * 
     * @param packageWeight
     *     The PackageWeight
     */
    @JsonProperty("PackageWeight")
    public void setPackageWeight(PackageWeight packageWeight) {
        this.packageWeight = packageWeight;
    }

    /**
     * 
     * @return
     *     The referenceNumber
     */
    @JsonProperty("ReferenceNumber")
    public List<ReferenceNumber_> getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * 
     * @param referenceNumber
     *     The ReferenceNumber
     */
    @JsonProperty("ReferenceNumber")
    public void setReferenceNumber(List<ReferenceNumber_> referenceNumber) {
        this.referenceNumber = referenceNumber;
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
