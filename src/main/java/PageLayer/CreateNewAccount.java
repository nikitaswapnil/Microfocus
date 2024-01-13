package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;

public class CreateNewAccount extends BaseClass {
	
	@FindBy(id="sreg_fname_inpt")
	WebElement fname;

	@FindBy(id="sreg_lname_inpt")
	WebElement lname;
	
	@FindBy(id="sreg_title_inpt")
	WebElement title;
	
	@FindBy(id="sreg_company_inpt")
	WebElement company;
	
	@FindBy(id="sreg_city_inpt")
	WebElement city;
	
	@FindBy(id="sreg_zip_inpt")
	WebElement pcode;
	
	@FindBy(id="sreg_country_inpt")
	WebElement country;
	
	@FindBy(id="sreg_state_inpt")
	WebElement state;
	
	@FindBy(id="sreg_lang_inpt")
	WebElement lang;
	
	@FindBy(id="sreg_timezone_inpt")
	WebElement timezone;
	
	@FindBy(id="sreg_phone_inpt")
	WebElement phone;
	
	@FindBy(id="sreg_email_inpt")
	WebElement email;
	
	public CreateNewAccount() {
		PageFactory.initElements(driver, this);
		
	}	
	public void CreateNewAccountFun(String firstname,String lastname,String Title,String com, String City,String Pincode,String con,String State,String language,String tzone,String ph,String mail) {
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		title.sendKeys(Title);
		company.sendKeys(com);
		city.sendKeys(City);
		pcode.sendKeys(Pincode);
		
		HandleDropDown.selectByVisibleText(country, con);
		
		HandleDropDown.selectByVisibleText(state, State);
		
		HandleDropDown.selectByVisibleText(lang, language);
		
		timezone.sendKeys(tzone);
		phone.sendKeys(ph);
		email.sendKeys(mail);
	
	}
}
