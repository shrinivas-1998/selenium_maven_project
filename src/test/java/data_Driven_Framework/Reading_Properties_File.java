package data_Driven_Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Reading_Properties_File
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		// Specify the location of the properties file 
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");
		
		// create object of properties class and Load the file
		Properties propertiesobj = new Properties();
		propertiesobj.load(file);
		
		// Reading the data from properties file 
	     String appurl = propertiesobj.getProperty("appurl");
	     String email = propertiesobj.getProperty("email");
	     String password = propertiesobj.getProperty("password");
	     String orderid = propertiesobj.getProperty("orderid");
	     String customerid = propertiesobj.getProperty("customerid");
	     
	     System.out.println(appurl+ " "+email+" "+password+" "+orderid+" "+customerid);
	     
	     // reading all the keys from prperties file 
	     Set<String>  keys = propertiesobj.stringPropertyNames();
	     System.out.println(keys); // [password, orderid, customerid, appurl, email]
	    
	     Set<Object> keys1 = propertiesobj.keySet();
	     System.out.println(keys1); // [password, orderid, customerid, appurl, email]
	    
	    // reading all the values from properties file 
	       Collection<Object> values =propertiesobj.values();
	       System.out.println(values);
	       
	       file.close();
	}
}
