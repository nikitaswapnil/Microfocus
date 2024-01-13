package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class waitClass extends BaseClass {

	// sendkeys()
	public static void sendKeys(WebElement wb, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		waitwb.sendKeys(value);
	}

	// click()
	public static void click(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		waitwb.click();
	}

	// clear
	public static void clear(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		waitwb.clear();
	}

	// getText
	public static String getText(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		String a = waitwb.getText();
		return a;

	}

	// getAttribute
	public static String etAttribute(WebElement wb, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		String a = waitwb.getAttribute(value);
		return a;
	}

	// isSelected
	public static boolean isSelected(WebElement wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		boolean a = waitwb.isSelected();
		return a;
	}
}
