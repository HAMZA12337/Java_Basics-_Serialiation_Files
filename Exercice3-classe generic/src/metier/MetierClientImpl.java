package metier;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierClientImpl implements IMetier<Client>{


    private String fileName;
    private List<Client> listGener=new ArrayList<>();


    public MetierClientImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Client add(Client o) {
        if(!listGener.contains(o)){
            listGener.add(o);
            return o;}
        return  null; }

    @Override
    public List<Client> getAll() throws IOException, ClassNotFoundException {
        List<Produit> listTemp = new ArrayList<>();

        File f1=new File(fileName+".dat");
        FileInputStream file = new FileInputStream(f1);
        ObjectInputStream out = new ObjectInputStream(file);
        while(out.readObject()!=null){
            Produit c=(Produit)out.readObject();
            listTemp.add(c);
        }

        out.close();

        return null;
    }

    @Override
    public Client findById(long id) {
        if (!listGener.isEmpty()) {
            for (Client prod : listGener) {
                if (prod.getId()==(id)) {

                    return prod;
                }
            }

        }
        return null;}

    @Override
    public void delete(long id) {
        if(!listGener.isEmpty()){
            for (Client prod:listGener){
                if(prod.getId()==(id)) {
                    listGener.remove(prod);
                }
            }
        }
    }

    @Override
    public void saveAll() {

        try {
            //Saving of object in a file
            File f1=new File(fileName+".dat");
            FileOutputStream file = new FileOutputStream(f1);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object

            for(Client  c:listGener) {
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
