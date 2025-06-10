package Pertemuan15;

import javax.swing.*;
import java.awt.event.*;

public class PenjumlahanForm extends JFrame implements ActionListener {
    // Komponen
    private JTextField textField1, textField2;
    private JButton tombolJumlah;

    // Konstruktor
    public PenjumlahanForm() {
        setTitle("Form Penjumlahan");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Angka 1:");
        label1.setBounds(30, 20, 100, 25);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(100, 20, 150, 25);
        add(textField1);

        JLabel label2 = new JLabel("Angka 2:");
        label2.setBounds(30, 60, 100, 25);
        add(label2);

        textField2 = new JTextField();
        textField2.setBounds(100, 60, 150, 25);
        add(textField2);

        tombolJumlah = new JButton("Jumlah");
        tombolJumlah.setBounds(100, 100, 150, 30);
        tombolJumlah.addActionListener(this);
        add(tombolJumlah);

        setVisible(true);
    }

    // Aksi tombol
    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(textField1.getText());
            int angka2 = Integer.parseInt(textField2.getText());
            int hasil = angka1 + angka2;

            JOptionPane.showMessageDialog(this, "Hasil Penjumlahan: " + hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Main method
    public static void main(String[] args) {
        new PenjumlahanForm();
    }
}
