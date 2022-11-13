package metier;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierClientImpl implements IMetierClient {
    private List<Client> listClient = new ArrayList<>();
    private String nomFichier;


    public MetierClientImpl(String nomFichier) {

        this.nomFichier = nomFichier;
    }

    public Client addClient(Client c) {

        if (!listClient.contains(c)) {
            listClient.add(c);
            System.out.println("saved");
            return c;
        } else {
            System.out.println("Aleardy exists");
            return null;
        }

    }

    @Override
    public List<Client> getAllClients() throws IOException, ClassNotFoundException {

      List<Client> listTemp = new ArrayList<>();

        File f1=new File(nomFichier+".dat");
        FileInputStream file = new FileInputStream(f1);
        ObjectInputStream out = new ObjectInputStream(file);
while(out.readObject()!=null){
    Client c=(Client)out.readObject();
    listTemp.add(c);
}

out.close();

    return null;}


    @Override
    public Client findClientById(long id) {
       if(!listClient.isEmpty()){
               for(Client c :listClient){
                   if(c.getId().equals(id)){

                   return c;}
               }

       }
    return null;}

    @Override
    public void deleteClient(long id) {
        if(!listClient.isEmpty()){
            for(Client c :listClient){
                if(c.getId().equals(id)){
                       listClient.remove(c);
                }
            }
        }
    }

    @Override
    public void saveAllClients() throws IOException {
       try {
            //Saving of object in a file
           File f1=new File(nomFichier+".dat");
            FileOutputStream file = new FileOutputStream(f1);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object

            for(Client c:listClient) {
                out.writeObject(c);
            }
            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }


}
