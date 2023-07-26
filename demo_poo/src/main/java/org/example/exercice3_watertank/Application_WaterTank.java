package org.example.exercice3_watertank;

import org.example.demo_statique.Maison;

public class Application_WaterTank {

    public static void main(String[] args) {
        WaterTank waterTank1 = new WaterTank(60.,50.00,10);
        System.out.println("WaterTank1 Volume de départ : " + waterTank1.getNiveau());

        WaterTank waterTank2 = new WaterTank(50,65,15);
        System.out.println("WaterTank2 Volume de départ : " + waterTank2.getNiveau());


    }

}
