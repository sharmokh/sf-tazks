package com.tazks.app.services;

import com.tazks.app.model.Client;
import com.tazks.app.repositories.ClientRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ClientServiceImplTest {

    final Long ID = 1L;
    Client client;
    ClientServiceImpl clientService;

    @Mock
    ClientRepository clientRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        client = Client.builder().id(ID).build();
        clientService = new ClientServiceImpl(clientRepository);
    }

    @Test
    public void testFindAll() {
        List<Client> clientData = new ArrayList<>();
        clientData.add(client);

        when(clientRepository.findAll()).thenReturn(clientData);
        List<Client> clients = clientService.findAll();

        assertEquals(1, clients.size());
        verify(clientRepository, times(1)).findAll();
    }

    @Test
    public void testFindById() {
        when(clientRepository.findById(anyLong())).thenReturn(Optional.of(client));
        Client returnedClient = clientService.findById(ID);

        assertNotNull(returnedClient);
        verify(clientRepository, times(1)).findById(anyLong());
        verify(clientRepository, never()).findAll();
    }

    @Test
    public void testFindByIdNotFound() {
        when(clientRepository.findById(anyLong())).thenReturn(Optional.empty());
        Client returnedClient = clientService.findById(2L);

        assertNull(returnedClient);
        verify(clientRepository, times(1)).findById(anyLong());
        verify(clientRepository, never()).findAll();
    }

    @Test
    public void testSave() {
        when(clientRepository.save(any())).thenReturn(client);
        Client returnedClient = clientService.save(client);

        assertNotNull(returnedClient);
        verify(clientRepository, times(1)).save(any());
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void testDeleteById() {
    }
}