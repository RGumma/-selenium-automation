package utilities; 

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig() {
		
		File src = new File("./Configuration//config.properties");
		try {
			
			FileInputStream fis = new FileInputStream(src);
			
		      prop = new Properties();
		      prop.load(fis);
			
		   } catch(Exception e) {
			   
			   System.out.println(e.getMessage());
		   }
	}

	public String getUrl() {
		
		String url = prop.getProperty("baseURL");
		
		return url;
	}

	
	
	public String getUserName() {
		
		String username = prop.getProperty("username");
		
		return username;
	}
	

	 public String getPassword() {
		 
		 String password= prop.getProperty("passwordname");
				 
			return password;
	 }

	 
	public String getChromePath() {
		
		
		String chromepath= prop.getProperty("chromepath");
		
		return chromepath;
	}



}





