package Entity;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class BeerType implements Serializable {

    private static final long serialVersionUID = 1L;

    private int beerTypeIdOrig;
    private String nameBeerType;
    private BeerTypeDescription beerTypeDescription;
    private BeerTypeHistory beerTypeHistory;
    private Set<Beer> beers = new HashSet<Beer>(0);


    public BeerType() {

    }

    public int getBeerTypeIdOrig() {
        return beerTypeIdOrig;
    }

    public void setBeerTypeIdOrig(int beerTypeIdOrig) {
        this.beerTypeIdOrig = beerTypeIdOrig;
    }

    public String getNameBeerType() {
        return nameBeerType;
    }

    public void setNameBeerType(String nameBeerType) {
        this.nameBeerType = nameBeerType;
    }



    public BeerTypeDescription getBeerTypeDescription() {
        return beerTypeDescription;
    }

    public void setBeerTypeDescription(BeerTypeDescription beerTypeDescription) {
        this.beerTypeDescription = beerTypeDescription;
    }



    public BeerTypeHistory getBeerTypeHistory() {
        return beerTypeHistory;
    }

    public void setBeerTypeHistory(BeerTypeHistory beerTypeHistory) {
        this.beerTypeHistory = beerTypeHistory;
    }

    public Set<Beer> getBeers() {
        return beers;
    }

    public void setBeers(Set<Beer> beers) {
        this.beers = beers;
    }
}
