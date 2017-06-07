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
 * @author Hamish
 */
public class CitySimulator {

    protected static Random RANGEN = new Random();
    protected static boolean STOP;

    public static void main(String[] args) {
        //user given pseudorandom seed 
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer seed:");
        if (!in.hasNextInt()) {
                System.out.print("You did not enter an integer, goodbye.");
                STOP = true;
        }
        if (!STOP) {
            int seed = in.nextInt();
            in.close();
            RANGEN.setSeed(seed);
            //run simulation
            City city = new City();
            city.run();
        }
    }
}
