package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class printEmployeeForm implements ActionListener {
    JFrame frame;
    JPanel header;
    JLabel heading;
    JLabel emp_name;
    JLabel emp_fath;
    JLabel emp_age;
    JLabel emp_add;
    JLabel p_name;
    JLabel p_fath;
    JLabel p_age;
    JLabel p_add;
    JLabel gender;
    JLabel gender1;
    JLabel gender2;



    printEmployeeForm(){

        frame = new JFrame();
        frame.setSize(500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Employee-Sheet");
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);
        frame.setVisible(true);

//        employeeForm obj = new employeeForm();
//        name = obj.input_1.getText();
//        fname= obj.input_2.getText();
//        age = obj.input_3.getText();
//        add = obj.input_4.getText();

        header = new JPanel();
        header.setBounds(0,0,500,60);
        header.setLayout(null);
        header.setBackground(Color.black);

        heading = new JLabel();
        heading.setText("Employee Sheet");
        heading.setFont(new Font("Sans serif",Font.BOLD,20));
        heading.setBounds(140,0,180,60);
        heading.setForeground(Color.white);

        emp_name = new JLabel();
        emp_name.setText("Name");
        emp_name.setForeground(Color.black);
        emp_name.setFont(new Font("Sans serif",Font.BOLD,15));
        emp_name.setBounds(30,60,190,80);

        emp_fath = new JLabel();
        emp_fath.setText("Father Name");
        emp_fath.setForeground(Color.black);
        emp_fath.setFont(new Font("Sans serif",Font.BOLD,15));
        emp_fath.setBounds(30,100,190,120);

        emp_age = new JLabel();
        emp_age.setText("Age");
        emp_age.setForeground(Color.black);
        emp_age.setFont(new Font("Sans serif",Font.BOLD,15));
        emp_age.setBounds(30,135,190,160);

        emp_add = new JLabel();
        emp_add.setText("Address");
        emp_add.setForeground(Color.black);
        emp_add.setFont(new Font("Sans serif",Font.BOLD,15));
        emp_add.setBounds(30,175,190,200);


        p_name = new JLabel();
        p_name.setForeground(Color.black);
        p_name.setFont(new Font("Sans serif",Font.PLAIN,15));
        p_name.setBounds(250,85,230,30);

        p_fath = new JLabel();
        p_fath.setForeground(Color.black);
        p_fath.setFont(new Font("Sans serif",Font.PLAIN,15));
        p_fath.setBounds(250,143,230,30);

        p_age = new JLabel();
        p_age.setForeground(Color.black);
        p_age.setFont(new Font("Sans serif",Font.PLAIN,15));
        p_age.setBounds(250,200,230,30);

        p_add = new JLabel();
        p_add.setForeground(Color.black);
        p_add.setFont(new Font("Sans serif",Font.PLAIN,15));
        p_add.setBounds(250,260,230,30);


        gender = new JLabel();
        gender.setText("Gender");
        gender.setForeground(Color.black);
        gender.setFont(new Font("Sans serif",Font.BOLD,15));
        gender.setBounds(30,220,190,200);

        gender1 = new JLabel();
        gender1.setForeground(Color.black);
        gender1.setFont(new Font("Sans serif",Font.PLAIN,15));
        gender1.setBounds(30,250,190,200);

        gender2 = new JLabel();
        gender2.setForeground(Color.black);
        gender2.setFont(new Font("Sans serif",Font.PLAIN,15));
        gender2.setBounds(30,250,190,200);



        frame.add(header);
        header.add(heading);
        frame.add(emp_name);
        frame.add(emp_fath);
        frame.add(emp_age);
        frame.add(emp_add);
        frame.add(p_name);
        frame.add(p_fath);
        frame.add(p_age);
        frame.add(p_add);
        frame.add(gender);
        frame.add(gender1);
        frame.add(gender2);



    }


    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
