/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citysimulator;

/**
 *
 * @author Hamish
 */
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

    public void updateSuburb(String suburb) {
        start = end;
        end = suburb;
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
