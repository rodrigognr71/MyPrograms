package controller;

import model.Model;
import view.View;

import javax.swing.JOptionPane;
public class Controller {
    private Model model;
    private View view;
    public Controller(Model m, View v) {
        model = m;
        view = v;
        initView();
    }
    public void initView() {
        view.getFirstnameTextField().setText(model.getFirstname());
        view.getLastnameTextField().setText(model.getLastname());
    }
    public void initController() {
        view.getSaveButton().addActionListener(e -> saveUser());
        //view.getLastnameSaveButton().addActionListener(e -> saveLastname());
       // view.getHello().addActionListener(e -> sayHello());
       // view.getBye().addActionListener(e -> sayBye());
    }
    private void saveUser() {
        model = new Model(view.getFirstnameTextField().getText(), view.getLastnameTextField().getText());
        model.setFirstname(view.getFirstnameTextField().getText());
        JOptionPane.showMessageDialog(null, "User saved : " + model.getFirstname() + model.getLastname(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    private void Previous() {
       // model.setLastname(view.getLastnameTextfield().getText());
        //JOptionPane.showMessageDialog(null, "Lastname saved : " + model.getLastname(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    private void Next() {
        //JOptionPane.showMessageDialog(null, "Hello " + model.getFirstname() + " " + model.getLastname(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }
    private void Search() {

    }
}