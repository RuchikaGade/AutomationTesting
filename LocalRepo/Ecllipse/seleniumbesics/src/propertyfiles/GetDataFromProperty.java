package propertyfiles;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataFromProperty {

	public static void main(String[] args) throws IOException{
		String filepath1="";//file name and location absolute path
		String filepath2="";//file name and location Relative path
		//or
		String filepath3=System.getProperty("user.dir")+"";
		//create an instance of fileinputstream by passing the location of proprty file on its constructor
		FileInputStream fis=new FileInputStream(filepath1);
		Properties prop=new Properties();//create an instance of property class
		//with the help of proerties class ref call load() and pass the fileInputStream ref as a parameter
		prop.load(fis);
		System.out.println("Application URL:"+prop.getProperty("appUrl"));
		System.out.println("UserName:"+prop.getProperty("USerName"));
		System.out.println("PAssword:"+prop.getProperty("password"));
		System.out.println("Confirm Password:"+prop.getProperty("confirmPassword"));
		System.out.println("First NAme:"+prop.getProperty("firstName"));
		System.out.println("LAst Name:"+prop.getProperty("lastName"));
		System.out.println("Contact number:"+prop.getProperty("contactNumber"));
		System.out.println("emailId:"+prop.getProperty("emailId"));
		
		
		
		
		

	}

}
