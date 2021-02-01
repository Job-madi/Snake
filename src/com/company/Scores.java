package com.company;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Scores //file handling class for scores
{

        public static void main(String[] args)
        {

            String filepath = "ScoreSheet";
            saveScore(GamePanel.fullName,String.valueOf(GamePanel.score),filepath);
        }


        public static void saveScore(String name ,String score,String filepath)
        {
            try{
                FileWriter fw = new FileWriter(filepath,true);//actually writer and true means it goes to next line
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);//gives access to syntax

                pw.println(name + "," + score+"," );
                pw.flush();
                pw.close();




            }
            catch(Exception e)
            {
                System.out.println("score not saved" + e);
            }
        }

        //Todo Reading and displaying from scoresheet method
    }


