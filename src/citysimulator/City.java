/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citysimulator;

import static citysimulator.CitySimulator.RANGEN;

/**
 *
 * @author Hamish
 */
class City {

    protected final Driver[] drivers;

    Suburb mayfair = new Suburb("Mayfair");
    Suburb akina = new Suburb("Akina");
    Suburb stortfordLodge = new Suburb("Stortford Lodge");
    Suburb mahora = new Suburb("Mahora");
    Suburb outside = new Suburb("Outside City");

    Street street1 = new Street("option street 1");
    Street street2 = new Street("option street 2");
    Street street3 = new Street("option street 3");
    Street street4 = new Street("option street 4");

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
            driver.travelDetails();
        }
    }

    public void run() {
        for (Driver i : drivers) {
            addDriver(i);
            move(i);
            i.exitMessage();
            i.akinaMessage();
            i.akinaAdditionalMessage();
            System.out.println("-----");
        }
    }
}
