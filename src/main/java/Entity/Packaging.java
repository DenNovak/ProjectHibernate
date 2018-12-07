package Entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Packaging implements Serializable {

    private static final long serialVersionUID = 1L;

    private int packagingTypeId;
    private String packagingTypes;

    private Set<Beer> beers = new HashSet<Beer>(0);


    public Packaging() {

    }


    public int getPackagingTypeId() {
        return packagingTypeId;
    }

    public void setPackagingTypeId(int packagingTypeId) {
        this.packagingTypeId = packagingTypeId;
    }

    public String getPackagingTypes() {
        return packagingTypes;
    }

    public void setPackagingTypes(String packagingTypes) {
        this.packagingTypes = packagingTypes;
    }




    public Set<Beer> getBeers() {
        return beers;
    }

    public void setBeers(Set<Beer> beers) {
        this.beers = beers;
    }
}
