package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {

    JFrame calculator;
    JPanel header;
    JLabel cal;
    JLabel num_1;
    JLabel num_2;
    JTextField input_1;
    JTextField input_2;
    JTextField input_3;
    JPanel grid;
    JButton add;
    JButton sub;
    JButton mul;
    JButton div;




    calculator(){


        calculator = new JFrame();
        calculator.setSize(500,500);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setTitle("Calculator");
        calculator.setBackground(Color.WHITE);
        calculator.setLayout(null);
        calculator.setVisible(true);

        header = new JPanel();
        header.setBounds(0,0,500,60);
        header.setLayout(null);
        header.setBackground(Color.black);

        cal = new JLabel();
        cal.setText("Calculator");
        cal.setFont(new Font("Sans serif",Font.BOLD,25));
        cal.setBounds(175,0,170,60);
        cal.setForeground(Color.white);



        num_1 = new JLabel();
        num_1.setText("Enter 1st Number ");
        num_1.setForeground(Color.black);
        num_1.setFont(new Font("Sans serif",Font.BOLD,15));
        num_1.setBounds(30,80,190,80);


        num_2 = new JLabel();
        num_2.setText("Enter 2nd Number ");
        num_2.setForeground(Color.black);
        num_2.setFont(new Font("Sans serif",Font.BOLD,15));
        num_2.setBounds(30,120,190,120);


        input_1 = new JTextField();
        input_1.setBounds(250,105,170,30);

        input_2 = new JTextField();
        input_2.setBounds(250,165,170,30);

        input_3 = new JTextField();
        input_3.setBounds(250,250,170,130);
        input_3.setBackground(Color.white);
        input_3.setFont(new Font("Sans serif",Font.PLAIN,30));
        input_3.setHorizontalAlignment(JTextField.CENTER);



        grid = new JPanel();
        grid.setLayout(new GridLayout(2,2,4,4));
        grid.setBackground(Color.white);
        grid.setBounds(30,250,130,130);


        add = new JButton();
        add.setText("+");
        add.setBounds(30,250,100,30);
        add.setFont(new Font("Sans serif",Font.BOLD,20));
        add.setFocusable(false);
        add.setForeground(Color.white);
        add.setBackground(Color.darkGray);
        add.setBorder(BorderFactory.createEtchedBorder());
        add.addActionListener(this);



        sub = new JButton();
        sub.setText("-");
        sub.setBounds(130,250,100,30);
        sub.setFont(new Font("Sans serif",Font.BOLD,20));
        sub.setFocusable(false);
        sub.setForeground(Color.white);
        sub.setBackground(Color.darkGray);
        sub.setBorder(BorderFactory.createEtchedBorder());
        sub.addActionListener(this) ;



        mul = new JButton();
        mul.setText("x");
        mul.setBounds(230,250,100,30);
        mul.setFont(new Font("Sans serif",Font.BOLD,20));
        mul.setFocusable(false);
        mul.setForeground(Color.white);
        mul.setBackground(Color.darkGray);
        mul.setBorder(BorderFactory.createEtchedBorder());
        mul.addActionListener(this);



        div = new JButton();
        div.setText("/");
        div.setBounds(330,250,100,30);
        div.setFont(new Font("Sans serif",Font.BOLD,20));
        div.setFocusable(false);
        div.setForeground(Color.white);
        div.setBackground(Color.darkGray);
        div.setBorder(BorderFactory.createEtchedBorder());
        div.addActionListener(this);


        calculator.add(grid);
        calculator.add(header);
        calculator.add(num_1);
        calculator.add(num_2);
        calculator.add(input_1);
        calculator.add(input_2);
        calculator.add(input_3);
        grid.add(add);
        grid.add(sub);
        grid.add(mul);
        grid.add(div);
        header.add(cal);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==add) {
            float a = Float.parseFloat(input_1.getText());
            float b = Float.parseFloat(input_2.getText());
            float sum = a+b;
            input_3.setText(input_3.getText().concat(String.valueOf(sum)));
        }



        if(e.getSource()==sub) {
            float a = Float.parseFloat(input_1.getText());
            float b = Float.parseFloat(input_2.getText());
            float sub = a-b;
            input_3.setText(input_3.getText().concat(String.valueOf(sub)));
        }



        if(e.getSource()==mul) {
            float a = Float.parseFloat(input_1.getText());
            float b = Float.parseFloat(input_2.getText());
            float mul = a*b;
            input_3.setText(input_3.getText().concat(String.valueOf(mul)));
        }


        if(e.getSource()==div) {
            float a = Float.parseFloat(input_1.getText());
            float b = Float.parseFloat(input_2.getText());
            float div = a/b;
            input_3.setText(input_3.getText().concat(String.valueOf(div)));
        }

    }
}
