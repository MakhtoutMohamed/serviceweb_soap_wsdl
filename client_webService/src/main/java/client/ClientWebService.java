package client;

import proxy.BanqueService;
import proxy.BanqueWebService;
import proxy.Compte;

import java.util.List;

public class ClientWebService {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWebService().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToMad(600));
        Compte cp = proxy.getCompte(4);
        System.out.println("-------------------");
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreation());
        System.out.println("-------------------");
        List<Compte> compteList = proxy.listComptes();
        compteList.forEach(c->{
            System.out.println("-------------------");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println(c.getDateCreation());
            System.out.println("-------------------");
        });
    }
}
