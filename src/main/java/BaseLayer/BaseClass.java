package BaseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static	WebDriver driver;
public static FileInputStream fis;
public static Properties prop;

public BaseClass() {
	File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\ConfigurationLayer\\Microfocus.properties");
	 try {
		fis=new FileInputStream(f);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  prop=new Properties();
	  try {
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\AllDrivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		String url= prop.getProperty("URL");
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 driver.get(url);
	}

}
