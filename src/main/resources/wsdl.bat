set Axis_Lib=A:\soft\wsclient\Axis_WSDLTOJAVA\axis-1_4\lib
set Java_Cmd=Java -Djava.ext.dirs=%Axis_Lib%  
set Axis_Servlet=http://127.0.0.1:8080/sjzdsp/services/Hello?wsdl
%Java_Cmd% org.apache.axis.wsdl.WSDL2Java -u %Axis_Servlet%