package org.example.ExerciceHotel;

public class MainHotel {
    public static void main(String[] args) {

        Client client1 = new Client(1, "BELAYACHI", "Saliha", "0623463326");
        System.out.println(client1.toString());

        Chambre chambre1 = new Chambre(10, true, 50,120.50);
        System.out.println(client1.toString());
    }
}
