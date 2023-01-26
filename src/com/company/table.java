package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class table implements ActionListener {




    table(){


        JFrame frame;
        JTable tbl;
//        JTextField username;
//        JPasswordField password;

//        JButton btn;
        String [][] data = {
                {" "," "}
        };

        String [] header = {"Username","Password", };




        frame = new JFrame();
        frame.setVisible(true);
//        frame.setLayout(null);
        frame.setSize(800,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        tbl = new JTable(data,header);



//        username = new JTextField();
//        username.setBounds(100,300,100,50);
//
//
//        password = new JPasswordField();
//        password.setBounds(100,400,100,50);
//
//
//        btn = new JButton();
//        btn.addActionListener(this);
//        btn.setText("submit");
//        btn.setBounds(100,500,100,50);


//        frame.add(username);
//        frame.add(password);
//        frame.add(btn);
        frame.add(new JScrollPane(tbl));


    }






    @Override
    public void actionPerformed(ActionEvent e) {



    }
}
