package view;

import javax.swing.*;
import java.awt.*;

public class SubjectPanel {
    private JPanel subjectPanel;

    private JLabel subjectLabel;
    private JTextArea subjectTextArea;
    private JButton saveSubjectButton;
    private JButton searchSubjectButton;
    private JButton previousSubjectButton;
    private JButton nextSubjectButton;
    private JButton addSubjectButton;
    private JButton removeSubjectButton;
    private JButton editSubjectButton;
    private JTextField detailSubject;
    private JTextField subjectDetail;
    private JTextField idSubjectDetail;
    private JTextField finalGradeDetail;
    private JLabel detatilSubjectLabel;


    public SubjectPanel() {
        this.subjectPanel = new JPanel();
        this.subjectLabel = new JLabel("Subjects");
        this.subjectTextArea = new JTextArea();
        this.saveSubjectButton = new JButton();
        this.searchSubjectButton = new JButton();
        this.previousSubjectButton = new JButton(">");
        this.nextSubjectButton= new JButton("<");
        this.addSubjectButton = new JButton("Add");
        this.removeSubjectButton = new JButton("Remove");
        this.editSubjectButton = new JButton("Edit");
        this.detailSubject = new JTextField("Details");
        this.subjectDetail = new JTextField("Subject");
        this.idSubjectDetail = new JTextField("ID");
        this.finalGradeDetail = new JTextField("Final Grade");
        this.detatilSubjectLabel = new JLabel("Details");

    }

    public void initSubjectPanel(){
        this.subjectPanel.setLayout(null);
        //this.subjectPanel.setBounds(50, 130, 160, 100);
        subjectPanel.setBackground(Color.gray);

        this.subjectLabel.setBounds(40,80,200,200);
        subjectPanel.add(subjectLabel);

        this.subjectTextArea.setBounds(50, 210, 160, 180);
        subjectTextArea.setEditable(false);
        subjectPanel.add(subjectTextArea);

        this.previousSubjectButton.setBounds(250, 210, 80, 25);
        subjectPanel.add(previousSubjectButton);

        this.nextSubjectButton.setBounds(250, 240, 80, 25);
        subjectPanel.add(nextSubjectButton);

        this.addSubjectButton.setBounds(250, 270, 80, 25);
        subjectPanel.add(addSubjectButton);

        this.editSubjectButton.setBounds(250, 300, 80, 25);
        subjectPanel.add(editSubjectButton);

        this.removeSubjectButton.setBounds(250, 330, 80, 25);
        subjectPanel.add(removeSubjectButton);

        this.detatilSubjectLabel.setBounds(400,80,300,200);
        subjectPanel.add(detatilSubjectLabel);

    }

    public JPanel getSubjectPanel() {
        return subjectPanel;
    }

}
