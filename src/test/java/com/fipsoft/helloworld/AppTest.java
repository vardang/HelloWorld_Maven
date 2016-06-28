package com.fipsoft.helloworld;


//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
//    extends TestCase
{

  @Test
  public void test(){
        
       Greeting greet = new Greeting();
       String greetingString = greet.toString();
       assertEquals(true,!(greetingString==null));
  }
}
