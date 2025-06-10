package Pertemuan15;

import javax.swing.*;

public class HelloWorldForm2 extends JFrame { //1
    private JLabel label; //2

    //3
    public HelloWorldForm2() {
        label = new JLabel();
        label.setText("Hallo Dunia!");

        add(label);
        setTitle("Program pertama");

        setSize(600, 300);
    }
}
