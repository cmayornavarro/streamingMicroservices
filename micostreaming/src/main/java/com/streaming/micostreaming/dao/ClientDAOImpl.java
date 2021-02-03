package com.streaming.micostreaming.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.streaming.micostreaming.model.Client;

@Repository
public class ClientDAOImpl implements ClientDAO {
    public static List<Client> clients = new ArrayList<>();

    static {
        clients.add(new Client(1, new String("Christian"), new String("Mayor"), new String("0782501148")));

    }

    @Override
    public List<Client> findAll() {
        return clients;
    }

    @Override
    public Client findById(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;

    }

    @Override
    public Client save(Client client) {
        clients.add(client);
        return client;

    }
}
