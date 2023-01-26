package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class fileSaving implements ActionListener {

    File file;
    JFrame frame;
    JButton btn;
    JLabel l1, l3, l4;
    JTextField input_1;
    String name;

    fileSaving() throws IOException {
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        btn = new JButton();
        btn.setText("LOgin");
        btn.setBounds(100,100,100,100);
        btn.addActionListener(this);

        input_1 = new JTextField();
        input_1.setBounds(50,100,150,60);


        file = new File("database.txt");
        file.createNewFile();



      frame.add(btn);
      frame.add(input_1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==btn){
            name=input_1.getText();
            System.out.println(name);



    }
}}








