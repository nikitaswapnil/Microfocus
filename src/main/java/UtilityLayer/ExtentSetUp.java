package UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentSetUp extends BaseClass {
	
	public static ExtentReports SetUp(String SuiteName) {
		ExtentReports extentReports = new ExtentReports();

		String path = System.getProperty("user.dir") + "\\ExtentHTMLReports\\" + SuiteName + date() + ".html";
		ExtentSparkReporter	 extentSparkReporter = new ExtentSparkReporter(path);

		extentReports.attachReporter(extentSparkReporter);

		return extentReports;

	}

	// screenshot code
	public static String ScreenShot(String FolderName, String TestCaseName) {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);
		String Destination = System.getProperty("user.dir") + "\\"+FolderName+"\\" + TestCaseName + date() + ".png";
		try {
			FileUtils.copyFile(src, new File(Destination));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Destination;

	}
//create static date method

	public static String date() {
		SimpleDateFormat s = new SimpleDateFormat("ddMMyyyy_HHmmss");
		String date = s.format(new Date());
		return date;
	}
}
