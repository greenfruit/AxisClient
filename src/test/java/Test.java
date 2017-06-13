import com.jade.axisclient.wsdlauto.HelloAxis;
import com.jade.axisclient.wsdlauto.HelloAxisServiceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * User: andy
 * Date: 2017/6/13
 * Time: 10:33
 */
public class Test {
    public static void main(String[] args) throws ServiceException, RemoteException {
        HelloAxisServiceLocator hl = new HelloAxisServiceLocator();
        HelloAxis helloAxis = hl.getHello();
        String hello = helloAxis.hello("nihaoma？");
        System.out.println(hello);
    }
}
