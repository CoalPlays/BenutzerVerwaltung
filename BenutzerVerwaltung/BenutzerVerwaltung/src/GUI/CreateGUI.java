package GUI;

import Data.IdGenerator;
import Data.UserData;
import Model.Model;
import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateGUI {

    private Controller controller;
    private JFrame frame = new JFrame();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JLabel title = new JLabel("Erstellen", SwingConstants.CENTER);
    private JLabel data;

    private String[] geschlechtStrings = { "Keine Angabe", "Männlich", "Weiblich", "Anderes"};

    private JTextField field1 = new JTextField();
    private JTextField field2 = new JTextField();
    private JTextField field3 = new JTextField("dd.mm.jjjj");
    private JComboBox geschlecht = new JComboBox(geschlechtStrings);
    private JTextField field5 = new JTextField();
    private JTextField field6 = new JTextField();
    private JTextField field7 = new JTextField();
    private JTextField field8 = new JTextField();

    private JButton backBtn = new JButton("Zurück");
    private JButton createBtn = new JButton("Erstellen");

    public CreateGUI(Controller controller) {
        this.controller = controller;
        frame.setLayout(new BorderLayout());
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout(8,2, 0, 50));
        panel2.setBorder(BorderFactory.createEmptyBorder(20,100,0,100));
        panel3.setLayout(new GridLayout(1,2));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);

        panel1.add(title, BorderLayout.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 40));

        panel2.add(getLabel("Name*:"));
        panel2.add(field1);
        panel2.add(getLabel("Vorname*:"));
        panel2.add(field2);
        panel2.add(getLabel("Geburtsdatum:"));
        panel2.add(field3);
        panel2.add(getLabel("Geschlecht:"));
        panel2.add(geschlecht);
        panel2.add(getLabel("Strasse:"));
        panel2.add(field5);
        panel2.add(getLabel("PLZ:"));
        panel2.add(field6);
        panel2.add(getLabel("Ort:"));
        panel2.add(field7);
        panel2.add(getLabel("Telefonnummer:"));
        panel2.add(field8);
        field1.setFont(new Font("Arial", Font.PLAIN, 20));
        field2.setFont(new Font("Arial", Font.PLAIN, 20));
        field3.setFont(new Font("Arial", Font.PLAIN, 20));
        geschlecht.setFont(new Font("Arial", Font.PLAIN, 20));
        field5.setFont(new Font("Arial", Font.PLAIN, 20));
        field6.setFont(new Font("Arial", Font.PLAIN, 20));
        field7.setFont(new Font("Arial", Font.PLAIN, 20));
        field8.setFont(new Font("Arial", Font.PLAIN, 20));

        panel3.setPreferredSize(new Dimension(700,60));
        panel3.add(backBtn);
        backBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(createBtn);
        createBtn.setFont(new Font("Arial", Font.PLAIN, 20));

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setMainVis();
            }
        });

        createBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (field1.getText().equals("") || field2.getText().equals("")){
                    if (field1.getText().equals("")){
                        field1.setBackground(new Color(255, 105, 97));
                    }
                    if (field2.getText().equals("")){
                        field2.setBackground(new Color(255, 105, 97));
                    }
                }else{
                    UserData uData = new UserData(controller.getID(), field1.getText(), field2.getText(), field3.getText(), (String)geschlecht.getSelectedItem(), field5.getText(), field6.getText(), field7.getText(), field8.getText());
                    controller.addUser(uData);
                    controller.setMainVis();
                }
            }
        });

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Benutzer erstellen");
        frame.setSize(700, 1000);
        frame.setVisible(true);
    }

    private JLabel getLabel(String name){
        data = new JLabel(name);
        data.setFont(new Font("Arial", Font.PLAIN, 20));
        return data;
    }

    public JFrame getFrame() {
        return frame;
    }
}
