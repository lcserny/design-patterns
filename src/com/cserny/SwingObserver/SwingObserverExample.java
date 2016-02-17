package com.cserny.SwingObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by user on 16.02.2016.
 */
public class SwingObserverExample
{
    JFrame frame;

    public static void main(String[] args)
    {
        new SwingObserverExample().go();
    }

    public void go()
    {
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        frame = new JFrame();
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    class AngelListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Don't do it, you might regret it!");
        }
    }

    class DevilListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            System.out.println("Come on, do it!");
        }
    }
}
