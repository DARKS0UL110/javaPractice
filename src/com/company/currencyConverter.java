package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class currencyConverter implements ActionListener {

    JFrame frame;
    JPanel header;
    JLabel heading;
    JLabel entry;
    JTextField input_1;
    JRadioButton btn1;
    JRadioButton btn2;
    JRadioButton btn3;
    ButtonGroup group;
    JLabel ans;


    currencyConverter(){
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Converter");
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);
        frame.setVisible(true);

        header = new JPanel();
        header.setBounds(0,0,500,60);
        header.setLayout(null);
        header.setBackground(Color.black);

        heading = new JLabel();
        heading.setText("Currency Converter");
        heading.setFont(new Font("Sans serif",Font.BOLD,20));
        heading.setBounds(140,0,250,60);
        heading.setForeground(Color.white);


        entry = new JLabel();
        entry.setText("Enter rupees");
        entry.setForeground(Color.black);
        entry.setFont(new Font("Sans serif",Font.BOLD,15));
        entry.setBounds(30,100,190,120);


        input_1 = new JTextField();
        input_1.setBounds(150,145,230,30);


        group = new ButtonGroup();

        btn1 = new JRadioButton();
        btn1.setFont(new Font("Sans serif",Font.BOLD,12));
        btn1.setText("Dollar");
        btn1.setBounds(30,240,100,50);
        btn1.setFocusable(false);
        btn1.addActionListener(this);


        btn2 = new JRadioButton();
        btn2.setFont(new Font("Sans serif",Font.BOLD,12));
        btn2.setText("Euro");
        btn2.setBounds(150,240,100,50);
        btn2.setFocusable(false);
        btn2.addActionListener(this);


        btn3 = new JRadioButton();
        btn3.setFont(new Font("Sans serif",Font.BOLD,12));
        btn3.setText("Pound");
        btn3.setBounds(250,240,100,50);
        btn3.setFocusable(false);
        btn3.addActionListener(this);


        ans = new JLabel();
        ans.setForeground(Color.black);
        ans.setFont(new Font("Sans serif",Font.BOLD,15));
        ans.setBounds(200,300,190,120);


        frame.add(header);
        header.add(heading);
        frame.add(entry);
        frame.add(input_1);
        group.add(btn1);
        group.add(btn2);
        group.add(btn3);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(ans);

    }






    @Override
    public void actionPerformed(ActionEvent e) {
        double num;
        double dollar = 0.0050;
        double euro = 0.0047;
        double pound = 0.0040;
        double result;
        if (e.getSource()==btn1){

            num = Float.parseFloat(input_1.getText());
            result  = num*dollar;
            ans.setText(String.valueOf(result));
        }

        if (e.getSource()==btn2){

            num = Float.parseFloat(input_1.getText());
            result  = num*euro;
            ans.setText(String.valueOf(+result));
        }

        if (e.getSource()==btn3){

            num = Float.parseFloat(input_1.getText());
            result  = num*pound;
            ans.setText(String.valueOf(+result));
        }

    }
}
