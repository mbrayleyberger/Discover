/**
 * ProcessShipmentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;


/**
 * Descriptive data sent to FedEx by a customer in order to ship a
 * package.
 */
public class ProcessShipmentRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.ship.stub.WebAuthenticationDetail webAuthenticationDetail;

    /* Descriptive data identifying the client submitting the transaction. */
    private com.fedex.ship.stub.ClientDetail clientDetail;

    /* Descriptive data for this customer transaction. The TransactionDetail
     * from the request is echoed back to the caller in the corresponding
     * reply. */
    private com.fedex.ship.stub.TransactionDetail transactionDetail;

    /* Identifies the version/level of a service operation expected
     * by a caller (in each request) and performed by the callee (in each
     * reply). */
    private com.fedex.ship.stub.VersionId version;

    /* Descriptive data about the shipment being sent by the requestor. */
    private com.fedex.ship.stub.RequestedShipment requestedShipment;

    public ProcessShipmentRequest() {
    }

    public ProcessShipmentRequest(
           com.fedex.ship.stub.WebAuthenticationDetail webAuthenticationDetail,
           com.fedex.ship.stub.ClientDetail clientDetail,
           com.fedex.ship.stub.TransactionDetail transactionDetail,
           com.fedex.ship.stub.VersionId version,
           com.fedex.ship.stub.RequestedShipment requestedShipment) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.requestedShipment = requestedShipment;
    }


    /**
     * Gets the webAuthenticationDetail value for this ProcessShipmentRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.ship.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this ProcessShipmentRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.ship.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this ProcessShipmentRequest.
     * 
     * @return clientDetail   * Descriptive data identifying the client submitting the transaction.
     */
    public com.fedex.ship.stub.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this ProcessShipmentRequest.
     * 
     * @param clientDetail   * Descriptive data identifying the client submitting the transaction.
     */
    public void setClientDetail(com.fedex.ship.stub.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this ProcessShipmentRequest.
     * 
     * @return transactionDetail   * Descriptive data for this customer transaction. The TransactionDetail
     * from the request is echoed back to the caller in the corresponding
     * reply.
     */
    public com.fedex.ship.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this ProcessShipmentRequest.
     * 
     * @param transactionDetail   * Descriptive data for this customer transaction. The TransactionDetail
     * from the request is echoed back to the caller in the corresponding
     * reply.
     */
    public void setTransactionDetail(com.fedex.ship.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this ProcessShipmentRequest.
     * 
     * @return version   * Identifies the version/level of a service operation expected
     * by a caller (in each request) and performed by the callee (in each
     * reply).
     */
    public com.fedex.ship.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ProcessShipmentRequest.
     * 
     * @param version   * Identifies the version/level of a service operation expected
     * by a caller (in each request) and performed by the callee (in each
     * reply).
     */
    public void setVersion(com.fedex.ship.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the requestedShipment value for this ProcessShipmentRequest.
     * 
     * @return requestedShipment   * Descriptive data about the shipment being sent by the requestor.
     */
    public com.fedex.ship.stub.RequestedShipment getRequestedShipment() {
        return requestedShipment;
    }


    /**
     * Sets the requestedShipment value for this ProcessShipmentRequest.
     * 
     * @param requestedShipment   * Descriptive data about the shipment being sent by the requestor.
     */
    public void setRequestedShipment(com.fedex.ship.stub.RequestedShipment requestedShipment) {
        this.requestedShipment = requestedShipment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessShipmentRequest)) return false;
        ProcessShipmentRequest other = (ProcessShipmentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webAuthenticationDetail==null && other.getWebAuthenticationDetail()==null) || 
             (this.webAuthenticationDetail!=null &&
              this.webAuthenticationDetail.equals(other.getWebAuthenticationDetail()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.requestedShipment==null && other.getRequestedShipment()==null) || 
             (this.requestedShipment!=null &&
              this.requestedShipment.equals(other.getRequestedShipment())));
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
        if (getWebAuthenticationDetail() != null) {
            _hashCode += getWebAuthenticationDetail().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getRequestedShipment() != null) {
            _hashCode += getRequestedShipment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessShipmentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ProcessShipmentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthenticationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "WebAuthenticationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "WebAuthenticationDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "ClientDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "RequestedShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v9", "RequestedShipment"));
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
