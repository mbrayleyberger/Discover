/**
 * Tax.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;


/**
 * Identifies each tax applied to the shipment.
 */
public class Tax  implements java.io.Serializable {
    /* The type of tax applied to the shipment. */
    private com.fedex.ship.stub.TaxType taxType;

    private java.lang.String description;

    /* The amount of the tax applied to the shipment. */
    private com.fedex.ship.stub.Money amount;

    public Tax() {
    }

    public Tax(
           com.fedex.ship.stub.TaxType taxType,
           java.lang.String description,
           com.fedex.ship.stub.Money amount) {
           this.taxType = taxType;
           this.description = description;
           this.amount = amount;
    }


    /**
     * Gets the taxType value for this Tax.
     * 
     * @return taxType   * The type of tax applied to the shipment.
     */
    public com.fedex.ship.stub.TaxType getTaxType() {
        return taxType;
    }


    /**
     * Sets the taxType value for this Tax.
     * 
     * @param taxType   * The type of tax applied to the shipment.
     */
    public void setTaxType(com.fedex.ship.stub.TaxType taxType) {
        this.taxType = taxType;
    }


    /**
     * Gets the description value for this Tax.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Tax.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the amount value for this Tax.
     * 
     * @return amount   * The amount of the tax applied to the shipment.
     */
    public com.fedex.ship.stub.Money getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Tax.
     * 
     * @param amount   * The amount of the tax applied to the shipment.
     */
    public void setAmount(com.fedex.ship.stub.Money amount) {
        this.amount = amount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tax)) return false;
        Tax other = (Tax) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxType==null && other.getTaxType()==null) || 
             (this.taxType!=null &&
              this.taxType.equals(other.getTaxType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount())));
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
        if (getTaxType() != null) {
            _hashCode += getTaxType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tax.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Tax"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "TaxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "TaxType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Money"));
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
