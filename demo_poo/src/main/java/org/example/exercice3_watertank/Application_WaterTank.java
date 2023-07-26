package org.example.exercice3_watertank;

import org.example.demo_statique.Maison;

public class Application_WaterTank {

    public static void main(String[] args) {

        // test
        System.out.println(WaterTank.volume_total);

        /// réponse exo watertank1.getVolume
        WaterTank waterTank1 = new WaterTank(60.,50.00,10);
        System.out.println("WaterTank1 Volume de départ : " + waterTank1.getNiveau());

        WaterTank waterTank2 = new WaterTank(50,65,15);
        System.out.println("WaterTank2 Volume de départ : " + waterTank2.getNiveau());

        /// réponse exo remplir et vider

        waterTank1.remplir(35);
        waterTank2.remplir(20);


    }

}
