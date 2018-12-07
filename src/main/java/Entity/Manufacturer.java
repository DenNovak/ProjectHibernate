package Entity;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Manufacturer implements Serializable {

    private static final long serialVersionUID = 1L;

    private int manufacturerId;
    private String manufacturerName;

    private Set<Beer> beers = new HashSet<Beer>(0);


    public Manufacturer() {

    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }




    public Set<Beer> getBeers() {
        return beers;
    }

    public void setBeers(Set<Beer> beers) {
        this.beers = beers;
    }
}
