package metier;

import java.io.Serializable;
import java.util.Objects;

public class Client implements Serializable {

   private String id;
   private String nom ;
   private String prenom ;
   private String adresse ;
   private String tel;
   private String email;

   public Client(String id, String nom, String prenom, String adresse, String tel, String email) {
      this.id = id;
      this.nom = nom;
      this.prenom = prenom;
      this.adresse = adresse;
      this.tel = tel;
      this.email = email;
   }

   @Override
   public boolean equals(Object o) {

      Client client = (Client) o;
      return Objects.equals(id, client.id) && Objects.equals(nom, client.nom) && Objects.equals(prenom, client.prenom);
   }


   public String getId() {
      return id;
   }

   public String getNom() {
      return nom;
   }

   public String getPrenom() {
      return prenom;
   }

   public String getAdresse() {
      return adresse;
   }

   public String getTel() {
      return tel;
   }

   public String getEmail() {
      return email;
   }

   @Override
   public String toString() {
      return "Client{" +
              "id='" + id + '\'' +
              ", nom='" + nom + '\'' +
              ", prenom='" + prenom + '\'' +
              ", adresse='" + adresse + '\'' +
              ", tel='" + tel + '\'' +
              ", email='" + email + '\'' +
              '}';
   }
}
