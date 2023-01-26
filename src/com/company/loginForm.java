package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginForm implements ActionListener {

    JFrame loginForm;
    JPanel header;
    JLabel login;
    JPanel container;
    JPanel body;
    JLabel user;
    JTextField userInput;
    JLabel pass;
    JPasswordField passInput;
    JButton btn;


    loginForm(){

     loginForm = new JFrame();
     loginForm.setSize(500,500);
     loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     loginForm.setTitle("Registration");
     loginForm.setBackground(Color.WHITE);
     loginForm.setLayout(null);
     loginForm.setVisible(true);

     header = new JPanel();
     header.setBackground(Color.black);
     header.setBounds(0, 0, 400, 50);

     login = new JLabel();
     login.setText("LOGIN");
     login.setHorizontalTextPosition(JLabel.CENTER);
     login.setVerticalTextPosition(JLabel.TOP);
     login.setForeground(new Color(255,255,255));
     login.setFont(new Font("Sans serif",Font.BOLD,25));

     container = new JPanel();
     container.setBackground(new Color(255,255,255));
     container.setBounds(40,30,400,400);
     container.setLayout(null);

     body = new JPanel();
     body.setBounds(0,0,400,400);
     body.setBackground(Color.white);
     body.setLayout(null);


     user = new JLabel();
     user.setText("Username");
     user.setForeground(Color.black);
     user.setHorizontalAlignment(JLabel.LEFT);
     user.setFont(new Font("Sans serif",Font.BOLD,15));
     user.setBounds(50,120,90,30);

     userInput = new JTextField();
     userInput.setBounds(200,120,140,25);
     userInput.setHorizontalAlignment(JTextField.LEFT);

     pass = new JLabel();
     pass.setText("Password");
     pass.setForeground(Color.black);
     pass.setHorizontalAlignment(JLabel.LEFT);
     pass.setFont(new Font("Sans serif",Font.BOLD,15));
     pass.setBounds(50,200,90,30);


     passInput = new JPasswordField();
     passInput.setBounds(200,200,140,25);
     passInput.setHorizontalAlignment(JTextField.LEFT);


     btn = new JButton();
     btn.setBounds(220,300,100,30);
     btn.setText("SUBMIT");
     btn.setFocusable(false);
     btn.setFont(new Font("Sans serif",Font.BOLD,12));
     btn.setForeground(Color.white);
     btn.setBackground(Color.black);
     btn.setBorder(BorderFactory.createEtchedBorder());
     btn.addActionListener(this);



        loginForm.add(container);
        container.add(header);
        header.add(login);
        container.add(body);
        body.add(user);
        body.add(userInput);
        body.add(pass);
        body.add(passInput);
        body.add(btn);


     }




    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource()==btn) {
            String name = userInput.getText();
            String pass = passInput.getText();
            if (name.equals("faizan") && pass.equals("123")) {
                JOptionPane.showMessageDialog(null,"Successfully Logged in","Done",JOptionPane.INFORMATION_MESSAGE);

            }else {

                JOptionPane.showMessageDialog(null,"Login Failed","Error",JOptionPane.WARNING_MESSAGE);


            }

        }
    }


}

