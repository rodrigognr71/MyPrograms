package controller;

import model.PersonModel;
import model.ContactsModel;
import view.View;

import javax.swing.*;

public class Controller {
    private View view;
    private ContactsModel contacts;

    public Controller(ContactsModel contacts, View view) {
        this.view = view;
        this.contacts = contacts;
        initView();
    }

    public void initView() {
        view.getFirstnameTextField().setText("");
        view.getLastnameTextField().setText("");
    }

    public void initController() {
        view.getSaveButton().addActionListener(e -> saveUser());
        view.getSearchButton().addActionListener(e -> searchByUser());
        view.getPreviousButton().addActionListener(e -> previous());
        view.getNextButton().addActionListener(e -> next());
    }

    private void saveUser() {
        PersonModel personModel = new PersonModel(view.getFirstnameTextField().getText(), view.getLastnameTextField().getText());
        showUser(personModel);

        contacts.addContact(personModel);
        JOptionPane.showMessageDialog(null, "User saved : " + personModel.getFirstname()
                + " " + personModel.getLastname(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showUser(PersonModel personModel) {

        view.getNameSaveTextArea().setText(personModel.getFirstname() + " " + personModel.getLastname());
    }

    public void searchByUser() {
        PersonModel personModel = new PersonModel(view.getFirstnameTextField().getText(), view.getLastnameTextField().getText());
        PersonModel personSearched = this.contacts.searchContact(personModel);
        if (personSearched != null) {
            view.getNameSaveTextArea().setText(personSearched.getFirstname() + " " + personSearched.getLastname());
        }
    }

    private void previous() {
        PersonModel personModel = new PersonModel(view.getFirstnameTextField().getText(), view.getLastnameTextField().getText());
        PersonModel previousPerson = this.contacts.previousContact(personModel);
        if (previousPerson != null) {
            view.getFirstnameTextField().setText(previousPerson.getFirstname());
            view.getLastnameTextField().setText(previousPerson.getLastname());
        } else {
            JOptionPane.showMessageDialog(null, "User not found", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void next() {
        PersonModel personModel = new PersonModel(view.getFirstnameTextField().getText(), view.getLastnameTextField().getText());
        PersonModel nextPerson = this.contacts.nextContact(personModel);
        if (nextPerson != null) {
            view.getFirstnameTextField().setText(nextPerson.getFirstname());
            view.getLastnameTextField().setText(nextPerson.getLastname());
        } else {
            JOptionPane.showMessageDialog(null, "User not found", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}