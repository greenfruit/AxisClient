package com.jade.axisclient.wsdlauto;

/**
 * com.jade.axisclient.wsdlauto.HelloAxisServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public class HelloAxisServiceLocator extends org.apache.axis.client.Service implements HelloAxisService {

    public HelloAxisServiceLocator() {
    }


    public HelloAxisServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloAxisServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Hello
    private String Hello_address = "http://127.0.0.1:8080/sjzdsp/services/Hello";

    public String getHelloAddress() {
        return Hello_address;
    }

    // The WSDD service name defaults to the port name.
    private String HelloWSDDServiceName = "Hello";

    public String getHelloWSDDServiceName() {
        return HelloWSDDServiceName;
    }

    public void setHelloWSDDServiceName(String name) {
        HelloWSDDServiceName = name;
    }

    public HelloAxis getHello() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Hello_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHello(endpoint);
    }

    public HelloAxis getHello(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            HelloSoapBindingStub _stub = new HelloSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloEndpointAddress(String address) {
        Hello_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (HelloAxis.class.isAssignableFrom(serviceEndpointInterface)) {
                HelloSoapBindingStub _stub = new HelloSoapBindingStub(new java.net.URL(Hello_address), this);
                _stub.setPortName(getHelloWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("Hello".equals(inputPortName)) {
            return getHello();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://127.0.0.1:8080/sjzdsp/services/Hello", "com.jade.axisclient.wsdlauto.HelloAxisService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://127.0.0.1:8080/sjzdsp/services/Hello", "Hello"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("Hello".equals(portName)) {
            setHelloEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
