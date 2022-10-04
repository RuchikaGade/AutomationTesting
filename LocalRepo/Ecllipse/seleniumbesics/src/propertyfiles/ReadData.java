package propertyfiles;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException ,FileNotFoundException {
		String CurrentworkingDir=System.getProperty("user.dir")+ "\\seleniumbesics\\New.properties";
		System.out.println("current Dir:+CurrentworkingDir");
		String filepath=CurrentworkingDir+"\\seleniumbesics\\New.properties";
		System.out.println(filepath);
		//get file location create an instance of fileeinputStream class and pass the file location to its constructor
		FileInputStream fis=new FileInputStream("\\seleniumbesics\\New.properties");
		//create an  instance of property class
		Properties prop=new Properties();
		//load property using load method properties class
		prop.load(fis);
		//Read data from property file
		System.out.println(prop.getProperty("application url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("pincode"));
		System.out.println(prop.getProperty("mobile"));
		
		
		
	}

}
