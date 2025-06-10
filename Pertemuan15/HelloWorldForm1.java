package Pertemuan15;

import javax.swing.*;

public class HelloWorldForm1 extends JFrame { //1
    private JLabel label; //2

    //3
    public HelloWorldForm1() {
        label = new JLabel();
        label.setText("Helloworld!");

        add(label);
        setTitle("My First Program");

        setVisible(true);
        setSize(300, 200);
    }
}
