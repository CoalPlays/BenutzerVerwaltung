package GUI;

import javax.swing.*;
import java.awt.*;

public class CreateGUI {

    private JFrame frame = new JFrame();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JLabel title = new JLabel("Erstellen", SwingConstants.CENTER);
    private JLabel data;

    private JTextField field1 = new JTextField();
    private JTextField field2 = new JTextField();
    private JTextField field3 = new JTextField();
    private JTextField field4 = new JTextField();
    private JTextField field5 = new JTextField();
    private JTextField field6 = new JTextField();
    private JTextField field7 = new JTextField();
    private JTextField field8 = new JTextField();

    private JButton backBtn = new JButton("Zurück");
    private JButton createBtn = new JButton("Create");


    public static void main(String[] args) {
        CreateGUI a = new CreateGUI();
    }

    public CreateGUI() {
        frame.setLayout(new BorderLayout());
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout(8,2));
        panel2.setBorder(BorderFactory.createEmptyBorder(20,100,0,100));
        panel3.setLayout(new GridLayout(1,2));



        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);

        panel1.add(title, BorderLayout.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 40));

        panel2.add(getLabel("Name"));
        panel2.add(field1);
        panel2.add(getLabel("Vorname"));
        panel2.add(field2);
        panel2.add(getLabel("Geburtsdatum"));
        panel2.add(field3);
        panel2.add(getLabel("Geschlecht"));
        panel2.add(field4);
        panel2.add(getLabel("Vorname"));
        panel2.add(field5);
        panel2.add(getLabel("PLZ"));
        panel2.add(field6);
        panel2.add(getLabel("Ort"));
        panel2.add(field7);
        panel2.add(getLabel("Telefonnummer"));
        panel2.add(field8);

        panel3.setPreferredSize(new Dimension(700,60));
        panel3.add(backBtn);
        backBtn.setFont(new Font("Arial", Font.PLAIN, 20));
        panel3.add(createBtn);
        createBtn.setFont(new Font("Arial", Font.PLAIN, 20));



        frame.setTitle("Benutzer erstellen");
        frame.setSize(700, 1000);
        frame.setVisible(true);
    }

    private JLabel getLabel(String name){
        data = new JLabel(name);
        data.setFont(new Font("Arial", Font.PLAIN, 20));
        return data;
    }
}
