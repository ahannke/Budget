package it.morfoza;

/**
 * Created by ahann on 02/08/2016.
 */
public class Destination {

    public String toString(){
       return "Miejsce: [" + name + "]";
    }

    public String name;
    public double pricePerDay;
    public int howFar;

    public boolean equals(Object obj){
        return true;
    }

    // TU byłem! Tony Halik.

    public Destination(String name, double pricePerDay, int howFar) {

        this.name = name;
        this.pricePerDay = pricePerDay;
        this.howFar = howFar;
    }



}
