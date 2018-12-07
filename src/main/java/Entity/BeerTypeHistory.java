package Entity;

import java.io.Serializable;

public class BeerTypeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private String history;
    private int beerTypeIdHist;
    private BeerType beerType;



    public BeerTypeHistory() {

    }







    public BeerType getBeerType() {
        return beerType;
    }

    public void setBeerType(BeerType beerType) {
        this.beerType = beerType;
    }

    public int getBeerTypeIdHist() {
        return beerTypeIdHist;
    }

    public void setBeerTypeIdHist(int beerTypeIdHist) {
        this.beerTypeIdHist = beerTypeIdHist;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
}
