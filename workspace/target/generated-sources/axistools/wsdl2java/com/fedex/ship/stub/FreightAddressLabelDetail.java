/**
 * FreightAddressLabelDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;


/**
 * Data required to produce the Freight handling-unit-level address
 * labels. Note that the number of UNIQUE labels (the N as in 1 of N,
 * 2 of N, etc.) is determined by total handling units.
 */
public class FreightAddressLabelDetail  implements java.io.Serializable {
    private com.fedex.ship.stub.ShippingDocumentFormat format;

    /* Indicates the number of copies to be produced for each unique
     * label. */
    private org.apache.axis.types.NonNegativeInteger copies;

    /* If omitted, no doc tab will be produced (i.e. default = former
     * NONE type). */
    private com.fedex.ship.stub.DocTabContent docTabContent;

    public FreightAddressLabelDetail() {
    }

    public FreightAddressLabelDetail(
           com.fedex.ship.stub.ShippingDocumentFormat format,
           org.apache.axis.types.NonNegativeInteger copies,
           com.fedex.ship.stub.DocTabContent docTabContent) {
           this.format = format;
           this.copies = copies;
           this.docTabContent = docTabContent;
    }


    /**
     * Gets the format value for this FreightAddressLabelDetail.
     * 
     * @return format
     */
    public com.fedex.ship.stub.ShippingDocumentFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this FreightAddressLabelDetail.
     * 
     * @param format
     */
    public void setFormat(com.fedex.ship.stub.ShippingDocumentFormat format) {
        this.format = format;
    }


    /**
     * Gets the copies value for this FreightAddressLabelDetail.
     * 
     * @return copies   * Indicates the number of copies to be produced for each unique
     * label.
     */
    public org.apache.axis.types.NonNegativeInteger getCopies() {
        return copies;
    }


    /**
     * Sets the copies value for this FreightAddressLabelDetail.
     * 
     * @param copies   * Indicates the number of copies to be produced for each unique
     * label.
     */
    public void setCopies(org.apache.axis.types.NonNegativeInteger copies) {
        this.copies = copies;
    }


    /**
     * Gets the docTabContent value for this FreightAddressLabelDetail.
     * 
     * @return docTabContent   * If omitted, no doc tab will be produced (i.e. default = former
     * NONE type).
     */
    public com.fedex.ship.stub.DocTabContent getDocTabContent() {
        return docTabContent;
    }


    /**
     * Sets the docTabContent value for this FreightAddressLabelDetail.
     * 
     * @param docTabContent   * If omitted, no doc tab will be produced (i.e. default = former
     * NONE type).
     */
    public void setDocTabContent(com.fedex.ship.stub.DocTabContent docTabContent) {
        this.docTabContent = docTabContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreightAddressLabelDetail)) return false;
        FreightAddressLabelDetail other = (FreightAddressLabelDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.copies==null && other.getCopies()==null) || 
             (this.copies!=null &&
              this.copies.equals(other.getCopies()))) &&
            ((this.docTabContent==null && other.getDocTabContent()==null) || 
             (this.docTabContent!=null &&
              this.docTabContent.equals(other.getDocTabContent())));
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
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getCopies() != null) {
            _hashCode += getCopies().hashCode();
        }
        if (getDocTabContent() != null) {
            _hashCode += getDocTabContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreightAddressLabelDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "FreightAddressLabelDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ShippingDocumentFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Copies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docTabContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "DocTabContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "DocTabContent"));
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
