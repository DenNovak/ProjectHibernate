package Entity;


import java.io.Serializable;

public class BeerTypeDescription implements Serializable {

    private static final long serialVersionUID = 1L;

    private String description;
    private int beerTypeIdDesc;
    private BeerType beerType;



    public BeerTypeDescription() {

    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBeerTypeIdDesc() {
        return beerTypeIdDesc;
    }

    public void setBeerTypeIdDesc(int beerTypeIdDesc) {
        this.beerTypeIdDesc = beerTypeIdDesc;
    }



    public BeerType getBeerType() {
        return beerType;
    }

    public void setBeerType(BeerType beerType) {
        this.beerType = beerType;
    }
}
