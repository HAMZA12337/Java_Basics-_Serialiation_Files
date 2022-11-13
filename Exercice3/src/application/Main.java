package application;

import metier.Client;
import metier.MetierClientImpl;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        MetierClientImpl t1=new MetierClientImpl("hamza");
        Client c1=new Client("A122","HAMZA","BRAIMI","CASABLANCAA","0696792627","hamza.braimi33@gmail.com");






int choix;
        do
        {
            System.out.println("\nMenu:\n");
            System.out.println("1-Ajouter un nouveau client dans la liste. \n");
            System.out.println("2-Afficher un client par son id..\n");
            System.out.println("3-Afficher la liste des clients..\n");
            System.out.println("4-Supprimer un client par id..\n");
            System.out.println("5-Sauvegarder les clients");

            System.out.println("Votre choix : ");
            Scanner sc=new Scanner(System.in);
            choix=sc.nextInt();

            switch(choix){

                case 1 :  t1.addClient(c1);break;
                case 2 :t1.deleteClient(12);break;
                case 3 :t1.getAllClients();break;
                case 4 :t1.findClientById(12);break;
                case 5 :  t1.saveAllClients();;break;
                default:
                    System.out.println("votre choix n'est pas valide !!!");
            }

        }
        while (choix < 1 || choix > 7);






   }
}