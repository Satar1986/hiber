
import client.Client;
import services.ClientService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        ClientService clientService = new ClientService();
        Client client = new Client("Masha",26);

        clientService.saveClient(client);
        clientService.updateClient(client);


    }
}