package com.fipsoft.helloworld;

import java.util.logging.Logger;

/**
 * Created by vardang on 6/21/16.
 */
public class App {

    public static void main(String[] args){

        Greeting greet = new Greeting();

        Logger log = Logger.getLogger("Hello World");
        log.info(greet.toString());

    }
}
