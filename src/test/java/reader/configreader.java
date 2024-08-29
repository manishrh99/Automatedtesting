package reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configreader {
	public static Properties getpropertiesobj() throws IOException {
		FileInputStream fp = new FileInputStream(".\\src\\test\\java\\files\\configfile");
		 Properties prop = new Properties();
		 prop.load(fp);
		 return prop;
		
	}
	public static String getUrl() throws IOException {
		return getpropertiesobj().getProperty("URL");
		
	}
	public static String getusername() throws IOException {
		return getpropertiesobj().getProperty("Username");
		
	}
	public static String getpassword() throws IOException {
		return getpropertiesobj().getProperty("Password");
		
	}

}
