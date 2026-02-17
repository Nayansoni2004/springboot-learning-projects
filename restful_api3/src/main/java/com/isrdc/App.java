package com.isrdc;

import java.io.File;
import java.io.IOException;

//import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        serialization();
        deSerialization();
    }
    
    //de-serialization using jackson
    public static void deSerialization() {
    		ObjectMapper objMapper = new ObjectMapper();
    		try {
    			//json -> java Object
    			Student stu = objMapper.readValue(new File("bbb.json"), Student.class);
    			System.out.println(stu);
    			
    		} catch(IOException e) {
    			e.printStackTrace();
    		}
    }
    
    //serialization using jackson
    public static void serialization() {
    		Student student = new Student();
    		student.setName("Rahul");
    		student.setAge(18);
    		student.setCollege("SRIT");
    		student.setMarks(79.89f);
    		
    		ObjectMapper objMapper = new ObjectMapper();
    		try {
    		//java Object -> Json
    			objMapper.writeValue(new File("bbb.json"), student);
    		} catch(IOException e) {
    			e.printStackTrace();
    		}
    }
}
