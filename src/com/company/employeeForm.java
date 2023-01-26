package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;
import java.awt.*;
public class employeeForm implements ActionListener{

    JFrame frame;
    JPanel header;
    JLabel heading;
    JLabel emp_name;
    JLabel emp_fath;
    JLabel emp_age;
    JLabel emp_add;
    JTextField input_1;
    JTextField input_2;
    JTextField input_3;
    JTextField input_4;
    JLabel gender;
    JPanel grid1;
    ButtonGroup group;
    JRadioButton btn1;
    JRadioButton btn2;
    JButton submit;


    employeeForm(){

        frame = new JFrame();
        frame.setSize(500,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Employee-Sheet");
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);
        frame.setVisible(true);


        header = new JPanel();
        header.setBounds(0,0,500,60);
        header.setLayout(null);
        header.setBackground(Color.black);

        heading = new JLabel();
        heading.setText("Registration");
        heading.setFont(new Font("Sans serif",Font.BOLD,30));
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

        input_1 = new JTextField();
        input_1.setBounds(150,85,230,30);

        input_2 = new JTextField();
        input_2.setBounds(150,143,230,30);

        input_3 = new JTextField();
        input_3.setBounds(150,200,230,30);

        input_4 = new JTextField();
        input_4.setBounds(150,260,230,30);




        gender = new JLabel();
        gender.setForeground(Color.black);
        gender.setFont(new Font("Sans serif",Font.BOLD,15));
        gender.setText("Gender");
        gender.setBounds(30,260,190,200);

        grid1 = new JPanel();
        grid1.setLayout(new GridLayout(3,1));
        grid1.setBounds(30,380,150,100);


        group = new ButtonGroup();

        btn1 = new JRadioButton();
        btn1.setFont(new Font("Sans serif",Font.BOLD,12));
        btn1.setText("Male");
        btn1.setFocusable(false);
        btn1.addActionListener(this);

        btn2 = new JRadioButton();
        btn2.setFont(new Font("Sans serif",Font.BOLD,12));
        btn2.setText("Female");
        btn2.setFocusable(false);
        btn2.addActionListener(this);


        submit = new JButton();
        submit.setText("Register");
        submit.setFocusable(false);
        submit.setBackground(Color.black);
        submit.setFont(new Font("Sans serif",Font.BOLD,17));
        submit.setForeground(Color.white);
        submit.setBounds(130,590,200,50);
        submit.addActionListener(this);


        frame.add(header);
        header.add(heading);
        frame.add(emp_name);
        frame.add(emp_fath);
        frame.add(emp_age);
        frame.add(emp_add);
        frame.add(input_1);
        frame.add(input_2);
        frame.add(input_3);
        frame.add(input_4);
        frame.add(gender);
        frame.add(grid1);
        group.add(btn1);
        group.add(btn2);
        grid1.add(btn1);
        grid1.add(btn2);
        frame.add(submit);




    }



    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==submit){
            printEmployeeForm obj = new printEmployeeForm();

            String name;
            String fname;
            String age;
            String add;

            name = input_1.getText();
            obj.p_name.setText(name);

            fname = input_2.getText();
            obj.p_fath.setText(fname);

            age = input_3.getText();
            obj.p_age.setText(age);

            add = input_4.getText();
            obj.p_add.setText(add);

            if(btn1.isSelected()){
                obj.gender1.setText("Male");
            } else if (btn2.isSelected()) {
                obj.gender2.setText("Female");
            }



        }




    }

}

