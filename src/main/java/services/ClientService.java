package services;
import dao.ClientDao;
import client.Client;
import java.util.List;
public class ClientService {
    private static ClientDao clientDao = new ClientDao();

    public ClientService() {
    }

    public Client findClient(int id) {
        return clientDao.findById(id);
    }

    public void saveClient(Client client) {
        clientDao.save(client);
    }

    public void deleteClient(Client client) {
        clientDao.delete(client);
    }

    public void updateClient(Client client) {
        clientDao.update(client);
    }

    public List<Client> findAllClient() {
        return clientDao.findAll();
    }
}
