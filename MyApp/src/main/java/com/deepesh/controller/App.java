package com.deepesh.controller;

import com.deepesh.pojo.Address;
import com.deepesh.pojo.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Address address=new Address("BTM","Bangalore","Katnatka","India",560038);
        Student student=new Student(101,"Deepesh","9803475225",20,address);
        
        System.out.println(student);
    }
}
