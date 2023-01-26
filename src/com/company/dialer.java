package com.company;
import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dialer implements ActionListener {

    JFrame dialer;
    JTextField input;
    JPanel container;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn10;
    JButton btn11;
    JButton btn12;


    dialer(){


        dialer.setTitle("dialer");
        dialer.setSize(500, 700);
        dialer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dialer.setLayout(null);
        dialer.setVisible(true);

        input = new JTextField();
        input.setBounds(50, 30, 380, 80);
        input.setBackground(Color.white);
        input.setFont(new Font("sans serif",Font.BOLD,30));

        container = new JPanel();
        container.setBounds(50, 130, 380, 500);
        container.setLayout(new GridLayout(4, 3, 20, 20));

        btn1 =new JButton();
        btn1.setText("1");
        btn1.setBackground(Color.WHITE);
        btn1.setFont(new Font("sans serif",Font.BOLD,30));
        btn1.setBackground(Color.darkGray);
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        btn1.setFocusable(false);

        btn2 = new JButton();
        btn2.setText("2");
        btn2.setBackground(Color.WHITE);
        btn2.setFont(new Font("sans serif",Font.BOLD,30));
        btn2.setBackground(Color.darkGray);
        btn2.setForeground(Color.white);
        btn2.addActionListener(this);
        btn2.setFocusable(false);


        btn3 = new JButton();
        btn3.setText("3");
        btn3.setBackground(Color.WHITE);
        btn3.setFont(new Font("sans serif",Font.BOLD,30));
        btn3.setBackground(Color.darkGray);
        btn3.setForeground(Color.white);
        btn3.addActionListener(this);
        btn3.setFocusable(false);

        btn4 = new JButton();
        btn4.setText("4");
        btn4.setBackground(Color.WHITE);
        btn4.setFont(new Font("sans serif",Font.BOLD,30));
        btn4.setBackground(Color.darkGray);
        btn4.setForeground(Color.white);
        btn4.addActionListener(this);
        btn4.setFocusable(false);

        btn5 = new JButton();
        btn5.setText("5");
        btn5.setBackground(Color.WHITE);
        btn5.setFont(new Font("sans serif",Font.BOLD,30));
        btn5.setBackground(Color.darkGray);
        btn5.setForeground(Color.white);
        btn5.addActionListener(this);
        btn5.setFocusable(false);

        btn6 = new JButton();
        btn6.setText("6");
        btn6.setBackground(Color.WHITE);
        btn6.setFont(new Font("sans serif",Font.BOLD,30));
        btn6.setBackground(Color.darkGray);
        btn6.setForeground(Color.white);
        btn6.addActionListener(this);
        btn6.setFocusable(false);

        btn7 = new JButton();
        btn7.setText("7");
        btn7.setBackground(Color.WHITE);
        btn7.setFont(new Font("sans serif",Font.BOLD,30));
        btn7.setBackground(Color.darkGray);
        btn7.setForeground(Color.white);
        btn7.addActionListener(this);
        btn7.setFocusable(false);

        btn8 = new JButton();
        btn8.setText("8");
        btn8.setBackground(Color.WHITE);
        btn8.setFont(new Font("sans serif",Font.BOLD,30));
        btn8.setBackground(Color.darkGray);
        btn8.setForeground(Color.white);
        btn8.addActionListener(this);
        btn8.setFocusable(false);

        btn9 = new JButton();
        btn9.setText("9");
        btn9.setBackground(Color.WHITE);
        btn9.setFont(new Font("sans serif",Font.BOLD,30));
        btn9.setBackground(Color.darkGray);
        btn9.setForeground(Color.white);
        btn9.addActionListener(this);
        btn9.setFocusable(false);

        btn10 = new JButton();
        btn10.setText("*");
        btn10.setBackground(Color.WHITE);
        btn10.setFont(new Font("sans serif",Font.BOLD,30));
        btn10.setBackground(Color.darkGray);
        btn10.setForeground(Color.white);
        btn10.addActionListener(this);
        btn10.setFocusable(false);

        btn11 = new JButton();
        btn11.setText("0");
        btn11.setBackground(Color.WHITE);
        btn11.setFont(new Font("sans serif",Font.BOLD,30));
        btn11.setBackground(Color.darkGray);
        btn11.setForeground(Color.white);
        btn11.addActionListener(this);
        btn11.setFocusable(false);

        btn12 = new JButton();
        btn12.setText("#");
        btn12.setBackground(Color.WHITE);
        btn12.setFont(new Font("sans serif",Font.BOLD,30));
        btn12.setBackground(Color.darkGray);
        btn12.setForeground(Color.white);
        btn12.addActionListener(this);
        btn12.setFocusable(false);


        dialer.add(input);
        dialer.add(container);
        container.add(btn1);
        container.add(btn2);
        container.add(btn3);
        container.add(btn4);
        container.add(btn5);
        container.add(btn6);
        container.add(btn7);
        container.add(btn8);
        container.add(btn9);
        container.add(btn10);
        container.add(btn11);
        container.add(btn12);



    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String a = input.getText();

        if(e.getSource()==btn1){
            input.setText(a+"1");

        }

        if(e.getSource()==btn2){
            input.setText(a+"2");

        }
        if(e.getSource()==btn3){
            input.setText(a+"3");

        }
        if(e.getSource()==btn4){
            input.setText(a+"4");

        }
        if(e.getSource()==btn5){
            input.setText(a+"5");

        }
        if(e.getSource()==btn6){
            input.setText(a+"6");

        }
        if(e.getSource()==btn7){
            input.setText(a+"7");

        }
        if(e.getSource()==btn8){
            input.setText(a+"8");

        }
        if(e.getSource()==btn9){
            input.setText(a+"9");

        }
        if(e.getSource()==btn10){
            input.setText(a+"*");

        }
        if(e.getSource()==btn11){
            input.setText(a+"0");

        }
        if(e.getSource()==btn12){
            input.setText(a+"#");

        }

    }
}
