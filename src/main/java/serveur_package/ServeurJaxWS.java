package serveur_package;

import jakarta.xml.ws.Endpoint;
import webservice_package.BanqueService;

public class ServeurJaxWS {
    public static void main(String[] args) {
        String url = "http://localhost:8088/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Serveur JaxWS Web Service sur"+url);
    }
}
