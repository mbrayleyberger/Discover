/**
 * RequestedShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;


/**
 * The descriptive data for the shipment being tendered to FedEx.
 */
public class RequestedShipment  implements java.io.Serializable {
    /* Identifies the date and time the package is tendered to FedEx.
     * Both the date and time portions of the string are expected to be used.
     * The date should not be a past date or a date more than 10 days in
     * the future. The time is the local time of the shipment based on the
     * shipper's time zone. The date component must be in the format: YYYY-MM-DD
     * (e.g. 2006-06-26). The time component must be in the format: HH:MM:SS
     * using a 24 hour clock (e.g. 11:00 a.m. is 11:00:00, whereas 5:00 p.m.
     * is 17:00:00). The date and time parts are separated by the letter
     * T (e.g. 2006-06-26T17:00:00). There is also a UTC offset component
     * indicating the number of hours/mainutes from UTC (e.g 2006-06-26T17:00:00-0400
     * is defined form June 26, 2006 5:00 pm Eastern Time). */
    private java.util.Calendar shipTimestamp;

    /* Identifies the method by which the package is to be tendered
     * to FedEx. This element does not dispatch a courier for package pickup.
     * See DropoffType for list of valid enumerated values. */
    private com.fedex.ship.stub.DropoffType dropoffType;

    /* Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values. */
    private com.fedex.ship.stub.ServiceType serviceType;

    /* Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values. */
    private com.fedex.ship.stub.PackagingType packagingType;

    /* Identifies the total weight of the shipment being conveyed
     * to FedEx.This is only applicable to International shipments and should
     * only be used on the first package of a mutiple piece shipment.This
     * value contains 1 explicit decimal position */
    private com.fedex.ship.stub.Weight totalWeight;

    /* Total insured amount. */
    private com.fedex.ship.stub.Money totalInsuredValue;

    private com.fedex.ship.stub.Dimensions totalDimensions;

    /* Descriptive data identifying the party responsible for shipping
     * the package. Shipper and Origin should have the same address. */
    private com.fedex.ship.stub.Party shipper;

    /* Descriptive data identifying the party receiving the package. */
    private com.fedex.ship.stub.Party recipient;

    /* A unique identifier for a recipient location */
    private java.lang.String recipientLocationNumber;

    /* Physical starting address for the shipment, if different from
     * shipper's address. */
    private com.fedex.ship.stub.ContactAndAddress origin;

    /* Descriptive data indicating the method and means of payment
     * to FedEx for providing shipping services. */
    private com.fedex.ship.stub.Payment shippingChargesPayment;

    /* Descriptive data regarding special services requested by the
     * shipper for this shipment. If the shipper is requesting a special
     * service which requires additional data (e.g. COD), the special service
     * type must be present in the specialServiceTypes collection, and the
     * supporting detail must be provided in the appropriate sub-object.
     * For example, to request COD, "COD" must be included in the SpecialServiceTypes
     * collection and the CodDetail object must contain the required data. */
    private com.fedex.ship.stub.ShipmentSpecialServicesRequested specialServicesRequested;

    /* Details specific to an Express freight shipment. */
    private com.fedex.ship.stub.ExpressFreightDetail expressFreightDetail;

    /* Data applicable to shipments using FEDEX_FREIGHT and FEDEX_NATIONAL_FREIGHT
     * services. */
    private com.fedex.ship.stub.FreightShipmentDetail freightShipmentDetail;

    /* Used with Ground Home Delivery and Freight. */
    private java.lang.String deliveryInstructions;

    /* Details about how to calculate variable handling charges at
     * the shipment level. */
    private com.fedex.ship.stub.VariableHandlingChargeDetail variableHandlingChargeDetail;

    /* Customs clearance data, used for both international and intra-country
     * shipping. */
    private com.fedex.ship.stub.CustomsClearanceDetail customsClearanceDetail;

    /* For use in "process tag" transaction. */
    private com.fedex.ship.stub.PickupDetail pickupDetail;

    private com.fedex.ship.stub.SmartPostShipmentDetail smartPostDetail;

    /* If true, only the shipper/payor will have visibility of this
     * shipment. */
    private java.lang.Boolean blockInsightVisibility;

    /* Specifies the client-requested response in the event of errors
     * within shipment. */
    private com.fedex.ship.stub.ErrorLabelBehaviorType errorLabelBehavior;

    /* Details about the image format and printer type the label is
     * to returned in. */
    private com.fedex.ship.stub.LabelSpecification labelSpecification;

    /* Contains data used to create additional (non-label) shipping
     * documents. */
    private com.fedex.ship.stub.ShippingDocumentSpecification shippingDocumentSpecification;

    /* Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer. */
    private com.fedex.ship.stub.RateRequestType[] rateRequestTypes;

    /* Specifies the type of rate the customer wishes to have used
     * as the actual rate type. */
    private com.fedex.ship.stub.ReturnedRateType customerSelectedActualRateType;

    /* Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services. */
    private com.fedex.ship.stub.EdtRequestType edtRequestType;

    /* Only used with multiple-transaction shipments. */
    private com.fedex.ship.stub.TrackingId masterTrackingId;

    /* Only used with multi-piece COD shipments sent in multiple transactions.
     * Required on last transaction only. */
    private com.fedex.ship.stub.TrackingId codReturnTrackingId;

    /* The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.) */
    private org.apache.axis.types.NonNegativeInteger packageCount;

    /* Specifies whether packages are described individually, in groups,
     * or summarized in a single description for total-piece-total-weight.
     * This field controls which fields of the RequestedPackageLineItem will
     * be used, and how many occurrences are expected. */
    private com.fedex.ship.stub.RequestedPackageDetailType packageDetail;

    /* One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment. */
    private com.fedex.ship.stub.RequestedPackageLineItem[] requestedPackageLineItems;

    public RequestedShipment() {
    }

    public RequestedShipment(
           java.util.Calendar shipTimestamp,
           com.fedex.ship.stub.DropoffType dropoffType,
           com.fedex.ship.stub.ServiceType serviceType,
           com.fedex.ship.stub.PackagingType packagingType,
           com.fedex.ship.stub.Weight totalWeight,
           com.fedex.ship.stub.Money totalInsuredValue,
           com.fedex.ship.stub.Dimensions totalDimensions,
           com.fedex.ship.stub.Party shipper,
           com.fedex.ship.stub.Party recipient,
           java.lang.String recipientLocationNumber,
           com.fedex.ship.stub.ContactAndAddress origin,
           com.fedex.ship.stub.Payment shippingChargesPayment,
           com.fedex.ship.stub.ShipmentSpecialServicesRequested specialServicesRequested,
           com.fedex.ship.stub.ExpressFreightDetail expressFreightDetail,
           com.fedex.ship.stub.FreightShipmentDetail freightShipmentDetail,
           java.lang.String deliveryInstructions,
           com.fedex.ship.stub.VariableHandlingChargeDetail variableHandlingChargeDetail,
           com.fedex.ship.stub.CustomsClearanceDetail customsClearanceDetail,
           com.fedex.ship.stub.PickupDetail pickupDetail,
           com.fedex.ship.stub.SmartPostShipmentDetail smartPostDetail,
           java.lang.Boolean blockInsightVisibility,
           com.fedex.ship.stub.ErrorLabelBehaviorType errorLabelBehavior,
           com.fedex.ship.stub.LabelSpecification labelSpecification,
           com.fedex.ship.stub.ShippingDocumentSpecification shippingDocumentSpecification,
           com.fedex.ship.stub.RateRequestType[] rateRequestTypes,
           com.fedex.ship.stub.ReturnedRateType customerSelectedActualRateType,
           com.fedex.ship.stub.EdtRequestType edtRequestType,
           com.fedex.ship.stub.TrackingId masterTrackingId,
           com.fedex.ship.stub.TrackingId codReturnTrackingId,
           org.apache.axis.types.NonNegativeInteger packageCount,
           com.fedex.ship.stub.RequestedPackageDetailType packageDetail,
           com.fedex.ship.stub.RequestedPackageLineItem[] requestedPackageLineItems) {
           this.shipTimestamp = shipTimestamp;
           this.dropoffType = dropoffType;
           this.serviceType = serviceType;
           this.packagingType = packagingType;
           this.totalWeight = totalWeight;
           this.totalInsuredValue = totalInsuredValue;
           this.totalDimensions = totalDimensions;
           this.shipper = shipper;
           this.recipient = recipient;
           this.recipientLocationNumber = recipientLocationNumber;
           this.origin = origin;
           this.shippingChargesPayment = shippingChargesPayment;
           this.specialServicesRequested = specialServicesRequested;
           this.expressFreightDetail = expressFreightDetail;
           this.freightShipmentDetail = freightShipmentDetail;
           this.deliveryInstructions = deliveryInstructions;
           this.variableHandlingChargeDetail = variableHandlingChargeDetail;
           this.customsClearanceDetail = customsClearanceDetail;
           this.pickupDetail = pickupDetail;
           this.smartPostDetail = smartPostDetail;
           this.blockInsightVisibility = blockInsightVisibility;
           this.errorLabelBehavior = errorLabelBehavior;
           this.labelSpecification = labelSpecification;
           this.shippingDocumentSpecification = shippingDocumentSpecification;
           this.rateRequestTypes = rateRequestTypes;
           this.customerSelectedActualRateType = customerSelectedActualRateType;
           this.edtRequestType = edtRequestType;
           this.masterTrackingId = masterTrackingId;
           this.codReturnTrackingId = codReturnTrackingId;
           this.packageCount = packageCount;
           this.packageDetail = packageDetail;
           this.requestedPackageLineItems = requestedPackageLineItems;
    }


    /**
     * Gets the shipTimestamp value for this RequestedShipment.
     * 
     * @return shipTimestamp   * Identifies the date and time the package is tendered to FedEx.
     * Both the date and time portions of the string are expected to be used.
     * The date should not be a past date or a date more than 10 days in
     * the future. The time is the local time of the shipment based on the
     * shipper's time zone. The date component must be in the format: YYYY-MM-DD
     * (e.g. 2006-06-26). The time component must be in the format: HH:MM:SS
     * using a 24 hour clock (e.g. 11:00 a.m. is 11:00:00, whereas 5:00 p.m.
     * is 17:00:00). The date and time parts are separated by the letter
     * T (e.g. 2006-06-26T17:00:00). There is also a UTC offset component
     * indicating the number of hours/mainutes from UTC (e.g 2006-06-26T17:00:00-0400
     * is defined form June 26, 2006 5:00 pm Eastern Time).
     */
    public java.util.Calendar getShipTimestamp() {
        return shipTimestamp;
    }


    /**
     * Sets the shipTimestamp value for this RequestedShipment.
     * 
     * @param shipTimestamp   * Identifies the date and time the package is tendered to FedEx.
     * Both the date and time portions of the string are expected to be used.
     * The date should not be a past date or a date more than 10 days in
     * the future. The time is the local time of the shipment based on the
     * shipper's time zone. The date component must be in the format: YYYY-MM-DD
     * (e.g. 2006-06-26). The time component must be in the format: HH:MM:SS
     * using a 24 hour clock (e.g. 11:00 a.m. is 11:00:00, whereas 5:00 p.m.
     * is 17:00:00). The date and time parts are separated by the letter
     * T (e.g. 2006-06-26T17:00:00). There is also a UTC offset component
     * indicating the number of hours/mainutes from UTC (e.g 2006-06-26T17:00:00-0400
     * is defined form June 26, 2006 5:00 pm Eastern Time).
     */
    public void setShipTimestamp(java.util.Calendar shipTimestamp) {
        this.shipTimestamp = shipTimestamp;
    }


    /**
     * Gets the dropoffType value for this RequestedShipment.
     * 
     * @return dropoffType   * Identifies the method by which the package is to be tendered
     * to FedEx. This element does not dispatch a courier for package pickup.
     * See DropoffType for list of valid enumerated values.
     */
    public com.fedex.ship.stub.DropoffType getDropoffType() {
        return dropoffType;
    }


    /**
     * Sets the dropoffType value for this RequestedShipment.
     * 
     * @param dropoffType   * Identifies the method by which the package is to be tendered
     * to FedEx. This element does not dispatch a courier for package pickup.
     * See DropoffType for list of valid enumerated values.
     */
    public void setDropoffType(com.fedex.ship.stub.DropoffType dropoffType) {
        this.dropoffType = dropoffType;
    }


    /**
     * Gets the serviceType value for this RequestedShipment.
     * 
     * @return serviceType   * Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values.
     */
    public com.fedex.ship.stub.ServiceType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this RequestedShipment.
     * 
     * @param serviceType   * Identifies the FedEx service to use in shipping the package.
     * See ServiceType for list of valid enumerated values.
     */
    public void setServiceType(com.fedex.ship.stub.ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the packagingType value for this RequestedShipment.
     * 
     * @return packagingType   * Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values.
     */
    public com.fedex.ship.stub.PackagingType getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this RequestedShipment.
     * 
     * @param packagingType   * Identifies the packaging used by the requestor for the package.
     * See PackagingType for list of valid enumerated values.
     */
    public void setPackagingType(com.fedex.ship.stub.PackagingType packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the totalWeight value for this RequestedShipment.
     * 
     * @return totalWeight   * Identifies the total weight of the shipment being conveyed
     * to FedEx.This is only applicable to International shipments and should
     * only be used on the first package of a mutiple piece shipment.This
     * value contains 1 explicit decimal position
     */
    public com.fedex.ship.stub.Weight getTotalWeight() {
        return totalWeight;
    }


    /**
     * Sets the totalWeight value for this RequestedShipment.
     * 
     * @param totalWeight   * Identifies the total weight of the shipment being conveyed
     * to FedEx.This is only applicable to International shipments and should
     * only be used on the first package of a mutiple piece shipment.This
     * value contains 1 explicit decimal position
     */
    public void setTotalWeight(com.fedex.ship.stub.Weight totalWeight) {
        this.totalWeight = totalWeight;
    }


    /**
     * Gets the totalInsuredValue value for this RequestedShipment.
     * 
     * @return totalInsuredValue   * Total insured amount.
     */
    public com.fedex.ship.stub.Money getTotalInsuredValue() {
        return totalInsuredValue;
    }


    /**
     * Sets the totalInsuredValue value for this RequestedShipment.
     * 
     * @param totalInsuredValue   * Total insured amount.
     */
    public void setTotalInsuredValue(com.fedex.ship.stub.Money totalInsuredValue) {
        this.totalInsuredValue = totalInsuredValue;
    }


    /**
     * Gets the totalDimensions value for this RequestedShipment.
     * 
     * @return totalDimensions
     */
    public com.fedex.ship.stub.Dimensions getTotalDimensions() {
        return totalDimensions;
    }


    /**
     * Sets the totalDimensions value for this RequestedShipment.
     * 
     * @param totalDimensions
     */
    public void setTotalDimensions(com.fedex.ship.stub.Dimensions totalDimensions) {
        this.totalDimensions = totalDimensions;
    }


    /**
     * Gets the shipper value for this RequestedShipment.
     * 
     * @return shipper   * Descriptive data identifying the party responsible for shipping
     * the package. Shipper and Origin should have the same address.
     */
    public com.fedex.ship.stub.Party getShipper() {
        return shipper;
    }


    /**
     * Sets the shipper value for this RequestedShipment.
     * 
     * @param shipper   * Descriptive data identifying the party responsible for shipping
     * the package. Shipper and Origin should have the same address.
     */
    public void setShipper(com.fedex.ship.stub.Party shipper) {
        this.shipper = shipper;
    }


    /**
     * Gets the recipient value for this RequestedShipment.
     * 
     * @return recipient   * Descriptive data identifying the party receiving the package.
     */
    public com.fedex.ship.stub.Party getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this RequestedShipment.
     * 
     * @param recipient   * Descriptive data identifying the party receiving the package.
     */
    public void setRecipient(com.fedex.ship.stub.Party recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the recipientLocationNumber value for this RequestedShipment.
     * 
     * @return recipientLocationNumber   * A unique identifier for a recipient location
     */
    public java.lang.String getRecipientLocationNumber() {
        return recipientLocationNumber;
    }


    /**
     * Sets the recipientLocationNumber value for this RequestedShipment.
     * 
     * @param recipientLocationNumber   * A unique identifier for a recipient location
     */
    public void setRecipientLocationNumber(java.lang.String recipientLocationNumber) {
        this.recipientLocationNumber = recipientLocationNumber;
    }


    /**
     * Gets the origin value for this RequestedShipment.
     * 
     * @return origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public com.fedex.ship.stub.ContactAndAddress getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this RequestedShipment.
     * 
     * @param origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public void setOrigin(com.fedex.ship.stub.ContactAndAddress origin) {
        this.origin = origin;
    }


    /**
     * Gets the shippingChargesPayment value for this RequestedShipment.
     * 
     * @return shippingChargesPayment   * Descriptive data indicating the method and means of payment
     * to FedEx for providing shipping services.
     */
    public com.fedex.ship.stub.Payment getShippingChargesPayment() {
        return shippingChargesPayment;
    }


    /**
     * Sets the shippingChargesPayment value for this RequestedShipment.
     * 
     * @param shippingChargesPayment   * Descriptive data indicating the method and means of payment
     * to FedEx for providing shipping services.
     */
    public void setShippingChargesPayment(com.fedex.ship.stub.Payment shippingChargesPayment) {
        this.shippingChargesPayment = shippingChargesPayment;
    }


    /**
     * Gets the specialServicesRequested value for this RequestedShipment.
     * 
     * @return specialServicesRequested   * Descriptive data regarding special services requested by the
     * shipper for this shipment. If the shipper is requesting a special
     * service which requires additional data (e.g. COD), the special service
     * type must be present in the specialServiceTypes collection, and the
     * supporting detail must be provided in the appropriate sub-object.
     * For example, to request COD, "COD" must be included in the SpecialServiceTypes
     * collection and the CodDetail object must contain the required data.
     */
    public com.fedex.ship.stub.ShipmentSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this RequestedShipment.
     * 
     * @param specialServicesRequested   * Descriptive data regarding special services requested by the
     * shipper for this shipment. If the shipper is requesting a special
     * service which requires additional data (e.g. COD), the special service
     * type must be present in the specialServiceTypes collection, and the
     * supporting detail must be provided in the appropriate sub-object.
     * For example, to request COD, "COD" must be included in the SpecialServiceTypes
     * collection and the CodDetail object must contain the required data.
     */
    public void setSpecialServicesRequested(com.fedex.ship.stub.ShipmentSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the expressFreightDetail value for this RequestedShipment.
     * 
     * @return expressFreightDetail   * Details specific to an Express freight shipment.
     */
    public com.fedex.ship.stub.ExpressFreightDetail getExpressFreightDetail() {
        return expressFreightDetail;
    }


    /**
     * Sets the expressFreightDetail value for this RequestedShipment.
     * 
     * @param expressFreightDetail   * Details specific to an Express freight shipment.
     */
    public void setExpressFreightDetail(com.fedex.ship.stub.ExpressFreightDetail expressFreightDetail) {
        this.expressFreightDetail = expressFreightDetail;
    }


    /**
     * Gets the freightShipmentDetail value for this RequestedShipment.
     * 
     * @return freightShipmentDetail   * Data applicable to shipments using FEDEX_FREIGHT and FEDEX_NATIONAL_FREIGHT
     * services.
     */
    public com.fedex.ship.stub.FreightShipmentDetail getFreightShipmentDetail() {
        return freightShipmentDetail;
    }


    /**
     * Sets the freightShipmentDetail value for this RequestedShipment.
     * 
     * @param freightShipmentDetail   * Data applicable to shipments using FEDEX_FREIGHT and FEDEX_NATIONAL_FREIGHT
     * services.
     */
    public void setFreightShipmentDetail(com.fedex.ship.stub.FreightShipmentDetail freightShipmentDetail) {
        this.freightShipmentDetail = freightShipmentDetail;
    }


    /**
     * Gets the deliveryInstructions value for this RequestedShipment.
     * 
     * @return deliveryInstructions   * Used with Ground Home Delivery and Freight.
     */
    public java.lang.String getDeliveryInstructions() {
        return deliveryInstructions;
    }


    /**
     * Sets the deliveryInstructions value for this RequestedShipment.
     * 
     * @param deliveryInstructions   * Used with Ground Home Delivery and Freight.
     */
    public void setDeliveryInstructions(java.lang.String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }


    /**
     * Gets the variableHandlingChargeDetail value for this RequestedShipment.
     * 
     * @return variableHandlingChargeDetail   * Details about how to calculate variable handling charges at
     * the shipment level.
     */
    public com.fedex.ship.stub.VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
        return variableHandlingChargeDetail;
    }


    /**
     * Sets the variableHandlingChargeDetail value for this RequestedShipment.
     * 
     * @param variableHandlingChargeDetail   * Details about how to calculate variable handling charges at
     * the shipment level.
     */
    public void setVariableHandlingChargeDetail(com.fedex.ship.stub.VariableHandlingChargeDetail variableHandlingChargeDetail) {
        this.variableHandlingChargeDetail = variableHandlingChargeDetail;
    }


    /**
     * Gets the customsClearanceDetail value for this RequestedShipment.
     * 
     * @return customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public com.fedex.ship.stub.CustomsClearanceDetail getCustomsClearanceDetail() {
        return customsClearanceDetail;
    }


    /**
     * Sets the customsClearanceDetail value for this RequestedShipment.
     * 
     * @param customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public void setCustomsClearanceDetail(com.fedex.ship.stub.CustomsClearanceDetail customsClearanceDetail) {
        this.customsClearanceDetail = customsClearanceDetail;
    }


    /**
     * Gets the pickupDetail value for this RequestedShipment.
     * 
     * @return pickupDetail   * For use in "process tag" transaction.
     */
    public com.fedex.ship.stub.PickupDetail getPickupDetail() {
        return pickupDetail;
    }


    /**
     * Sets the pickupDetail value for this RequestedShipment.
     * 
     * @param pickupDetail   * For use in "process tag" transaction.
     */
    public void setPickupDetail(com.fedex.ship.stub.PickupDetail pickupDetail) {
        this.pickupDetail = pickupDetail;
    }


    /**
     * Gets the smartPostDetail value for this RequestedShipment.
     * 
     * @return smartPostDetail
     */
    public com.fedex.ship.stub.SmartPostShipmentDetail getSmartPostDetail() {
        return smartPostDetail;
    }


    /**
     * Sets the smartPostDetail value for this RequestedShipment.
     * 
     * @param smartPostDetail
     */
    public void setSmartPostDetail(com.fedex.ship.stub.SmartPostShipmentDetail smartPostDetail) {
        this.smartPostDetail = smartPostDetail;
    }


    /**
     * Gets the blockInsightVisibility value for this RequestedShipment.
     * 
     * @return blockInsightVisibility   * If true, only the shipper/payor will have visibility of this
     * shipment.
     */
    public java.lang.Boolean getBlockInsightVisibility() {
        return blockInsightVisibility;
    }


    /**
     * Sets the blockInsightVisibility value for this RequestedShipment.
     * 
     * @param blockInsightVisibility   * If true, only the shipper/payor will have visibility of this
     * shipment.
     */
    public void setBlockInsightVisibility(java.lang.Boolean blockInsightVisibility) {
        this.blockInsightVisibility = blockInsightVisibility;
    }


    /**
     * Gets the errorLabelBehavior value for this RequestedShipment.
     * 
     * @return errorLabelBehavior   * Specifies the client-requested response in the event of errors
     * within shipment.
     */
    public com.fedex.ship.stub.ErrorLabelBehaviorType getErrorLabelBehavior() {
        return errorLabelBehavior;
    }


    /**
     * Sets the errorLabelBehavior value for this RequestedShipment.
     * 
     * @param errorLabelBehavior   * Specifies the client-requested response in the event of errors
     * within shipment.
     */
    public void setErrorLabelBehavior(com.fedex.ship.stub.ErrorLabelBehaviorType errorLabelBehavior) {
        this.errorLabelBehavior = errorLabelBehavior;
    }


    /**
     * Gets the labelSpecification value for this RequestedShipment.
     * 
     * @return labelSpecification   * Details about the image format and printer type the label is
     * to returned in.
     */
    public com.fedex.ship.stub.LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }


    /**
     * Sets the labelSpecification value for this RequestedShipment.
     * 
     * @param labelSpecification   * Details about the image format and printer type the label is
     * to returned in.
     */
    public void setLabelSpecification(com.fedex.ship.stub.LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }


    /**
     * Gets the shippingDocumentSpecification value for this RequestedShipment.
     * 
     * @return shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public com.fedex.ship.stub.ShippingDocumentSpecification getShippingDocumentSpecification() {
        return shippingDocumentSpecification;
    }


    /**
     * Sets the shippingDocumentSpecification value for this RequestedShipment.
     * 
     * @param shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public void setShippingDocumentSpecification(com.fedex.ship.stub.ShippingDocumentSpecification shippingDocumentSpecification) {
        this.shippingDocumentSpecification = shippingDocumentSpecification;
    }


    /**
     * Gets the rateRequestTypes value for this RequestedShipment.
     * 
     * @return rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public com.fedex.ship.stub.RateRequestType[] getRateRequestTypes() {
        return rateRequestTypes;
    }


    /**
     * Sets the rateRequestTypes value for this RequestedShipment.
     * 
     * @param rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public void setRateRequestTypes(com.fedex.ship.stub.RateRequestType[] rateRequestTypes) {
        this.rateRequestTypes = rateRequestTypes;
    }

    public com.fedex.ship.stub.RateRequestType getRateRequestTypes(int i) {
        return this.rateRequestTypes[i];
    }

    public void setRateRequestTypes(int i, com.fedex.ship.stub.RateRequestType _value) {
        this.rateRequestTypes[i] = _value;
    }


    /**
     * Gets the customerSelectedActualRateType value for this RequestedShipment.
     * 
     * @return customerSelectedActualRateType   * Specifies the type of rate the customer wishes to have used
     * as the actual rate type.
     */
    public com.fedex.ship.stub.ReturnedRateType getCustomerSelectedActualRateType() {
        return customerSelectedActualRateType;
    }


    /**
     * Sets the customerSelectedActualRateType value for this RequestedShipment.
     * 
     * @param customerSelectedActualRateType   * Specifies the type of rate the customer wishes to have used
     * as the actual rate type.
     */
    public void setCustomerSelectedActualRateType(com.fedex.ship.stub.ReturnedRateType customerSelectedActualRateType) {
        this.customerSelectedActualRateType = customerSelectedActualRateType;
    }


    /**
     * Gets the edtRequestType value for this RequestedShipment.
     * 
     * @return edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public com.fedex.ship.stub.EdtRequestType getEdtRequestType() {
        return edtRequestType;
    }


    /**
     * Sets the edtRequestType value for this RequestedShipment.
     * 
     * @param edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public void setEdtRequestType(com.fedex.ship.stub.EdtRequestType edtRequestType) {
        this.edtRequestType = edtRequestType;
    }


    /**
     * Gets the masterTrackingId value for this RequestedShipment.
     * 
     * @return masterTrackingId   * Only used with multiple-transaction shipments.
     */
    public com.fedex.ship.stub.TrackingId getMasterTrackingId() {
        return masterTrackingId;
    }


    /**
     * Sets the masterTrackingId value for this RequestedShipment.
     * 
     * @param masterTrackingId   * Only used with multiple-transaction shipments.
     */
    public void setMasterTrackingId(com.fedex.ship.stub.TrackingId masterTrackingId) {
        this.masterTrackingId = masterTrackingId;
    }


    /**
     * Gets the codReturnTrackingId value for this RequestedShipment.
     * 
     * @return codReturnTrackingId   * Only used with multi-piece COD shipments sent in multiple transactions.
     * Required on last transaction only.
     */
    public com.fedex.ship.stub.TrackingId getCodReturnTrackingId() {
        return codReturnTrackingId;
    }


    /**
     * Sets the codReturnTrackingId value for this RequestedShipment.
     * 
     * @param codReturnTrackingId   * Only used with multi-piece COD shipments sent in multiple transactions.
     * Required on last transaction only.
     */
    public void setCodReturnTrackingId(com.fedex.ship.stub.TrackingId codReturnTrackingId) {
        this.codReturnTrackingId = codReturnTrackingId;
    }


    /**
     * Gets the packageCount value for this RequestedShipment.
     * 
     * @return packageCount   * The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.)
     */
    public org.apache.axis.types.NonNegativeInteger getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this RequestedShipment.
     * 
     * @param packageCount   * The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.)
     */
    public void setPackageCount(org.apache.axis.types.NonNegativeInteger packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the packageDetail value for this RequestedShipment.
     * 
     * @return packageDetail   * Specifies whether packages are described individually, in groups,
     * or summarized in a single description for total-piece-total-weight.
     * This field controls which fields of the RequestedPackageLineItem will
     * be used, and how many occurrences are expected.
     */
    public com.fedex.ship.stub.RequestedPackageDetailType getPackageDetail() {
        return packageDetail;
    }


    /**
     * Sets the packageDetail value for this RequestedShipment.
     * 
     * @param packageDetail   * Specifies whether packages are described individually, in groups,
     * or summarized in a single description for total-piece-total-weight.
     * This field controls which fields of the RequestedPackageLineItem will
     * be used, and how many occurrences are expected.
     */
    public void setPackageDetail(com.fedex.ship.stub.RequestedPackageDetailType packageDetail) {
        this.packageDetail = packageDetail;
    }


    /**
     * Gets the requestedPackageLineItems value for this RequestedShipment.
     * 
     * @return requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment.
     */
    public com.fedex.ship.stub.RequestedPackageLineItem[] getRequestedPackageLineItems() {
        return requestedPackageLineItems;
    }


    /**
     * Sets the requestedPackageLineItems value for this RequestedShipment.
     * 
     * @param requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment.
     */
    public void setRequestedPackageLineItems(com.fedex.ship.stub.RequestedPackageLineItem[] requestedPackageLineItems) {
        this.requestedPackageLineItems = requestedPackageLineItems;
    }

    public com.fedex.ship.stub.RequestedPackageLineItem getRequestedPackageLineItems(int i) {
        return this.requestedPackageLineItems[i];
    }

    public void setRequestedPackageLineItems(int i, com.fedex.ship.stub.RequestedPackageLineItem _value) {
        this.requestedPackageLineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestedShipment)) return false;
        RequestedShipment other = (RequestedShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipTimestamp==null && other.getShipTimestamp()==null) || 
             (this.shipTimestamp!=null &&
              this.shipTimestamp.equals(other.getShipTimestamp()))) &&
            ((this.dropoffType==null && other.getDropoffType()==null) || 
             (this.dropoffType!=null &&
              this.dropoffType.equals(other.getDropoffType()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) || 
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.totalWeight==null && other.getTotalWeight()==null) || 
             (this.totalWeight!=null &&
              this.totalWeight.equals(other.getTotalWeight()))) &&
            ((this.totalInsuredValue==null && other.getTotalInsuredValue()==null) || 
             (this.totalInsuredValue!=null &&
              this.totalInsuredValue.equals(other.getTotalInsuredValue()))) &&
            ((this.totalDimensions==null && other.getTotalDimensions()==null) || 
             (this.totalDimensions!=null &&
              this.totalDimensions.equals(other.getTotalDimensions()))) &&
            ((this.shipper==null && other.getShipper()==null) || 
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.recipientLocationNumber==null && other.getRecipientLocationNumber()==null) || 
             (this.recipientLocationNumber!=null &&
              this.recipientLocationNumber.equals(other.getRecipientLocationNumber()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.shippingChargesPayment==null && other.getShippingChargesPayment()==null) || 
             (this.shippingChargesPayment!=null &&
              this.shippingChargesPayment.equals(other.getShippingChargesPayment()))) &&
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) || 
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.expressFreightDetail==null && other.getExpressFreightDetail()==null) || 
             (this.expressFreightDetail!=null &&
              this.expressFreightDetail.equals(other.getExpressFreightDetail()))) &&
            ((this.freightShipmentDetail==null && other.getFreightShipmentDetail()==null) || 
             (this.freightShipmentDetail!=null &&
              this.freightShipmentDetail.equals(other.getFreightShipmentDetail()))) &&
            ((this.deliveryInstructions==null && other.getDeliveryInstructions()==null) || 
             (this.deliveryInstructions!=null &&
              this.deliveryInstructions.equals(other.getDeliveryInstructions()))) &&
            ((this.variableHandlingChargeDetail==null && other.getVariableHandlingChargeDetail()==null) || 
             (this.variableHandlingChargeDetail!=null &&
              this.variableHandlingChargeDetail.equals(other.getVariableHandlingChargeDetail()))) &&
            ((this.customsClearanceDetail==null && other.getCustomsClearanceDetail()==null) || 
             (this.customsClearanceDetail!=null &&
              this.customsClearanceDetail.equals(other.getCustomsClearanceDetail()))) &&
            ((this.pickupDetail==null && other.getPickupDetail()==null) || 
             (this.pickupDetail!=null &&
              this.pickupDetail.equals(other.getPickupDetail()))) &&
            ((this.smartPostDetail==null && other.getSmartPostDetail()==null) || 
             (this.smartPostDetail!=null &&
              this.smartPostDetail.equals(other.getSmartPostDetail()))) &&
            ((this.blockInsightVisibility==null && other.getBlockInsightVisibility()==null) || 
             (this.blockInsightVisibility!=null &&
              this.blockInsightVisibility.equals(other.getBlockInsightVisibility()))) &&
            ((this.errorLabelBehavior==null && other.getErrorLabelBehavior()==null) || 
             (this.errorLabelBehavior!=null &&
              this.errorLabelBehavior.equals(other.getErrorLabelBehavior()))) &&
            ((this.labelSpecification==null && other.getLabelSpecification()==null) || 
             (this.labelSpecification!=null &&
              this.labelSpecification.equals(other.getLabelSpecification()))) &&
            ((this.shippingDocumentSpecification==null && other.getShippingDocumentSpecification()==null) || 
             (this.shippingDocumentSpecification!=null &&
              this.shippingDocumentSpecification.equals(other.getShippingDocumentSpecification()))) &&
            ((this.rateRequestTypes==null && other.getRateRequestTypes()==null) || 
             (this.rateRequestTypes!=null &&
              java.util.Arrays.equals(this.rateRequestTypes, other.getRateRequestTypes()))) &&
            ((this.customerSelectedActualRateType==null && other.getCustomerSelectedActualRateType()==null) || 
             (this.customerSelectedActualRateType!=null &&
              this.customerSelectedActualRateType.equals(other.getCustomerSelectedActualRateType()))) &&
            ((this.edtRequestType==null && other.getEdtRequestType()==null) || 
             (this.edtRequestType!=null &&
              this.edtRequestType.equals(other.getEdtRequestType()))) &&
            ((this.masterTrackingId==null && other.getMasterTrackingId()==null) || 
             (this.masterTrackingId!=null &&
              this.masterTrackingId.equals(other.getMasterTrackingId()))) &&
            ((this.codReturnTrackingId==null && other.getCodReturnTrackingId()==null) || 
             (this.codReturnTrackingId!=null &&
              this.codReturnTrackingId.equals(other.getCodReturnTrackingId()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.packageDetail==null && other.getPackageDetail()==null) || 
             (this.packageDetail!=null &&
              this.packageDetail.equals(other.getPackageDetail()))) &&
            ((this.requestedPackageLineItems==null && other.getRequestedPackageLineItems()==null) || 
             (this.requestedPackageLineItems!=null &&
              java.util.Arrays.equals(this.requestedPackageLineItems, other.getRequestedPackageLineItems())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getShipTimestamp() != null) {
            _hashCode += getShipTimestamp().hashCode();
        }
        if (getDropoffType() != null) {
            _hashCode += getDropoffType().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getTotalWeight() != null) {
            _hashCode += getTotalWeight().hashCode();
        }
        if (getTotalInsuredValue() != null) {
            _hashCode += getTotalInsuredValue().hashCode();
        }
        if (getTotalDimensions() != null) {
            _hashCode += getTotalDimensions().hashCode();
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getRecipientLocationNumber() != null) {
            _hashCode += getRecipientLocationNumber().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getShippingChargesPayment() != null) {
            _hashCode += getShippingChargesPayment().hashCode();
        }
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getExpressFreightDetail() != null) {
            _hashCode += getExpressFreightDetail().hashCode();
        }
        if (getFreightShipmentDetail() != null) {
            _hashCode += getFreightShipmentDetail().hashCode();
        }
        if (getDeliveryInstructions() != null) {
            _hashCode += getDeliveryInstructions().hashCode();
        }
        if (getVariableHandlingChargeDetail() != null) {
            _hashCode += getVariableHandlingChargeDetail().hashCode();
        }
        if (getCustomsClearanceDetail() != null) {
            _hashCode += getCustomsClearanceDetail().hashCode();
        }
        if (getPickupDetail() != null) {
            _hashCode += getPickupDetail().hashCode();
        }
        if (getSmartPostDetail() != null) {
            _hashCode += getSmartPostDetail().hashCode();
        }
        if (getBlockInsightVisibility() != null) {
            _hashCode += getBlockInsightVisibility().hashCode();
        }
        if (getErrorLabelBehavior() != null) {
            _hashCode += getErrorLabelBehavior().hashCode();
        }
        if (getLabelSpecification() != null) {
            _hashCode += getLabelSpecification().hashCode();
        }
        if (getShippingDocumentSpecification() != null) {
            _hashCode += getShippingDocumentSpecification().hashCode();
        }
        if (getRateRequestTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateRequestTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRateRequestTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerSelectedActualRateType() != null) {
            _hashCode += getCustomerSelectedActualRateType().hashCode();
        }
        if (getEdtRequestType() != null) {
            _hashCode += getEdtRequestType().hashCode();
        }
        if (getMasterTrackingId() != null) {
            _hashCode += getMasterTrackingId().hashCode();
        }
        if (getCodReturnTrackingId() != null) {
            _hashCode += getCodReturnTrackingId().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getPackageDetail() != null) {
            _hashCode += getPackageDetail().hashCode();
        }
        if (getRequestedPackageLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestedPackageLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestedPackageLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestedShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "RequestedShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ShipTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropoffType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "DropoffType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "DropoffType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ServiceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "PackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "PackagingType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "TotalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInsuredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "TotalInsuredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "TotalDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Dimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Party"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Party"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientLocationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "RecipientLocationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingChargesPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ShippingChargesPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Payment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ShipmentSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressFreightDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ExpressFreightDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ExpressFreightDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "FreightShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "FreightShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "DeliveryInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingChargeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "VariableHandlingChargeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "VariableHandlingChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsClearanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "CustomsClearanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "CustomsClearanceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "PickupDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "PickupDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartPostDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "SmartPostDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "SmartPostShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockInsightVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "BlockInsightVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorLabelBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ErrorLabelBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ErrorLabelBehaviorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "LabelSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "LabelSpecification"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ShippingDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ShippingDocumentSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateRequestTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "RateRequestTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "RateRequestType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSelectedActualRateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "CustomerSelectedActualRateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ReturnedRateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edtRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "EdtRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "EdtRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterTrackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "MasterTrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "TrackingId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codReturnTrackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "CodReturnTrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "TrackingId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "PackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "PackageDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "RequestedPackageDetailType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedPackageLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "RequestedPackageLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "RequestedPackageLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
