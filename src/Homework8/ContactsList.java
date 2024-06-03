package Homework8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContactsList {
    Logger logger = Logger.getLogger(com.sun.tools.javac.Main.class.getName());

    private List<String> contacts;

    public ContactsList() {
        this.contacts = new ArrayList<>();
    }

    public void loadContactsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while((line = reader.readLine()) != null) {
                contacts.add(line);
            }
            logger.log(Level.INFO, "Contacts loaded successfully from file: " + filename);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error loading contacts from file: " + filename);
            e.printStackTrace();
        }
    }

    public void addContact(String contact) {
        contacts.add(contact);
        logger.log(Level.INFO, "Contact add successfully: " + contact);
    }

    public void deleteContact(String contact) {
        if (contacts.remove(contact)) {
            logger.log(Level.INFO, "Contact deleted successfilly: " + contact);
        } else {
            logger.log(Level.SEVERE, "Contact not found: " + contact);
        }
    }

    public void editContact(String oldContact, String newContact) {
        int index = contacts.indexOf(oldContact);
        if (index != -1) {
            contacts.add(index, newContact);
            logger.log(Level.INFO, "Contact edited successfully. Old Contact: " + oldContact + " to New Contact: " + newContact);
        } else {
            logger.log(Level.SEVERE, "Contact not found: " + oldContact);
        }
    }

    public void saveContactsToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String contact: contacts) {
                writer.write(contact);
                writer.newLine();
            }
            logger.log(Level.INFO, "Contacts saved successfully to file: " + fileName);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error saving contacts to file: " + fileName);
            e.printStackTrace();
        }
    }

    public void showContacts() {
        System.out.println("Contacts list:");
        for (String contact: contacts) {
            logger.log(Level.INFO, contact);
        }
    }
}
