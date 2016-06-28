package com.fipsoft.helloworld;

import java.io.*;


/**
 * Created by vardang on 6/21/16.
 */
public class Greeting {



    private String readFromFile (){

        String someGreeting = null;

        File confProp = new File("src/main/resources/config.properties");
        BufferedReader bufReader = null;

        try {

            FileReader flReader = new FileReader(confProp);
            bufReader = new BufferedReader(flReader);
            someGreeting = bufReader.readLine();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: config.properties");
        } catch (IOException e) {
            System.out.println("Unable to read file: config.properties" );
        }

        try {
            bufReader.close();
        } catch (IOException e) {
            System.out.println("Unable to close file: config.properties");
        }



        return someGreeting;

    }


    public String toString(){

        return readFromFile();
    }
}
