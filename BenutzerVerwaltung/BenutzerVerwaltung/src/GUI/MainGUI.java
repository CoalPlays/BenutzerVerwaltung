package GUI;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {

    private Controller controller;

    private JFrame frame = new JFrame();
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JScrollPane scroll = new JScrollPane();
    private JPanel panel3 = new JPanel();
    private JButton addBtn = new JButton("+");
    private JButton detailBtn = new JButton("Details");
    private JButton deleteBtn = new JButton("Delete");
    private JLabel title = new JLabel("Benutzer");
    private JLabel idname = new JLabel("ID       Name");
    JList list = new JList();



    public MainGUI(Controller controller) {
        this.controller = controller;
        frame.setLayout(new BorderLayout());
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());
        panel3.setLayout(new GridLayout(1,2));
        scroll.setViewportView(list);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);

        panel1.add(title, BorderLayout.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 40));
        title.setBorder(BorderFactory.createEmptyBorder(0,80,0,0));


        panel1.add(addBtn, BorderLayout.EAST);
        addBtn.setPreferredSize(new Dimension(100,100));
        addBtn.setFont(new Font("Arial", Font.PLAIN, 60));
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.setCreateVis();
            }
        });
        addBtn.setOpaque(false);
        addBtn.setContentAreaFilled(false);
        addBtn.setBorderPainted(false);

        panel2.add(idname, BorderLayout.NORTH);
        idname.setFont(new Font("Arial", Font.PLAIN, 24));
        idname.setBorder(BorderFactory.createEmptyBorder(20,80,0,0));


        list.setModel(controller.transferList());
        list.setFont(new Font("Arial", Font.PLAIN, 24));
        panel2.add(scroll, BorderLayout.CENTER);
        list.setBorder(BorderFactory.createEmptyBorder(0,80,0,80));



        panel3.add(detailBtn);
        detailBtn.setPreferredSize(new Dimension(700,50));
        detailBtn.setFont(new Font("Arial", Font.PLAIN, 24));
        detailBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list.getSelectedIndex() > -1){
                    controller.setDetailVis(list.getSelectedIndex());
                }
            }
        });
        panel3.add(deleteBtn);
        deleteBtn.setPreferredSize(new Dimension(700,50));
        deleteBtn.setFont(new Font("Arial", Font.PLAIN, 24));
        deleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list.getSelectedIndex() > -1){
                    controller.deleteUser(list.getSelectedIndex());
                }
            }
        });

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Benutzer-Verwaltung");
        frame.setSize(700, 1000);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }
}
