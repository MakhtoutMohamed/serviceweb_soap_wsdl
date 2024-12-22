
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BanqueWebService", targetNamespace = "http://webservice_package/", wsdlLocation = "http://localhost:8088/?wsdl")
public class BanqueWebService
    extends Service
{

    private static final URL BANQUEWEBSERVICE_WSDL_LOCATION;
    private static final WebServiceException BANQUEWEBSERVICE_EXCEPTION;
    private static final QName BANQUEWEBSERVICE_QNAME = new QName("http://webservice_package/", "BanqueWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8088/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANQUEWEBSERVICE_WSDL_LOCATION = url;
        BANQUEWEBSERVICE_EXCEPTION = e;
    }

    public BanqueWebService() {
        super(__getWsdlLocation(), BANQUEWEBSERVICE_QNAME);
    }

    public BanqueWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANQUEWEBSERVICE_QNAME, features);
    }

    public BanqueWebService(URL wsdlLocation) {
        super(wsdlLocation, BANQUEWEBSERVICE_QNAME);
    }

    public BanqueWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANQUEWEBSERVICE_QNAME, features);
    }

    public BanqueWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BanqueWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort() {
        return super.getPort(new QName("http://webservice_package/", "BanqueServicePort"), BanqueService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanqueService
     */
    @WebEndpoint(name = "BanqueServicePort")
    public BanqueService getBanqueServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice_package/", "BanqueServicePort"), BanqueService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANQUEWEBSERVICE_EXCEPTION!= null) {
            throw BANQUEWEBSERVICE_EXCEPTION;
        }
        return BANQUEWEBSERVICE_WSDL_LOCATION;
    }

}
