package com.jade.axisclient.wsdlauto;

/**
 * com.jade.axisclient.wsdlauto.HelloAxisService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public interface HelloAxisService extends javax.xml.rpc.Service {
    public String getHelloAddress();

    public HelloAxis getHello() throws javax.xml.rpc.ServiceException;

    public HelloAxis getHello(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
