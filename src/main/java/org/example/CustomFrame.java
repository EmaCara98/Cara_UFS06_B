package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.net.Socket;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class CustomFrame extends JFrame implements ActionListener {
    private JPanel p;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JLabel label;
    private JTextField txt;
    private JButton btn;
    private JTextArea result;
    private Socket echoSocket;
    private PrintWriter out;
    private BufferedReader in;

    public CustomFrame() {
        this.p = new JPanel();
        setTitle("Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        this.label = new JLabel("Inserire il comando: ");
        this.txt = new JTextField(20);
        this.btn = new JButton("Invio");
        this.result = new JTextArea("");
        this.result.setEditable(false);
        this.btn.addActionListener(this);
        this.result.setRows(10);
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();

        p1.add(label);
        p1.add(txt);
        p2.add(btn);
        p3.add(result);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        add(p);

        add(this.txt, BorderLayout.NORTH);
        add(this.btn, BorderLayout.CENTER);
        add(this.result, BorderLayout.SOUTH);
        add(new JScrollPane(this.result), BorderLayout.SOUTH);

        setVisible(true);

        String hostName = "127.0.0.1";
        int portNumber = 1234;
        try {
            echoSocket = new Socket(hostName, portNumber);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        } catch (IOException e) {
            System.out.println("Cannot connect to the server: " + e);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            result.setText("");
            String userInput = txt.getText();
            out.println(userInput);
            out.flush();
            try {
                String response = in.readLine();
                result.append(response + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            txt.setText("");
        }
    }

}









