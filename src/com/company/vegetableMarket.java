package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class vegetableMarket  implements ActionListener {


    JFrame frame;
    JPanel header;
    JLabel heading;
    JLabel vege;
    JComboBox items;
    String [] vegetables = {"Potato","Tomato","Onion","Pease"};
    JLabel price;
    JLabel vege1;
    JLabel vege2;
    JLabel vege3;
    JLabel vege4;
    JLabel total;
    JTextField show;
    int sum = 0;



    vegetableMarket(){
        frame = new JFrame();
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Menu");
        frame.setBackground(Color.WHITE);
        frame.setLayout(null);
        frame.setVisible(true);


        header = new JPanel();
        header.setBounds(0,0,500,60);
        header.setLayout(null);
        header.setBackground(Color.black);

        heading = new JLabel();
        heading.setText("Vegetables Menu");
        heading.setFont(new Font("Sans serif",Font.BOLD,20));
        heading.setBounds(140,0,180,60);
        heading.setForeground(Color.white);


        vege = new JLabel();
        vege.setText("Available Vegetables");
        vege.setForeground(Color.black);
        vege.setFont(new Font("Sans serif",Font.BOLD,15));
        vege.setBounds(30,100,190,80);

        items  = new JComboBox(vegetables);
        items.setBounds(250,125,150,30);
        items.setForeground(Color.black);
        items.setFont(new Font("Sans serif",Font.BOLD,12));
        items.setFocusable(false);
        items.addActionListener(this);

        price = new JLabel();
        price.setText("Price");
        price.setFont(new Font("Sans serif",Font.BOLD,17));
        price.setBounds(30,200,180,60);
        price.setForeground(Color.BLACK);


        total = new JLabel();
        total.setText("Total price");
        total.setFont(new Font("Sans serif",Font.BOLD,17));
        total.setBounds(250,200,180,60);
        total.setForeground(Color.BLACK);

        show = new JTextField();
        show.setFont(new Font("Sans serif",Font.BOLD,15));
        show.setBounds(250,250,180,60);
        show.setForeground(Color.BLACK);

        vege1 = new JLabel();
        vege1.setFont(new Font("Sans serif",Font.BOLD,15));
        vege1.setBounds(30,250,180,60);
        vege1.setForeground(Color.BLACK);

        vege2 = new JLabel();
        vege2.setFont(new Font("Sans serif",Font.BOLD,15));
        vege2.setBounds(30,280,180,60);
        vege2.setForeground(Color.BLACK);

        vege3 = new JLabel();
        vege3.setFont(new Font("Sans serif",Font.BOLD,15));
        vege3.setBounds(30,310,180,60);
        vege3.setForeground(Color.BLACK);

        vege4 = new JLabel();
        vege4.setFont(new Font("Sans serif",Font.BOLD,15));
        vege4.setBounds(30,340,180,60);
        vege4.setForeground(Color.BLACK);





        frame.add(header);
        header.add(heading);
        frame.add(vege);
        frame.add(items);
        frame.add(price);
        frame.add(total);
        frame.add(show);
        frame.add(vege1);
        frame.add(vege2);
        frame.add(vege3);
        frame.add(vege4);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

            int vege = items.getSelectedIndex();

            if(vege==0 ){
                sum+=150;
                vege1.setText("150");
            }

            if(vege==1 ){
                sum+=200;
                vege2.setText("200");
            }

            if(vege==2 ){
                sum+=90;
                vege3.setText("90");
            }

            if(vege==3 ){
                sum+=100;
                vege4.setText("100");
            }


      show.setText(String.valueOf(sum));
















    }
}
