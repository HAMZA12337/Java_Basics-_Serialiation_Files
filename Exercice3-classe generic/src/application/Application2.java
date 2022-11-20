package application;

import metier.Client;
import metier.MetierClientImpl;
import metier.MetierProduitImpl;
import metier.Produit;

import java.io.IOException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Client c1= new Client(122,"HAMZA","BRAIMI","Casablanca","0696792627","hamza.braimi33@gmail.com");
        MetierClientImpl pr1= new MetierClientImpl("ProduitFile");

        int choix;
        do
        {
            System.out.println("\n-------------------------------Menu-------------------------------------------:\n");
            System.out.println("1-Afficher la liste des produits. \n");
            System.out.println("2-Rechercher un produit par son id.\n");
            System.out.println("3-Ajouter un nouveau produit dans la liste.\n");
            System.out.println("4-Supprimer un client par id..\n");
            System.out.println("5-Sauvegarder les produits :");
            System.out.println("6-Quitter ce programme.:");

            System.out.println("Votre choix : ");
            Scanner sc=new Scanner(System.in);
            choix=sc.nextInt();

            switch(choix){

                case 1 : pr1.getAll() ;
                case 2 :pr1.findById(122);
                case 3 :pr1.add(c1);
                case 4 :pr1.delete(122);
                case 5 :pr1.saveAll();
                case 6:
                    System.out.println("Vous avez quitte le programme");
                    break;
                default:
                    System.out.println("-----------------------------votre choix n'est pas valide----------------------- !!!");
            }

        }
        while (choix < 1 || choix > 6);



















    }
}