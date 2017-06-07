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
class Street {

    private final String name;
    private final Suburb[] suburbs = new Suburb[3];
    private Driver driver;

    public Street(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Driver getDriver() {
        return driver;
    }

    public Suburb getSuburb(int index) {
        return suburbs[index];
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
