package application;

import metier.DossierContact;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        DossierContact ds = new DossierContact();
        int choix ;
        do
        {
            System.out.println("\nMenu:\n");
            System.out.println("1-Ajouter un nouveau contact. \n");
            System.out.println("2-Rechercher un numéro de téléphone.\n");
            System.out.println("3-Supprimer un contact.\n");
            System.out.println("4-Changer le numéro de téléphone d’un contact.\n");
            System.out.println("5- Quitter");
            System.out.println("Votre choix : ");
            Scanner sc=new Scanner(System.in);
            choix=sc.nextInt();

       switch(choix){

           case 1 :ds.AjoutContact("hamza","0696792627");break;
           case 2 :ds.rechercherNumero("hamza");break;
           case 3 :ds.SupprimerContact("hamza") ;break;
           case 4 :ds.changerNumero("hamid","0661789595") ;break;
           case 5 : ;break;
           default:
               System.out.println("votre choix n'est pas valide !!!");
  }

        }
        while (choix < 1 || choix > 5);








    }
}