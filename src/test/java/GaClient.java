import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import javax.xml.namespace.QName;
import java.net.URL;

/**
 * axis 1.4 java 客户端 基于RPC
 */
public class GaClient {
	public static void main(String[] args) throws Exception {
        //创建服务对象   
        Service service = new Service();  
        //通过服务对象创建调用对象   
        Call call = (Call)service.createCall();  
        String url = "http://127.0.0.1:8080/sjzdsp/services/HBGACRequestServerDataList?wsdl";
//        String url = "http://127.0.0.1:8080/sjzdsp/services/Hello?wsdl";
        //设置调用对象的目标地址
        call.setTargetEndpointAddress(new URL(url));
        //设置对用对象的操作明   
        QName qn = new QName("http://ws.ga.dsp.dm.com","Query");
        call.setOperation(qn, "Query");

//        call.addParameter("name", org.apache.axis.Constants.XSD_STRING, javax.xml.rpc.ParameterMode.IN);

        call.addParameter("SenderID", org.apache.axis.Constants.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
        call.addParameter("ServiceID", org.apache.axis.Constants.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
        call.addParameter("EndUser", org.apache.axis.Constants.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
        call.addParameter("DataObjectCode", org.apache.axis.Constants.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
        call.addParameter("Condition", org.apache.axis.Constants.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
        call.addParameter("RequiredItems", org.apache.axis.Constants.XSD_STRING, javax.xml.rpc.ParameterMode.IN);
        call.addParameter("InfoCodeMode", org.apache.axis.Constants.XSD_STRING, javax.xml.rpc.ParameterMode.IN);

        call.setReturnType(org.apache.axis.Constants.XSD_STRING);
        //为调用添加参数   
        /*call.setReturnType(type) 
        call.addParameter(paramName, xmlType, parameterMode)*/  
        //限定名和服务器限定名保持一致   
        /*Class clazz = Customer.class;  
        QName qn = new QName( "urn:pojo:itdos:net", "Customer" );  
        call.registerTypeMapping(clazz, qn,  
               new BeanSerializerFactory(clazz, qn),  
               new BeanDeserializerFactory(clazz, qn));  
        //call.setMaintainSession(true);   
        Customer obj = (Customer)call.invoke(new Object[]{"45"});  */
        Object[] result = new Object[]{"A001","A001",new String[]{},"A001","",new String[]{},"0"};
//        Object[] result = new Object[]{"A001"};
        Object obj = call.invoke(qn, result);
        System.out.println("query success!");
          
    } 
}
