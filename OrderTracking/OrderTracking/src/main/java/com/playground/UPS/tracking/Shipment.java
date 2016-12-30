
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
    "InquiryNumber",
    "ShipperNumber",
    "ShipmentAddress",
    "ShipmentWeight",
    "Service",
    "ReferenceNumber",
    "PickupDate",
    "Package"
})
public class Shipment {

    @JsonProperty("InquiryNumber")
    private InquiryNumber inquiryNumber;
    @JsonProperty("ShipperNumber")
    private String shipperNumber;
    @JsonProperty("ShipmentAddress")
    private List<ShipmentAddress> shipmentAddress = null;
    @JsonProperty("ShipmentWeight")
    private ShipmentWeight shipmentWeight;
    @JsonProperty("Service")
    private Service service;
    @JsonProperty("ReferenceNumber")
    private ReferenceNumber referenceNumber;
    @JsonProperty("PickupDate")
    private String pickupDate;
    @JsonProperty("Package")
    private Package _package;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The inquiryNumber
     */
    @JsonProperty("InquiryNumber")
    public InquiryNumber getInquiryNumber() {
        return inquiryNumber;
    }

    /**
     * 
     * @param inquiryNumber
     *     The InquiryNumber
     */
    @JsonProperty("InquiryNumber")
    public void setInquiryNumber(InquiryNumber inquiryNumber) {
        this.inquiryNumber = inquiryNumber;
    }

    /**
     * 
     * @return
     *     The shipperNumber
     */
    @JsonProperty("ShipperNumber")
    public String getShipperNumber() {
        return shipperNumber;
    }

    /**
     * 
     * @param shipperNumber
     *     The ShipperNumber
     */
    @JsonProperty("ShipperNumber")
    public void setShipperNumber(String shipperNumber) {
        this.shipperNumber = shipperNumber;
    }

    /**
     * 
     * @return
     *     The shipmentAddress
     */
    @JsonProperty("ShipmentAddress")
    public List<ShipmentAddress> getShipmentAddress() {
        return shipmentAddress;
    }

    /**
     * 
     * @param shipmentAddress
     *     The ShipmentAddress
     */
    @JsonProperty("ShipmentAddress")
    public void setShipmentAddress(List<ShipmentAddress> shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    /**
     * 
     * @return
     *     The shipmentWeight
     */
    @JsonProperty("ShipmentWeight")
    public ShipmentWeight getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * 
     * @param shipmentWeight
     *     The ShipmentWeight
     */
    @JsonProperty("ShipmentWeight")
    public void setShipmentWeight(ShipmentWeight shipmentWeight) {
        this.shipmentWeight = shipmentWeight;
    }

    /**
     * 
     * @return
     *     The service
     */
    @JsonProperty("Service")
    public Service getService() {
        return service;
    }

    /**
     * 
     * @param service
     *     The Service
     */
    @JsonProperty("Service")
    public void setService(Service service) {
        this.service = service;
    }

    /**
     * 
     * @return
     *     The referenceNumber
     */
    @JsonProperty("ReferenceNumber")
    public ReferenceNumber getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * 
     * @param referenceNumber
     *     The ReferenceNumber
     */
    @JsonProperty("ReferenceNumber")
    public void setReferenceNumber(ReferenceNumber referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    /**
     * 
     * @return
     *     The pickupDate
     */
    @JsonProperty("PickupDate")
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * 
     * @param pickupDate
     *     The PickupDate
     */
    @JsonProperty("PickupDate")
    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    /**
     * 
     * @return
     *     The _package
     */
    @JsonProperty("Package")
    public Package getPackage() {
        return _package;
    }

    /**
     * 
     * @param _package
     *     The Package
     */
    @JsonProperty("Package")
    public void setPackage(Package _package) {
        this._package = _package;
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
