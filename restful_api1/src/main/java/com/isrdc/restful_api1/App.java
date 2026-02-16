package com.isrdc.restful_api1;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        User user = new User();
        
        user.setName("rahul");
        user.setAge(21);
        
        Gson gson = new Gson();
        
        String str = gson.toJson(user);
        
        System.out.println(str);
    }
}
