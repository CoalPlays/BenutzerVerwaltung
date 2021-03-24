package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {

    private JFrame frame = new JFrame();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JButton addBtn = new JButton("+");
    private JButton detailBtn = new JButton("Details");
    private JLabel title = new JLabel("Benutzer", SwingConstants.CENTER);
    private JLabel idname = new JLabel("ID                      Name");
    JList list = new JList();
    DefaultListModel model = new DefaultListModel();


    public static void main(String[] args) {

        MainGUI a = new MainGUI();
    }

    public MainGUI() {
        frame.setLayout(new BorderLayout());
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);

        panel1.add(title, BorderLayout.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 40));

        panel1.add(addBtn, BorderLayout.EAST);
        addBtn.setPreferredSize(new Dimension(70,70));
        addBtn.setFont(new Font("Arial", Font.PLAIN, 40));
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateGUI a = new CreateGUI();//opens Create view
            }
        });

        panel2.add(idname, BorderLayout.NORTH);
        idname.setFont(new Font("Arial", Font.PLAIN, 24));
        idname.setBorder(BorderFactory.createEmptyBorder(20,80,0,0));


        list.setModel(model);
        list.setFont(new Font("Arial", Font.PLAIN, 24));
        panel2.add(list, BorderLayout.CENTER);
        list.setBorder(BorderFactory.createEmptyBorder(50,80,0,80));
        model.addElement("001                       Raquel Lima");
        model.addElement("001                       Raquel Lima");

        panel3.add(detailBtn);
        detailBtn.setPreferredSize(new Dimension(700,120));
        detailBtn.setFont(new Font("Arial", Font.PLAIN, 40));
        detailBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewGUI a = new ViewGUI();//opens Create view
            }
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Benutzer-Verwaltung");
        frame.setSize(700, 1000);
        frame.setVisible(true);
    }

}
