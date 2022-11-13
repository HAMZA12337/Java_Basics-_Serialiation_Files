package metier;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IMetierClient {

    public Client addClient(Client c);
    public List<Client> getAllClients() throws IOException, ClassNotFoundException;
    public Client findClientById(long id) ;
    public void deleteClient(long id);
    public void saveAllClients() throws IOException;


}
