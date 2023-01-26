package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class count implements ActionListener {

    int a = 0;
    JFrame count;
    JLabel counter;
    JButton countbtn;
    JTextField input;



    count(){

        count = new JFrame();
        count.setLayout(null);
        count.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        count.setTitle("Counter");
        count.setSize(300, 250);
        count.setVisible(true);


        counter = new JLabel();
        counter.setBounds(15, 50, 100, 50);
        counter.setText("Counter");
        counter.setFont(new Font("Sans serif", Font.BOLD, 20));
        counter.setForeground(Color.black);


        input = new JTextField();
        input.setBounds(125, 63, 130, 30);


        countbtn = new JButton();
        countbtn.setFocusable(false);
        countbtn.setText("Count");
        countbtn.setForeground(Color.white);
        countbtn.setBackground(Color.darkGray);
        countbtn.setBounds(145, 120, 90, 30);
        countbtn.addActionListener(this);


        count.add(counter);
        count.add(input);
        count.add(countbtn);



    }
    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==countbtn){
            a++;
            String b = String.valueOf(a);
            input.setText(b);
        }


    }
}
