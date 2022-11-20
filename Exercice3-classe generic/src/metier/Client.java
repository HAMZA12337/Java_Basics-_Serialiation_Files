package metier;

import java.io.Serializable;
import java.util.Objects;

public class Client implements Serializable {

    private long id;
    private String nom;
    private   String prénom;
    private String adresse;
    private String tel;
    private String email;


    public Client(long id, String nom, String prénom, String adresse, String tel, String email) {
        this.id = id;
        this.nom = nom;
        this.prénom = prénom;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Client client = (Client) o;
        return id == client.id && Objects.equals(nom, client.nom) && Objects.equals(prénom, client.prénom);
    }


}
