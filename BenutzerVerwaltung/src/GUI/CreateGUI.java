package GUI;

import javax.swing.*;
import java.awt.*;

public class CreateGUI {

    private JFrame frame = new JFrame();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JLabel title = new JLabel("Erstellen", SwingConstants.CENTER);
    private JLabel Name = new JLabel("Name");
    private JLabel Vorname = new JLabel("Vorname");
    private JLabel Geburtsdatum = new JLabel("Geburtsdatum");
    private JLabel Geschlecht = new JLabel("Geschlecht");
    private JLabel Strasse = new JLabel("Strasse");
    private JLabel PLZ = new JLabel("PLZ");
    private JLabel Ort = new JLabel("Ort");
    private JLabel Telefonnummer = new JLabel("Telefonnummer");

    private JTextField field1 = new JTextField();
    private JTextField field2 = new JTextField();
    private JTextField field3 = new JTextField();
    private JTextField field4 = new JTextField();
    private JTextField field5 = new JTextField();
    private JTextField field6 = new JTextField();
    private JTextField field7 = new JTextField();
    private JTextField field8 = new JTextField();


    public static void main(String[] args) {
        CreateGUI a = new CreateGUI();
    }

    public CreateGUI() {
        frame.setLayout(new BorderLayout());
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout(8,2));
        Name.setFont(new Font("Arial", Font.PLAIN, 20));
        panel2.setBorder(BorderFactory.createEmptyBorder(20,100,0,100));



        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);

        panel1.add(title, BorderLayout.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 40));

        panel2.add(Name);
        panel2.add(field1);
        panel2.add(Vorname);
        panel2.add(field2);
        panel2.add(Geburtsdatum);
        panel2.add(field3);
        panel2.add(Geschlecht);
        panel2.add(field4);
        panel2.add(Strasse);
        panel2.add(field5);
        panel2.add(PLZ);
        panel2.add(field6);
        panel2.add(Ort);
        panel2.add(field7);
        panel2.add(Telefonnummer);
        panel2.add(field8);



        frame.setTitle("Benutzer erstellen");
        frame.setSize(700, 1000);
        frame.setVisible(true);
    }
}
