package view;

import javax.swing.*;

public class StudentPanel {
    private JPanel studentPanel;

    private JLabel firstnameLabel;
    private JLabel lastnameLabel;
    private JLabel RFIDLabel;
    private JTextField firstnameTextField;
    private JTextField lastnameTextField;
    private JTextField RFIDField;
    private JButton saveStudentButton;
    private JButton nextStudentButton;
    private JButton previousStudentButton;
    private JButton searchStudentButton;


    public StudentPanel() {
        this.studentPanel = new JPanel();
        this.firstnameLabel = new JLabel("Fist Name");
        this.lastnameLabel = new JLabel("Last Name");
        this.RFIDLabel = new JLabel("RFID");
        this.firstnameTextField = new JTextField();
        this.lastnameTextField = new JTextField();
        this.RFIDField = new JTextField();
        this.saveStudentButton = new JButton("Save");
        this.nextStudentButton = new JButton("Next");
        this.previousStudentButton = new JButton("Previous");
        this.searchStudentButton = new JButton("Search");
        initPanel();
    }

    public void initPanel(){
        studentPanel.setLayout(null);

        this.firstnameLabel.setBounds(10, 10, 80, 25);
        this.studentPanel.add(firstnameLabel);

        this.lastnameLabel.setBounds(10, 50, 80, 25);
        this.studentPanel.add(lastnameLabel);

        this.RFIDLabel.setBounds(10, 90, 80, 25);
        this.studentPanel.add(RFIDLabel);

        this.firstnameTextField.setBounds(100, 10, 160, 25);
        this.studentPanel.add(firstnameTextField);

        this.lastnameTextField.setBounds(100, 50, 160, 25);
        this.studentPanel.add(lastnameTextField);

        this.RFIDField.setBounds(100,90,160,25);
        this.studentPanel.add(RFIDField);

        this.saveStudentButton.setBounds(350, 10, 90, 25);
        this.studentPanel.add(saveStudentButton);

        this.nextStudentButton.setBounds(350, 50, 90, 25);
        this.studentPanel.add(nextStudentButton);

        this.previousStudentButton.setBounds(350, 90, 90, 25);
        this.studentPanel.add(previousStudentButton);

        this.searchStudentButton.setBounds(350, 130, 90, 25);
        this.studentPanel.add(searchStudentButton);


    }

    public JTextField getFirstnameTextField() {
        return firstnameTextField;
    }

    public void setFirstnameTextField(JTextField firstnameTextField) {
        this.firstnameTextField = firstnameTextField;
    }

    public JTextField getLastnameTextField() {
        return lastnameTextField;
    }

    public void setLastnameTextField(JTextField lastnameTextField) {
        this.lastnameTextField = lastnameTextField;
    }

    public JTextField getRFIDField() {
        return RFIDField;
    }

    public void setRFIDField(JTextField RFIDField) {
        this.RFIDField = RFIDField;
    }

    public JButton getSaveStudentButton() {
        return saveStudentButton;
    }

    public void setSaveStudentButton(JButton saveStudentButton) {
        this.saveStudentButton = saveStudentButton;
    }

    public JButton getNextStudentButton() {
        return nextStudentButton;
    }

    public void setNextStudentButton(JButton nextStudentButton) {
        this.nextStudentButton = nextStudentButton;
    }

    public JButton getPreviousStudentButton() {
        return previousStudentButton;
    }

    public void setPreviousStudentButton(JButton previousStudentButton) {
        this.previousStudentButton = previousStudentButton;
    }

    public JButton getSearchStudentButton() {
        return searchStudentButton;
    }

    public void setSearchStudentButton(JButton searchStudentButton) {
        this.searchStudentButton = searchStudentButton;
    }


    public JPanel getStudentPanel() {
        return studentPanel;
    }
}
