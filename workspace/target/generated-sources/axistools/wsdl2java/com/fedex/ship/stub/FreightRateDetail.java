/**
 * FreightRateDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;


/**
 * Rate data specific to FedEx Freight or FedEx National Freight services.
 */
public class FreightRateDetail  implements java.io.Serializable {
    /* A unique identifier for a specific rate quotation. */
    private java.lang.String quoteNumber;

    /* Freight charges which accumulate to the total base charge for
     * the shipment. */
    private com.fedex.ship.stub.FreightBaseCharge[] baseCharges;

    /* Human-readable descriptions of additional information on this
     * shipment rating. */
    private com.fedex.ship.stub.FreightRateNotation[] notations;

    public FreightRateDetail() {
    }

    public FreightRateDetail(
           java.lang.String quoteNumber,
           com.fedex.ship.stub.FreightBaseCharge[] baseCharges,
           com.fedex.ship.stub.FreightRateNotation[] notations) {
           this.quoteNumber = quoteNumber;
           this.baseCharges = baseCharges;
           this.notations = notations;
    }


    /**
     * Gets the quoteNumber value for this FreightRateDetail.
     * 
     * @return quoteNumber   * A unique identifier for a specific rate quotation.
     */
    public java.lang.String getQuoteNumber() {
        return quoteNumber;
    }


    /**
     * Sets the quoteNumber value for this FreightRateDetail.
     * 
     * @param quoteNumber   * A unique identifier for a specific rate quotation.
     */
    public void setQuoteNumber(java.lang.String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }


    /**
     * Gets the baseCharges value for this FreightRateDetail.
     * 
     * @return baseCharges   * Freight charges which accumulate to the total base charge for
     * the shipment.
     */
    public com.fedex.ship.stub.FreightBaseCharge[] getBaseCharges() {
        return baseCharges;
    }


    /**
     * Sets the baseCharges value for this FreightRateDetail.
     * 
     * @param baseCharges   * Freight charges which accumulate to the total base charge for
     * the shipment.
     */
    public void setBaseCharges(com.fedex.ship.stub.FreightBaseCharge[] baseCharges) {
        this.baseCharges = baseCharges;
    }

    public com.fedex.ship.stub.FreightBaseCharge getBaseCharges(int i) {
        return this.baseCharges[i];
    }

    public void setBaseCharges(int i, com.fedex.ship.stub.FreightBaseCharge _value) {
        this.baseCharges[i] = _value;
    }


    /**
     * Gets the notations value for this FreightRateDetail.
     * 
     * @return notations   * Human-readable descriptions of additional information on this
     * shipment rating.
     */
    public com.fedex.ship.stub.FreightRateNotation[] getNotations() {
        return notations;
    }


    /**
     * Sets the notations value for this FreightRateDetail.
     * 
     * @param notations   * Human-readable descriptions of additional information on this
     * shipment rating.
     */
    public void setNotations(com.fedex.ship.stub.FreightRateNotation[] notations) {
        this.notations = notations;
    }

    public com.fedex.ship.stub.FreightRateNotation getNotations(int i) {
        return this.notations[i];
    }

    public void setNotations(int i, com.fedex.ship.stub.FreightRateNotation _value) {
        this.notations[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreightRateDetail)) return false;
        FreightRateDetail other = (FreightRateDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quoteNumber==null && other.getQuoteNumber()==null) || 
             (this.quoteNumber!=null &&
              this.quoteNumber.equals(other.getQuoteNumber()))) &&
            ((this.baseCharges==null && other.getBaseCharges()==null) || 
             (this.baseCharges!=null &&
              java.util.Arrays.equals(this.baseCharges, other.getBaseCharges()))) &&
            ((this.notations==null && other.getNotations()==null) || 
             (this.notations!=null &&
              java.util.Arrays.equals(this.notations, other.getNotations())));
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
        if (getQuoteNumber() != null) {
            _hashCode += getQuoteNumber().hashCode();
        }
        if (getBaseCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBaseCharges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBaseCharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotations(), i);
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
        new org.apache.axis.description.TypeDesc(FreightRateDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "FreightRateDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quoteNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "QuoteNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "BaseCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "FreightBaseCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Notations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "FreightRateNotation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
