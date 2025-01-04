package services;
import dao.ClientDao;
import client.Client;
import java.util.List;
public class ClientService {
    private ClientDao clientsDao = new ClientDao();

    public ClientService() {
    }

    public Client findClient(int id) {
        return clientsDao.findById(id);
    }

    public void saveClient(Client client) {
        clientsDao.save(client);
    }

    public void deleteClient(Client client) {
        clientsDao.delete(client);
    }

    public void updateUser(Client client) {
        clientsDao.update(client);
    }

    public List<Client> findAllClient() {
        return clientsDao.findAll();
    }
}
