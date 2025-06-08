package com.example;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test

    
    public void testApp()
    {
       App app=new App();
       int res=app.add(5,6);
       System.out.print(res);
       Assert.assertEquals(11,res);
    }
}

