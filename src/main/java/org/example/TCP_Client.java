package org.example;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCP_Client {
    public static void main(String[] args) {
        //String hostName = "127.0.0.1";
        //int portNumber = 1234;
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CustomFrame();
            }
        });
    }
        /*
        Socket echoSocket = null;
        try {
            echoSocket = new Socket(hostName, portNumber);
        } catch (IOException e) {
            System.out.println("cannot reach server "+e);
        }
        PrintWriter out = null;
        try {
            out = new PrintWriter(echoSocket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        } catch (IOException e) {
            System.out.println("cannot allocate bufferedreader");
        }
        BufferedReader stdIn = new BufferedReader( new InputStreamReader(System.in));
        String userInput = "";
        while (true) {
            try {
                if (!((userInput = stdIn.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.println(userInput);
            out.flush();
            try {
                System.out.println("Risposta server: " + in.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
/*
        private static void createAndShowGUI() {
            CustomFrame f = new CustomFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(750,750);
            f.setVisible(true);

            MyThread th = new MyThread(f);
            th.start();
        }

        public static class MyThread extends Thread {
            private int count = 0;
            CustomFrame f;

            public MyThread(CustomFrame f) {
                this.f = f;
            }

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
*/
}
