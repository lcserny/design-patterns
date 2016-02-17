package com.cserny.performance;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestGUI extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 1L;

    public TestGUI()
    {
        initGUI();
    }

    private void initGUI()
    {
        long m = System.currentTimeMillis();
        System.out.println("Initializing GUI");
        setTitle(System.getProperty("java.vendor") + " " + System.getProperty("java.version"));
        setLayout(new FlowLayout());

        JButton b = new JButton("Disable-ALL ");
        b.addActionListener(this);
        add(b);

        for (int i = 1; i < 10001; i++) {
            b = new JButton("Button " + i);
            add(b);
        }

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        m = System.currentTimeMillis() - m;
        System.out.println("GUI initialized in " + m + " ms");
    }

    public void actionPerformed(ActionEvent e)
    {
        String text;

        if (e.getActionCommand().equals("Enable-ALL")) {
            enableAll();
            text= "Disable-ALL";
        } else {
            disableAll();
            text= "Enable-ALL";
        }

        ((JButton)e.getSource()).setText(text);
        ((JButton)e.getSource()).setEnabled(true);
    }

    private void disableAll()
    {
        getContentPane().setVisible(false); // improves performance
        long m = System.currentTimeMillis();
        System.out.println("Disabling");

        for (Component c : getContentPane().getComponents()) {
            c.setEnabled(false);
        }

        m = System.currentTimeMillis() - m;
        System.out.println("Disabled in " + m + " ms");
        getContentPane().setVisible(true); // improves performance
    }

    private void enableAll()
    {
        getContentPane().setVisible(false); // improves performance
        long m = System.currentTimeMillis();
        System.out.println("Enabling");

        for (Component c : getContentPane().getComponents()) {
            c.setEnabled(true);
            invalidate();
        }

        m = System.currentTimeMillis() - m;
        System.out.println("Enabled in " + m + " ms");
        getContentPane().setVisible(true); // improves performance
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                System.out.println(System.getProperty("java.vendor") + " " + System.getProperty("java.version"));
                new TestGUI();
            }
        });
    }
}