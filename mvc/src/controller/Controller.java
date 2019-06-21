package controller;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.View;


public class Controller implements ActionListener {

    private View view;
    private Model model;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
        this.view.multiplicarButton.addActionListener(this);
    }

    public void start(){
        view.setTitle("MVC 123");
        view.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e){

        model.setUno(Integer.parseInt(view.textField1.getText()));
        model.setDos(Integer.parseInt(view.textField2.getText()));
        model.Result();
        view.xTextField.setText(String.valueOf(model.getRes()));
    }
}
