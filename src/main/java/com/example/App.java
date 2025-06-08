package com.example;

/**
 * Hello world!
 *
 */
public class App 
{   
	public int add(int a,int b){
	return a+b;
	}
    public static void main( String[] args )
    
    {
    	App app=new App();
    	int res=app.add(5,6);
        System.out.println( "Hello World!" +res);
    }
}
