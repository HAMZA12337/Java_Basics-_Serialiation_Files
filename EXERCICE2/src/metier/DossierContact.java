package metier;

import java.io.*;

public class DossierContact {

    private String[] nom;
    private String[] tel;


    public void AjoutContact(String nom, String tel) throws IOException {

        File f1 = new File("C:\\Users\\HAMZA\\Desktop\\repertoire telephonique\\" + nom + ".txt");

        if (f1.createNewFile()) {
            FileWriter myWriter = new FileWriter("C:\\Users\\HAMZA\\Desktop\\repertoire telephonique\\" + nom + ".txt");
            myWriter.write(tel);
            myWriter.close();
            System.out.println("File created: " + f1.getName());
        } else {
            System.out.println("File already exists.");
        }
    }


    public void changerNumero(String nom, String tel) throws IOException {
        File f1 = new File("C:\\Users\\HAMZA\\Desktop\\repertoire telephonique\\" + nom + ".txt");
        if (f1.exists()) {
            FileWriter myWriter = new FileWriter("C:\\Users\\HAMZA\\Desktop\\repertoire telephonique\\" + nom + ".txt");
            myWriter.write(tel);
            myWriter.close();

        } else {
            System.out.println("Contact not exists");
        }
    }
// rechercher par nom

    public void rechercherNumero(String nom) throws IOException {
        File f1 = new File("C:\\Users\\HAMZA\\Desktop\\repertoire telephonique\\" + nom + ".txt");
        if (f1.exists()) {
            FileReader myReader = new FileReader("C:\\Users\\HAMZA\\Desktop\\repertoire telephonique\\" + nom + ".txt");
            int i;

            System.out.println("le numero de tel de "+nom +" est :");
            while ((i = myReader.read()) != -1){
                System.out.print((char)i);

        }
            myReader.close();
        }else{
            System.out.println("Contact not exists");
        }}


  // Supprimer un contact

  public void SupprimerContact(String nom){
      File f1 = new File("C:\\Users\\HAMZA\\Desktop\\repertoire telephonique\\" + nom + ".txt");
      if (f1.exists()) {
             f1.delete();
          System.out.println("Contact deleted");
      } else {
          System.out.println("Contact not exists");
      }




  }











}





















