package com.company;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;
import java.awt.*;
public class microDisplay implements ActionListener {

       JFrame frame;
       JPanel logo;
       JLabel timer;
       JButton start;
       JButton stop;
       JPanel grid;
       JButton btn1;
       JButton btn2;
       JButton btn3;
       JButton btn4;
       JButton btn5;
       JButton btn6;


    microDisplay(){

        frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(400,600);
        frame.setTitle("Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.red);
        frame.setVisible(true);

        logo = new JPanel();
        logo.setBackground(Color.black);
        logo.setBounds(30,0,323,90);
        logo.setLayout(null);

        timer = new JLabel();
        timer.setText("12:00");
        timer.setFont(new Font("Sans serif",Font.ITALIC,70));
        timer.setForeground(Color.white);
        timer.setBounds(63,10,200,70);


        start = new JButton();
        start.setText("Start");
        start.setFocusable(false);
        start.setForeground(Color.white);
        start.setBackground(Color.black);
        start.setFont(new Font("Sans serif",Font.BOLD,20));
        start.setBounds(30,170,100,60);


        stop = new JButton();
        stop.setText("Stop");
        stop.setFocusable(false);
        stop.setForeground(Color.white);
        stop.setBackground(Color.black);
        stop.setFont(new Font("Sans serif",Font.BOLD,20));
        stop.setBounds(253,170,100,60);

        grid = new JPanel();
        grid.setBounds(30,270,323,230);
        grid.setLayout(new GridLayout(2,2,30,30));

        btn1 = new JButton();
        btn1.setFont(new Font("Sans serif",Font.BOLD,20));
        btn1.setText("1");
        btn1.setForeground(Color.white);
        btn1.setBackground(Color.black);
        btn1.setFocusable(false);

        btn2 = new JButton();
        btn2.setFont(new Font("Sans serif",Font.BOLD,20));
        btn2.setForeground(Color.white);
        btn2.setText("2");
        btn2.setBackground(Color.black);
        btn2.setFocusable(false);

        btn3 = new JButton();
        btn3.setFont(new Font("Sans serif",Font.BOLD,20));
        btn3.setForeground(Color.white);
        btn3.setText("3");
        btn3.setBackground(Color.black);
        btn3.setFocusable(false);

        btn4 = new JButton();
        btn4.setFont(new Font("Sans serif",Font.BOLD,20));
        btn4.setForeground(Color.white);
        btn4.setText("4");
        btn4.setBackground(Color.black);
        btn4.setFocusable(false);

        btn5 = new JButton();
        btn5.setFont(new Font("Sans serif",Font.BOLD,20));
        btn5.setForeground(Color.white);
        btn5.setText("5");
        btn5.setBackground(Color.black);
        btn5.setFocusable(false);

        btn6 = new JButton();
        btn6.setFont(new Font("Sans serif",Font.BOLD,20));
        btn6.setForeground(Color.white);
        btn6.setText("6");
        btn6.setBackground(Color.black);
        btn6.setFocusable(false);


        frame.add(logo);
        logo.add(timer);
        frame.add(start);
        frame.add(stop);
        frame.add(grid);
        grid.add(btn1);
        grid.add(btn2);
        grid.add(btn3);
        grid.add(btn4);
        grid.add(btn5);
        grid.add(btn6);






    }






    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
