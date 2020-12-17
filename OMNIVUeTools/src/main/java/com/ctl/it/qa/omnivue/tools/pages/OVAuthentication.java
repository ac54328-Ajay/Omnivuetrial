package com.ctl.it.qa.omnivue.tools.pages;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



import com.ctl.esec.crypto.BasicEncryptor;
import com.ctl.esec.crypto.CipherText;



public class OVAuthentication {
	
	//public static String FILENAME = "C:\\OSSPROV\\AutomationTools\\hold_data";
	
	public static String FILENAME = "\\\\eldnp1515dm3\\Mixdeng06\\Data\\NetworkSystemTest\\OMNIVUE\\Automation\\Selenium\\BDD Scripts\\2018\\TESTAUTO\\AutomationTools\\hold_data_";
	
	public void Encrypt_ESEC(String Username_secretkey, String passworxd2encrypt){
		
		
		BasicEncryptor encryptor = null;         
        String secretKey = Username_secretkey+"OVMY$125R"; 
        
        String secretData = passworxd2encrypt; 
        
        try {
            encryptor = new BasicEncryptor("AES/CBC/PKCS5Padding");
        }
        catch(Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

        CipherText cTxt = null;
        String encData = "";

        try {
        	
        	cTxt = encryptor.encrypt(secretData.toCharArray(), 
                    secretKey.toCharArray(),
                    secretKey.length() * 8);
        	
        	 encData = cTxt.toEncodedString();
        	 
        }
        catch(Exception ex) {
            System.out.println("Caught exception, message: " + ex.getMessage());
            System.exit(0);
        }

        FileWriter fw = null;

        try {
        	
        	 fw = new FileWriter(FILENAME+Username_secretkey);
	            fw.write(encData);
	            fw.flush();
	        }
	        catch(Exception ex) {
	            System.err.println("Caught an Exception, msg: " + ex.getMessage());
	        }
	        finally {
	            if(fw != null) {
	                try {
	                    fw.close();
	                }
	                catch(IOException ioe) {
	                    System.err.println("IOException closing FileWriter.");
	                }
	            }
	        }
			
	    }
       
	public String enter_cuid(String Usercuid){
		
		BasicEncryptor decryptor = null;
		char[] data = null;
        FileReader fr = null;
        try {
            File f = new File(FILENAME+Usercuid);
            fr = new FileReader(f);
            int size = (int)f.length();
            data = new char[size];
            int chars_read = 0;
            while(chars_read < size) {
                chars_read += fr.read(data, chars_read, size - chars_read);
            }
        }
        
        catch(Exception ex) {
            System.err.println("Caught Exception, msg : " + ex.getMessage());
            ex.printStackTrace();
            System.exit(0);
        }
        finally {
            if(fr != null) {
                try {
                    fr.close();
                }
                catch(IOException ioe) {
                    System.err.println("IOException closing FileReader.");
                }
            }
        }

        String encData = "";
        for(int i = 0; i < data.length; i++) {
            encData += data[i];
        }
        String secretKey = Usercuid+"OVMY$125R";  
        CipherText cTxt = null;
        String clearTxt = "";
        
        try {
            cTxt = new CipherText(encData);

            decryptor = new BasicEncryptor(cTxt);
            clearTxt = decryptor.decrypt(cTxt, secretKey.toCharArray(),
                                           secretKey.length() * 8);
        }
        catch(Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        
        return clearTxt;
    }

   	
        	
	
}
