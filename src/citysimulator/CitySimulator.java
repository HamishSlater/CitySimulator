/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citysimulator;

import java.util.Random;
import java.util.Scanner;
import static citysimulator.CitySimulator.RANGEN;

/**
 *
 * @author Beauty
 */
public class CitySimulator {

    protected static Random RANGEN = new Random();

    public static void main(String[] args) {
        //user given pseudorandom seed 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a seed:");
        int seed = in.nextInt();
        in.close();

        RANGEN.setSeed(seed);

        //run simulation
        City city = new City();
        city.run();
    }
}

class Driver {

    private final String name;
    private String start;
    private String end;
    private String street = "";
    private int akinaCount = 0;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getStreet() {
        return street;
    }

    public int getAkinaCount() {
        return akinaCount;
    }

    public void setStart(String suburb) {
        //if string is of correct length
        start = suburb;
    }

    public void setEnd(String suburb) {
        end = suburb;
    }

    public void setStreet(String aStreet) {
        street = aStreet;
    }

    public void updateSuburb(String name) {
        start = end;
        end = name;
    }

    public void travelDetails() {
        System.out.println(name + " heading from " + start + " to " + end + " via [" + street + "].");
    }

    public void visitAkina() {
        akinaCount++;
    }

    //FUN-AKINA-COUNT
    public void akinaMessage() {
        System.out.println(name + " met with John Jamieson " + akinaCount + " time(s).");
    }

    //FUN-AKINA-EDGES
    public void akinaAdditionalMessage() {
        if (akinaCount > 2) {
            System.out.println("This driver needed lots of help!");
        } else if (akinaCount == 0) {
            System.out.println("That passenger missed out!");
        }
    }

    public void exitMessage() {
        if (street.equals("option street 2")) {
            System.out.println(name + " has gone to Napier");
        }
        if (street.equals("option street 1")) {
            System.out.println(name + " has gone to Flaxmere");
        }
    }
}

class Suburb {

    private final String name;
    private Street streetLeft;
    private Street streetRight;
    private Driver driver;

    public Suburb(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public Street getLeftStreet() {
        return streetLeft;
    }

    public Street getRightStreet() {
        return streetRight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setStreets(Street left, Street right) {
        streetLeft = left;
        streetRight = right;
    }

    public void addDriver(Driver aDriver) {
        driver = aDriver;
        driver.updateSuburb(name);
        if (name.equals("Akina")) {
            driver.visitAkina();
        }
    }

    public Street pickStreet() {
        if (RANGEN.nextInt(2) < 1) {
            return streetLeft;
        }
        return streetRight;
    }

    public Street moveToStreet() {
        Street street = pickStreet();
        street.addDriver(driver);
        return street;
    }
}

class Street {

    private final String name;
    private Suburb[] suburbs = new Suburb[3];
    private Driver driver;

    public Street(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSuburbs(Suburb suburb1, Suburb suburb2, Suburb exit) {
        suburbs[0] = suburb1;
        suburbs[1] = suburb2;
        suburbs[2] = exit;
    }

    public void addDriver(Driver aDriver) {
        driver = aDriver;
        driver.setStreet(name);
    }

    public Suburb pickSuburb() {
        return suburbs[RANGEN.nextInt(3)];
    }

    public Suburb moveToSuburb() {
        Suburb suburb = pickSuburb();
        suburb.addDriver(driver);
        return suburb;
    }
}

class City {

    private Driver[] drivers;

    Suburb mayfair = new Suburb("Mayfair");
    Suburb akina = new Suburb("Akina");
    Suburb stortfordLodge = new Suburb("Stortford Lodge");
    Suburb mahora = new Suburb("Mahora");
    Suburb outside = new Suburb("Outside City");

    Street street1 = new Street("option street 1");
    Street street2 = new Street("option street 2");
    Street street3 = new Street("option street 3");
    Street street4 = new Street("option street 4");

    //exit streets aren't necessary
    Street karamu = new Street("Karamu Road");
    Street havelock = new Street("Havelock Road");
    Street railway = new Street("Railway Road");
    Street omahu = new Street("Omahu Road");

    Suburb[] suburbs = new Suburb[5];

    public City() {
        suburbs[0] = mayfair;
        suburbs[1] = akina;
        suburbs[2] = stortfordLodge;
        suburbs[3] = mahora;
        suburbs[4] = outside;

        street1.setSuburbs(stortfordLodge, mahora, outside);
        street2.setSuburbs(akina, mayfair, outside);
        street3.setSuburbs(mayfair, stortfordLodge, outside);
        street4.setSuburbs(mahora, akina, outside);

        mayfair.setStreets(street2, street3);
        akina.setStreets(street4, street2);
        stortfordLodge.setStreets(street3, street1);
        mahora.setStreets(street1, street4);

        drivers = new Driver[5];
        drivers[0] = new Driver("Driver 1");
        drivers[1] = new Driver("Driver 2");
        drivers[2] = new Driver("Driver 3");
        drivers[3] = new Driver("Driver 4");
        drivers[4] = new Driver("Driver 5");
    }

    public Driver getDriver(int driver) {
        return drivers[driver];
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public Suburb pickSuburb() {
        return suburbs[RANGEN.nextInt(4)];
    }

    public void addDriver(Driver driver) {
        currentSuburb = pickSuburb();
        currentSuburb.addDriver(driver);
    }

    Suburb currentSuburb;

    public void move(Driver driver) {
        while (!driver.getEnd().equals("Outside City")) {
            Street street = currentSuburb.moveToStreet();
            currentSuburb = street.moveToSuburb();
        }
    }

    public void run() {
        for (Driver i : drivers) {
            addDriver(i);
            move(i);
            i.travelDetails();
            i.exitMessage();
            i.akinaMessage();
            i.akinaAdditionalMessage();
            System.out.println("-----");
        }
    }
}
