package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.InterruptedByTimeoutException;

public class GameFrame extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menu;
    private JMenuItem quit, pause, scores;

    public GameFrame() throws HeadlessException {
        this.setTitle("Snake");
        menuBar();

        this.add(new GamePanel());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);



    }

    private void menuBar() {
        mb = new JMenuBar();//menu Bar
        menu = new JMenu("menu");//create a menu
        quit = new JMenuItem("Quit");
        pause = new JMenuItem("Pause");
        scores = new JMenuItem("Scores");
        menu.add(quit);
        menu.add(pause);
        menu.add(scores);
        mb.add(menu);
        this.setJMenuBar(mb);
        setAction();


    }

    private void setAction() {
        scores.addActionListener(this);
        pause.addActionListener(this);
        quit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == scores) {
            //todo link up score sheet display when this menu tab is pressed to display all time scores

        } else if (e.getSource() == pause) {
            pause.setText("Play");

            try {
                Thread.sleep(1000);
                //todo sort out sleep time


            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong",
                        "Error! ", JOptionPane.ERROR_MESSAGE

                );
                System.out.println(ex.getMessage());
            }

        } else if (e.getSource() == quit) {
            System.exit(0);
        }

    }
}
