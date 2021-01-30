package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener  {
    private JMenuBar mb;
    private JMenu menu;
    private JMenuItem quit, pause, scores;

    public GameFrame() throws HeadlessException {
        this.setTitle("Snake");
        //menuBar();

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
        quit = new JMenuItem("Pause");
        pause = new JMenuItem("Scores");
        scores = new JMenuItem("Quit");
        menu.add(quit);
        menu.add(pause);
        menu.add(scores);
        mb.add(menu);
        this.setJMenuBar(mb);

    }

    private void setAction(){
        scores.addActionListener(this);
        pause.addActionListener(this);
        quit .addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == scores)
        {


        }else if(e.getSource() ==pause)
        {

        } else if (e.getSource() ==quit)
        {
            System.exit(0);
        }

    }
}
