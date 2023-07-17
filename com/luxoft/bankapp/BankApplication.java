package com.luxoft.bankapp;

import java.util.List;

import com.luxoft.bankapp.domain.*;
import com.luxoft.bankapp.service.BankService;

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Client client1 = new Client("John Doe");
        bank.addClient(client1);

        Client client2 = new Client("Jane Smith");
        bank.addClient(client2);

        System.out.println("Printed clients: " + bank.getPrintedClients());
        System.out.println("Emailed clients: " + bank.getEmailedClients());
        System.out.println("Debugged clients: " + bank.getDebuggedClients());
    }
}
