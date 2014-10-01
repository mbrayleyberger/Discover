/**
 * ValidatedHazardousCommodityDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;


/**
 * Identifies and describes an individual hazardous commodity. For
 * 201001 load, this is based on data from the FedEx Ground Hazardous
 * Materials Shipping Guide.
 */
public class ValidatedHazardousCommodityDescription  implements java.io.Serializable {
    /* Regulatory identifier for a commodity (e.g. "UN ID" value). */
    private java.lang.String id;

    private com.fedex.ship.stub.HazardousCommodityPackingGroupType packingGroup;

    private java.lang.String properShippingName;

    /* Fully-expanded descriptive text for a hazardous commodity. */
    private java.lang.String properShippingNameAndDescription;

    private java.lang.String technicalName;

    private java.lang.String hazardClass;

    private java.lang.String[] subsidiaryClasses;

    /* Coded indications for special requirements or constraints. */
    private java.lang.String symbols;

    private java.lang.String labelText;

    public ValidatedHazardousCommodityDescription() {
    }

    public ValidatedHazardousCommodityDescription(
           java.lang.String id,
           com.fedex.ship.stub.HazardousCommodityPackingGroupType packingGroup,
           java.lang.String properShippingName,
           java.lang.String properShippingNameAndDescription,
           java.lang.String technicalName,
           java.lang.String hazardClass,
           java.lang.String[] subsidiaryClasses,
           java.lang.String symbols,
           java.lang.String labelText) {
           this.id = id;
           this.packingGroup = packingGroup;
           this.properShippingName = properShippingName;
           this.properShippingNameAndDescription = properShippingNameAndDescription;
           this.technicalName = technicalName;
           this.hazardClass = hazardClass;
           this.subsidiaryClasses = subsidiaryClasses;
           this.symbols = symbols;
           this.labelText = labelText;
    }


    /**
     * Gets the id value for this ValidatedHazardousCommodityDescription.
     * 
     * @return id   * Regulatory identifier for a commodity (e.g. "UN ID" value).
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ValidatedHazardousCommodityDescription.
     * 
     * @param id   * Regulatory identifier for a commodity (e.g. "UN ID" value).
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the packingGroup value for this ValidatedHazardousCommodityDescription.
     * 
     * @return packingGroup
     */
    public com.fedex.ship.stub.HazardousCommodityPackingGroupType getPackingGroup() {
        return packingGroup;
    }


    /**
     * Sets the packingGroup value for this ValidatedHazardousCommodityDescription.
     * 
     * @param packingGroup
     */
    public void setPackingGroup(com.fedex.ship.stub.HazardousCommodityPackingGroupType packingGroup) {
        this.packingGroup = packingGroup;
    }


    /**
     * Gets the properShippingName value for this ValidatedHazardousCommodityDescription.
     * 
     * @return properShippingName
     */
    public java.lang.String getProperShippingName() {
        return properShippingName;
    }


    /**
     * Sets the properShippingName value for this ValidatedHazardousCommodityDescription.
     * 
     * @param properShippingName
     */
    public void setProperShippingName(java.lang.String properShippingName) {
        this.properShippingName = properShippingName;
    }


    /**
     * Gets the properShippingNameAndDescription value for this ValidatedHazardousCommodityDescription.
     * 
     * @return properShippingNameAndDescription   * Fully-expanded descriptive text for a hazardous commodity.
     */
    public java.lang.String getProperShippingNameAndDescription() {
        return properShippingNameAndDescription;
    }


    /**
     * Sets the properShippingNameAndDescription value for this ValidatedHazardousCommodityDescription.
     * 
     * @param properShippingNameAndDescription   * Fully-expanded descriptive text for a hazardous commodity.
     */
    public void setProperShippingNameAndDescription(java.lang.String properShippingNameAndDescription) {
        this.properShippingNameAndDescription = properShippingNameAndDescription;
    }


    /**
     * Gets the technicalName value for this ValidatedHazardousCommodityDescription.
     * 
     * @return technicalName
     */
    public java.lang.String getTechnicalName() {
        return technicalName;
    }


    /**
     * Sets the technicalName value for this ValidatedHazardousCommodityDescription.
     * 
     * @param technicalName
     */
    public void setTechnicalName(java.lang.String technicalName) {
        this.technicalName = technicalName;
    }


    /**
     * Gets the hazardClass value for this ValidatedHazardousCommodityDescription.
     * 
     * @return hazardClass
     */
    public java.lang.String getHazardClass() {
        return hazardClass;
    }


    /**
     * Sets the hazardClass value for this ValidatedHazardousCommodityDescription.
     * 
     * @param hazardClass
     */
    public void setHazardClass(java.lang.String hazardClass) {
        this.hazardClass = hazardClass;
    }


    /**
     * Gets the subsidiaryClasses value for this ValidatedHazardousCommodityDescription.
     * 
     * @return subsidiaryClasses
     */
    public java.lang.String[] getSubsidiaryClasses() {
        return subsidiaryClasses;
    }


    /**
     * Sets the subsidiaryClasses value for this ValidatedHazardousCommodityDescription.
     * 
     * @param subsidiaryClasses
     */
    public void setSubsidiaryClasses(java.lang.String[] subsidiaryClasses) {
        this.subsidiaryClasses = subsidiaryClasses;
    }

    public java.lang.String getSubsidiaryClasses(int i) {
        return this.subsidiaryClasses[i];
    }

    public void setSubsidiaryClasses(int i, java.lang.String _value) {
        this.subsidiaryClasses[i] = _value;
    }


    /**
     * Gets the symbols value for this ValidatedHazardousCommodityDescription.
     * 
     * @return symbols   * Coded indications for special requirements or constraints.
     */
    public java.lang.String getSymbols() {
        return symbols;
    }


    /**
     * Sets the symbols value for this ValidatedHazardousCommodityDescription.
     * 
     * @param symbols   * Coded indications for special requirements or constraints.
     */
    public void setSymbols(java.lang.String symbols) {
        this.symbols = symbols;
    }


    /**
     * Gets the labelText value for this ValidatedHazardousCommodityDescription.
     * 
     * @return labelText
     */
    public java.lang.String getLabelText() {
        return labelText;
    }


    /**
     * Sets the labelText value for this ValidatedHazardousCommodityDescription.
     * 
     * @param labelText
     */
    public void setLabelText(java.lang.String labelText) {
        this.labelText = labelText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidatedHazardousCommodityDescription)) return false;
        ValidatedHazardousCommodityDescription other = (ValidatedHazardousCommodityDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.packingGroup==null && other.getPackingGroup()==null) || 
             (this.packingGroup!=null &&
              this.packingGroup.equals(other.getPackingGroup()))) &&
            ((this.properShippingName==null && other.getProperShippingName()==null) || 
             (this.properShippingName!=null &&
              this.properShippingName.equals(other.getProperShippingName()))) &&
            ((this.properShippingNameAndDescription==null && other.getProperShippingNameAndDescription()==null) || 
             (this.properShippingNameAndDescription!=null &&
              this.properShippingNameAndDescription.equals(other.getProperShippingNameAndDescription()))) &&
            ((this.technicalName==null && other.getTechnicalName()==null) || 
             (this.technicalName!=null &&
              this.technicalName.equals(other.getTechnicalName()))) &&
            ((this.hazardClass==null && other.getHazardClass()==null) || 
             (this.hazardClass!=null &&
              this.hazardClass.equals(other.getHazardClass()))) &&
            ((this.subsidiaryClasses==null && other.getSubsidiaryClasses()==null) || 
             (this.subsidiaryClasses!=null &&
              java.util.Arrays.equals(this.subsidiaryClasses, other.getSubsidiaryClasses()))) &&
            ((this.symbols==null && other.getSymbols()==null) || 
             (this.symbols!=null &&
              this.symbols.equals(other.getSymbols()))) &&
            ((this.labelText==null && other.getLabelText()==null) || 
             (this.labelText!=null &&
              this.labelText.equals(other.getLabelText())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getPackingGroup() != null) {
            _hashCode += getPackingGroup().hashCode();
        }
        if (getProperShippingName() != null) {
            _hashCode += getProperShippingName().hashCode();
        }
        if (getProperShippingNameAndDescription() != null) {
            _hashCode += getProperShippingNameAndDescription().hashCode();
        }
        if (getTechnicalName() != null) {
            _hashCode += getTechnicalName().hashCode();
        }
        if (getHazardClass() != null) {
            _hashCode += getHazardClass().hashCode();
        }
        if (getSubsidiaryClasses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiaryClasses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiaryClasses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSymbols() != null) {
            _hashCode += getSymbols().hashCode();
        }
        if (getLabelText() != null) {
            _hashCode += getLabelText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidatedHazardousCommodityDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ValidatedHazardousCommodityDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "PackingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "HazardousCommodityPackingGroupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properShippingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ProperShippingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("properShippingNameAndDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ProperShippingNameAndDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("technicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "TechnicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "HazardClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "SubsidiaryClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbols");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Symbols"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "LabelText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
