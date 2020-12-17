package com.ctl.it.qa.omnivue.tools.steps.user;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;


import java.util.Properties;

public class FileIOTest {

	
	    private static Properties textproperty = new Properties();
	    
	    public String readFile(String value2read) throws FileNotFoundException, IOException {
	    	textproperty.load(new FileInputStream("parameter.properties"));
			 return textproperty.getProperty(value2read);
	    }
	    
	    public static void writeFile(String fromvalue,String tovalue) throws FileNotFoundException, IOException {
	    	textproperty.load(new FileInputStream("parameter.properties"));
	    	textproperty.setProperty(fromvalue, tovalue);
	    	textproperty.store(new FileOutputStream("parameter.properties"), null); 
	    }
	
	
	
}
