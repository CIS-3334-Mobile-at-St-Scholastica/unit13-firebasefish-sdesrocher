package css.cis3334.fishlocatorfirebase;

import java.io.Serializable;

/**
 * Created by cssuser on 4/20/2017.
 */


public class Fish implements Serializable {
    private String key;
    private String species;
    private String weightInOz;
    private String dateCaught;
    private String lon;
    private String lat;

    public Fish() {
    }

   // public Fish(String key, String species, String weightInOz, String dateCaught, String lon, String lat) {
    //    this.key = key;
    //    this.species = species;
    //    this.weightInOz = weightInOz;
    //    this.dateCaught = dateCaught;
    //    this.lon = lon;
    //    this.lat = lat;
  //  }

   // public Fish(String species, String weightInOz, String dateCaught, String lat, String lon) {
     //   this.species = species;
    //    this.weightInOz = weightInOz;
    //    this.dateCaught = dateCaught;
   //     this.lat = lat;
   //     this.lon = lon;
   // }

    public Fish(String key, String species, String weightInOz, String dateCaught, String lat, String lon) {
        this.key = key;
        this.species = species;
        this.weightInOz = weightInOz;
        this.dateCaught = dateCaught;
        this.lat = lat;
        this.lon = lon;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getWeightInOz() {
        return weightInOz;
    }

    public void setWeightInOz(String weightInOz) {
        this.weightInOz = weightInOz;
    }

    public String getDateCaught() {
        return dateCaught;
    }

    public void setDateCaught(String dateCaught) {
        this.dateCaught = dateCaught;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "species='" + species + '\'' +
                ", weightInOz='" + weightInOz + '\'' +
                ", dateCaught='" + dateCaught + '\'' +
                ", Latitude='" + lat + '\''+
                ", Longitude='" + lon + '\''+
                '}';
    }
}
