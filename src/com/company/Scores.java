package com.company;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Scores //file handling class for scores
{
        //Todo Pass in variables rather then call it from GamePanel class
         void startScores()
        {

            String filepath = "ScoreSheet";
            try {
                saveScore(GamePanel.fullName,String.valueOf(GamePanel.score),filepath);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Something ain't right :(");
            }
        }


        private void saveScore(String name ,String score,String filepath) throws IOException {
            try(
                FileWriter fw = new FileWriter(filepath,true);//actually writer and true means it goes to next line
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw)){//gives access to syntax

                pw.println(name + "," + score + ",");

            }






        //Todo Reading and displaying from score sheet method

    }}


