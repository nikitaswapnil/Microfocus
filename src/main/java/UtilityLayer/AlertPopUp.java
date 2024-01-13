package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class AlertPopUp extends BaseClass {
	public static void accept(String wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		alt.accept();
	}

	public static void dismiss(String wb) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		alt.dismiss();
	}

	public static String getText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		String a = alt.getText();
		return a;
	}

	public static void sendKeys(WebElement wb, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		alt.sendKeys(value);

	}

}
