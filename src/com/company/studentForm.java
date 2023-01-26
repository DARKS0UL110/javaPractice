package com.company;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;
import java.awt.*;
public class studentForm implements ActionListener {

        JFrame frame;
        JPanel header;
        JLabel heading;
        JLabel stu_roll;
        JLabel stu_name;
        JLabel stu_class;
        JLabel subject;
        JPanel grid;
        JPanel grid1;
        JTextField input_1;
        JTextField input_2;
        JTextField input_3;
        JCheckBox box_1;
        JCheckBox box_2;
        JCheckBox box_3;
        JLabel category;
        ButtonGroup group;
        JRadioButton btn1;
        JRadioButton btn2;
        JButton submit;



    studentForm(){
            frame = new JFrame();
            frame.setSize(500,600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Student-Form");
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


            stu_roll = new JLabel();
            stu_roll.setText("Roll no");
            stu_roll.setForeground(Color.black);
            stu_roll.setFont(new Font("Sans serif",Font.BOLD,15));
            stu_roll.setBounds(30,60,190,80);


            stu_name = new JLabel();
            stu_name.setText("Name");
            stu_name.setForeground(Color.black);
            stu_name.setFont(new Font("Sans serif",Font.BOLD,15));
            stu_name.setBounds(30,100,190,120);


            stu_class = new JLabel();
            stu_class.setText("Class");
            stu_class.setForeground(Color.black);
            stu_class.setFont(new Font("Sans serif",Font.BOLD,15));
            stu_class.setBounds(30,135,190,160);


            input_1 = new JTextField();
            input_1.setBounds(150,85,230,30);


            input_2 = new JTextField();
            input_2.setBounds(150,143,230,30);


            input_3 = new JTextField();
            input_3.setBounds(150,200,230,30);

            subject = new JLabel();
            subject.setText("Subjects");
            subject.setForeground(Color.black);
            subject.setFont(new Font("Sans serif",Font.BOLD,15));
            subject.setBounds(30,170,190,220);


            grid = new JPanel();
            grid.setLayout(new GridLayout(3,1));
            grid.setBounds(30,300,150,150);

            box_1 = new JCheckBox();
            box_1.setText("English");
            box_1.setFocusable(false);
            box_1.setFont(new Font("Sans serif",Font.BOLD,12));
            box_1.setBounds(30,220,200,200);


            box_2 = new JCheckBox();
            box_2.setText("Chemistry");
            box_2.setFocusable(false);
            box_2.setFont(new Font("Sans serif",Font.BOLD,12));
            box_2.setBounds(30,230,200,200);


            box_3 = new JCheckBox();
            box_3.setText("Mathematics");
            box_3.setFocusable(false);
            box_3.setFont(new Font("Sans serif",Font.BOLD,12));
            box_3.setBounds(30,240,200,200);


            category = new JLabel();
            category.setForeground(Color.black);
            category.setFont(new Font("Sans serif",Font.BOLD,15));
            category.setText("Category");
            category.setBounds(200,166,190,220);

            grid1 = new JPanel();
            grid1.setLayout(new GridLayout(3,1));
            grid1.setBounds(200,300,150,100);

            group = new ButtonGroup();


            btn1 = new JRadioButton();
            btn1.setFont(new Font("Sans serif",Font.BOLD,12));
            btn1.setText("Pre-Medical");
            btn1.setFocusable(false);


            btn2 = new JRadioButton();
            btn2.setFont(new Font("Sans serif",Font.BOLD,12));
            btn2.setText("Pre-Engeneering");
            btn2.setFocusable(false);

            submit = new JButton();
            submit.setText("Register");
            submit.setFocusable(false);
            submit.setBackground(Color.black);
            submit.setFont(new Font("Sans serif",Font.BOLD,17));
            submit.setForeground(Color.white);
            submit.setBounds(130,480,200,50);

            frame.add(header);
            header.add(heading);
            frame.add(stu_roll);
            frame.add(stu_name);
            frame.add(stu_class);
            frame.add(input_1);
            frame.add(input_2);
            frame.add(input_3);
            frame.add(subject);
            frame.add(grid);
            grid.add(box_1);
            grid.add(box_2);
            grid.add(box_3);
            frame.add(category);
            frame.add(grid1);
            group.add(btn1);
            group.add(btn2);
            grid1.add(btn1);
            grid1.add(btn2);
            frame.add(submit);





        }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
