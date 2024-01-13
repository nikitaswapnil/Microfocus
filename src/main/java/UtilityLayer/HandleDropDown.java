package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectByVisibleText(WebElement wb, String value) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement waitWb = wait.until(ExpectedConditions.visibilityOf(wb));

		Select sel = new Select(waitWb);

		sel.selectByVisibleText(value);
		//new Select(Wait.visibilityStatus(wb)).selectByVisibleText(value);

	}

	public static void selectByValue(WebElement wb, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitWb = wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel = new Select(waitWb);
		sel.selectByValue(value);
		
		//new Select(Wait.visibilityStatus(wb)).selectByValue(value);
	}

	public static void selectByIndex(WebElement wb, int value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel = new Select(waitwb);
		sel.selectByIndex(value);
	}

	public static void getOptions(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitWb = wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel = new Select(waitWb);
		List<WebElement> ls = sel.getOptions();
		for (WebElement wb1 : ls) {
			String a = wb1.getText();
			System.out.println(a);
		}

	}

	public static String getFirstSelectedOption(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitWb = wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel = new Select(waitWb);
		WebElement wb1 = sel.getFirstSelectedOption();
		String a = wb1.getText();
		return a;
	}

	public static int size(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitWb = wait.until(ExpectedConditions.visibilityOf(wb));
		Select sel = new Select(waitWb);
		List<WebElement> ls = sel.getOptions();
		int a = ls.size();
		return a;
	}
	// create static selectDropDown()method with WebElement and String arguments

	public static void selectDropDown(WebElement wb, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		List<WebElement> ls = wait.until(ExpectedConditions.visibilityOfAllElements(wb));
		// iterate all values
		for (WebElement wb1 : ls) {
			wb1.getText().equalsIgnoreCase(value);
			wb1.click();
			break;

		}
	}

}
