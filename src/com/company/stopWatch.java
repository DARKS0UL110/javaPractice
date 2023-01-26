package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stopWatch implements ActionListener {
    JFrame frame;
    JButton startbtn;
    JButton resetbtn;
    JLabel timeLabel;
    int elapsedTime;
    int seconds;
    int minutes;
    int hours;
    boolean started = false;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
    String hours_string = String.format("%02d", hours);

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            elapsedTime = elapsedTime + 1000;
            hours = (elapsedTime/3600000);
            minutes = (elapsedTime/60000) % 60;
            seconds = (elapsedTime/1000) % 60;
            seconds_string = String.format("%02d",seconds);
            minutes_string = String.format("%02d",minutes);
            hours_string = String.format("%02d",hours);
            timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);

        }
    });

    stopWatch(){

        frame = new JFrame();
        frame.setTitle("StopWatch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);

        timeLabel = new JLabel();
        timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
        timeLabel.setBounds(100,100,200,100);
        timeLabel.setFont(new Font("Sans serif",Font.PLAIN,30));
        timeLabel.setOpaque(true);
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startbtn = new JButton();
        startbtn.setBounds(100,200,100,50);
        startbtn.setFont(new Font("Sans serif",Font.PLAIN,20));
        startbtn.setText("Start");
        startbtn.setBackground(Color.black);
        startbtn.setForeground(Color.white);
        startbtn.setFocusable(false);
        startbtn.addActionListener(this);

        resetbtn = new JButton();
        resetbtn.setBounds(200,200,100,50);
        resetbtn.setFont(new Font("Sans serif",Font.PLAIN,20));
        resetbtn.setText("Reset");
        resetbtn.setBackground(Color.black);
        resetbtn.setForeground(Color.white);
        resetbtn.setFocusable(false);
        resetbtn.addActionListener(this);

        frame.add(timeLabel);
        frame.add(startbtn);
        frame.add(resetbtn);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==startbtn){
            start();
            if (started==false){
                started =true;
                startbtn.setText("Stop");
                start();
            }else {
                started =false;
                startbtn.setText("Start");
                stop();
            }
        }
        if(e.getSource()==resetbtn){
            started=false;
            startbtn.setText("Start");
            reset();
        }

    }

    void start(){
        timer.start();
    }

    void stop(){
        timer.stop();
    }

    void reset(){
        timer.stop();
        elapsedTime = 0;
        seconds = 0;
        minutes= 0;
        hours= 0;
        seconds_string = String.format("%02d",seconds);
        minutes_string = String.format("%02d",minutes);
        hours_string = String.format("%02d",hours);
        timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
    }
}
