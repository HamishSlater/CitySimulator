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

    public Street pickStreet(int random) {
        if (random < 1) {
            return streetLeft;
        }
        return streetRight;
    }

    public Street moveToStreet() {
        Street street = pickStreet(RANGEN.nextInt(2));
        street.addDriver(driver);
        return street;
    }
}
