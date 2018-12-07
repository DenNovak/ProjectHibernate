package Entity;

import java.io.Serializable;

public class Beer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ID;
    private String name;
    private String description;
    private String country;
    private double alc;
    private int beerTypeId;
    private int manufacturerId;
    private int packageTypeId;

    private BeerType beerType;
    private Packaging packaging;
    private Manufacturer manufacturer;



    public Beer() {

    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBeerTypeId() {
        return beerTypeId;
    }

    public void setBeerTypeId(int beerTypeId) {
        this.beerTypeId = beerTypeId;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public double getAlc() {
        return alc;
    }

    public void setAlc(double alc) {
        this.alc = alc;
    }

    public int getPackageTypeId() {
        return packageTypeId;
    }

    public void setPackageTypeId(int packageTypeId) {
        this.packageTypeId = packageTypeId;
    }




    public BeerType getBeerType() {
        return beerType;
    }

    public void setBeerType(BeerType beerType) {
        this.beerType = beerType;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
