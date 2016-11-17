package com.company;

import java.util.*;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        Scanner sf = new Scanner(new File ("MyData.txt"));

        int maxIndex = -1;
        String text [] = new String [1000];
        while (sf.hasNext())
        {
            maxIndex++;
            text [maxIndex] = sf.nextLine();
        }
        sf.close();

        for (int j = 0; j <= maxIndex; j++)
            System.out.println(text[j]);

        FileWriter fw = new FileWriter("output.txt");
        PrintWriter output = new PrintWriter(fw);
        output.print ("APPLE SUX");
        output.close();
        fw.close();
    }
}
