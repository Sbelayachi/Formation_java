package org.example.utils;

import org.example.entity.TodoList;

import java.util.Scanner;

public class Ihm {

    private Scanner scanner;

    private String choix;

    private TodoList todoList;

    public IHM(){

        scanner = new Scanner(System.in);
        todoList = new TodoList();
    }

    public void start() {
        System.out.println("===== Exercice : TODO-LISTE ====== ");
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    System.out.println("QUITTER");
                    break;
                default:
                    System.out.println("choix invalide");

            }
        } while (!choix.equals("0"));

    }
}
