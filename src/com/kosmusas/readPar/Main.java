package com.kosmusas.readPar;

import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* TASK:
        I’d like you to try starting a Java project with a simple program that would read parameters given on the command line:

        a. Say you call your program ReadPar if I call “ReadPar /home/hcg/config.properties”

            1) I’d want it to output the contents of the file config.properties in folder /home/hcg/ on the standard output.
         */
Scanner location = new Scanner(System.in);
        System.out.println(location.nextLine());

try (FileReader reader = new FileReader("/"+location+"config.properties")) { //~/kosmusas/javule/readPar/readPar/.idea/files/config.properties
    Properties properties = new Properties();
    properties.load(reader);



  int n = 1;

    do{

        String keyValue = properties.getProperty(""+ n + "");

        System.out.println(keyValue);
        if (keyValue != null) {
            n++;
        }  else {
            n = 1001; }
            }  while (n < 1000);

    System.out.println(properties);

    /*String test = properties.getProperty(n);
    System.out.println(test);*/
} catch (Exception e) {
    e.printStackTrace();
}


    }

}
