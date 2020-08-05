package com.casino.games;
import javax.swing.*;

public class SlotImages extends JFrame {
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();

    public SlotImages() {
        setTitle("Cherry");
        setVisible(true);
        setSize(50, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl.setIcon(new ImageIcon("C:\\users\\Zack\\Desktop\\JavaProject\\slot-machine\\images\\Cherry.jpg"));
        jp.add(jl);

        add(jp);
    }

    public static void main(String[] args) {
        SlotImages tryMe = new SlotImages();
        tryMe.validate();
    }
}