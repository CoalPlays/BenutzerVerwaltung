package GUI;

import Data.IdGenerator;
import Data.UserData;
import Model.Model;
import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewGUI {

    private Controller controller;
    private JFrame frame = new JFrame();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JLabel title = new JLabel("Ansicht", SwingConstants.CENTER);
    private JLabel data;

    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();
    private JLabel label4 = new JLabel();
    private JLabel label5 = new JLabel();
    private JLabel label6 = new JLabel();
    private JLabel label7 = new JLabel();
    private JLabel label8 = new JLabel();

    private JButton backBtn = new JButton("Zurück");




    public ViewGUI(Controller controller, int index) {
        this.controller = controller;
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
        panel2.add(label1);
        label1.setText(controller.getName(index, 1));
        panel2.add(getLabel("Vorname"));
        panel2.add(label2);
        label2.setText(controller.getName(index, 2));
        panel2.add(getLabel("Geburtsdatum"));
        panel2.add(label3);
        label3.setText(controller.getName(index, 3));
        panel2.add(getLabel("Geschlecht"));
        panel2.add(label4);
        label4.setText(controller.getName(index, 4));
        panel2.add(getLabel("Strasse"));
        panel2.add(label5);
        label5.setText(controller.getName(index, 5));
        panel2.add(getLabel("PLZ"));
        panel2.add(label6);
        label6.setText(controller.getName(index, 6));
        panel2.add(getLabel("Ort"));
        panel2.add(label7);
        label7.setText(controller.getName(index, 7));
        panel2.add(getLabel("Telefonnummer"));
        panel2.add(label8);
        label8.setText(controller.getName(index, 8));
        label1.setFont(new Font("Arial", Font.PLAIN, 20));
        label2.setFont(new Font("Arial", Font.PLAIN, 20));
        label3.setFont(new Font("Arial", Font.PLAIN, 20));
        label4.setFont(new Font("Arial", Font.PLAIN, 20));
        label5.setFont(new Font("Arial", Font.PLAIN, 20));
        label6.setFont(new Font("Arial", Font.PLAIN, 20));
        label7.setFont(new Font("Arial", Font.PLAIN, 20));
        label8.setFont(new Font("Arial", Font.PLAIN, 20));

        panel3.setPreferredSize(new Dimension(700,60));
        panel3.add(backBtn);
        backBtn.setFont(new Font("Arial", Font.PLAIN, 20));


        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setMainVis();
            }
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Detail-Ansicht");
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

