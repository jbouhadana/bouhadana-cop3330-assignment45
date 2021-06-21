/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args)throws IOException{ 
        File file = new
                File("C:\\User\\jbouhadana\\Desktop\\school\\cop3330\\example45.txt");
        Scanner jb = new Scanner(file);
        Scanner jb2 = new Scanner(System.in);

        System.out.print("\nEnter name of Output File: ");
        String outputfile = jb2.next();

        FileWriter sonk = new
                FileWriter("C:\\Users\\jbouhadana\\Desktop\\school\\cop3330\\"+outputfile);

        try
        {
            while(jb.hasNext())
            {
                String sonkput = jb.nextLine();
                sonkput = sonkput.replaceAll("utilize", "use");
                sonk.write(sonkput);
                sonk.write("\n");
            }
        }
        finally
        {
            jb.close();
        }
        sonk.close();
        System.out.println("\nSuccessfully Modified");
    }
}
