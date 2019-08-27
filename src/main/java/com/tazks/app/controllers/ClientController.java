package com.tazks.app.controllers;

import com.tazks.app.model.Client;
import com.tazks.app.services.ClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Slf4j
@Controller
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public String listClientsPage(Model model) {
        model.addAttribute("clients",clientService.findAll());
        return "client/list";
    }

    @GetMapping("/new")
    public String newClient(Model model) {
        model.addAttribute("client", new Client());
        return "client/client_form";
    }

    @GetMapping("/{id}/update")
    public String getById(@PathVariable Long id, Model model) {
        model.addAttribute("client", clientService.findById(id));
        return "client/client_form";
    }

    @GetMapping("/{id}/delete")
    public String deleteClient(@PathVariable Long id) {
        clientService.deleteById(id);
        return "redirect:/client";
    }

    @PostMapping("/")
    public String addClient(@ModelAttribute Client client) {
        Client savedClient = clientService.save(client);
        return "redirect:/client";
    }

}
