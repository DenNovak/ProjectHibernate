import Entity.*;
import persistence.HibernateUtil;
import org.hibernate.Session;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        BeerType beerType = new BeerType();
        Packaging packaging = new Packaging();
        Manufacturer manufacturer = new Manufacturer();
        BeerTypeDescription beerTypeDescription = new BeerTypeDescription();
        BeerTypeHistory beerTypeHistory = new BeerTypeHistory();


        beerType.setNameBeerType("lager");

        packaging.setPackagingTypes("Glass bottle 0.5l + Glass bottle 1l");

        manufacturer.setManufacturerName("Heineken");


        beerTypeDescription.setBeerType(beerType);
        beerTypeDescription.setDescription("Very nice strong beer");

        beerTypeHistory.setBeerType(beerType);
        beerTypeHistory.setHistory("The word lager comes from the German lagern (to store), and it is " +
                "in Bavaria that the drink finds its origins. In the early nineteenth century Bavarian brewers began " +
                "experimenting with brewing techniques that involved storing their beers in cold beer cellars for prolonged " +
                "periods, using bottom-fermenting yeast. After an initial fermentation the beer would be given a second " +
                "lagering period at a low temperature, and then would be stored in refrigerated beer cellars. They could be kept for " +
                "a few weeks or several months, during which time the drink would mellow and clear.");

        session.save(beerType);
        session.save(packaging);
        session.save(manufacturer);
        session.save(beerTypeDescription);
        session.save(beerTypeHistory);

        Beer beer = new Beer();
        beer.setName("Heinekien");
        beer.setDescription("Very nice pleasant beer");
        beer.setCountry("Germany");
        beer.setAlc(3.6);

        beer.setBeerType(beerType);
        beer.setManufacturer(manufacturer);
        beer.setPackaging(packaging);

        beerType.getBeers().add(beer);

        session.save(beer);


        session.getTransaction().commit();
        System.out.println("Done");





       /* beer.setBeerTypeId(100);
        beer.setManufacturerId(50);
        beer.setPackageTypeId(1);*/



    }
}
