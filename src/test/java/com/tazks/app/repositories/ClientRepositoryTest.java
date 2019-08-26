package com.tazks.app.repositories;

import com.tazks.app.model.Client;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ClientRepositoryTest {

    final String LAST_NAME_ONE = "Smith";
    final String LAST_NAME_TWO = "Smokes";

    @Autowired
    ClientRepository clientRepository;

    @Before
    public void setUp() throws Exception {
        Client clientOne = new Client().builder().lastName(LAST_NAME_ONE).build();
        clientRepository.save(clientOne);

        Client clientTwo = new Client().builder().lastName(LAST_NAME_TWO).build();
        clientRepository.save(clientTwo);

    }

    @Test
    public void testFindByLastName() throws Exception {
        Optional<Client> optionalClient = clientRepository.findByLastName(LAST_NAME_ONE);
        assertEquals(LAST_NAME_ONE, optionalClient.get().getLastName());
    }

    @Test
    public void testFindByLastNameLikeIgnoreCase() throws Exception {
        List<Client> clientList = clientRepository.findByLastNameLikeIgnoreCase("%Sm%");
        assertEquals(2,clientList.size());
    }
}