package Contactidfulldatapage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fullcontactids

{
@FindBy(xpath="//input[@type='checkbox']/../../../tr[3]/td/input")
private WebElement con2;

@FindBy(xpath="//input[@type='checkbox']/../../../tr[4]/td/input")
private WebElement con3;

@FindBy(xpath="//input[@type='checkbox']/../../../tr[5]/td/input")
private WebElement con4;

@FindBy(xpath="//input[@type='checkbox']/../../../tr[6]/td/input")
private WebElement con5;

@FindBy(xpath="//input[@type='checkbox']/../../../tr[7]/td/input")
private WebElement con6;

@FindBy(xpath="//input[@type='checkbox']/../../../tr[8]/td/input")
private WebElement con7;

@FindBy(xpath="//input[@type='checkbox']/../../../tr[9]/td/input")
private WebElement con8;

@FindBy(xpath="//input[@type='checkbox']/../../../tr[10]/td/input")
private WebElement con9;

@FindBy(xpath="//input[@type='checkbox']/../../../tr[11]/td/input")
private WebElement con10;

@FindBy(xpath="//input[@value='Delete']")
private WebElement Delate;

@FindBy(xpath="//input[@value='Mass Edit']")
private WebElement Edit;

@FindBy(xpath="//input[@value='Send Mail']")
private WebElement Email;

@FindBy(xpath="//input[@value='Send SMS']")
private WebElement Sms;

public Fullcontactids(WebDriver driver)
{
	  PageFactory.initElements(driver, this);
}

public WebElement getEdit() {
	return Edit;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getSms() {
	return Sms;
}

public WebElement getCon2() {
	return con2;
}

public WebElement getCon3() {
	return con3;
}

public WebElement getCon4() {
	return con4;
}

public WebElement getCon5() {
	return con5;
}

public WebElement getCon6() {
	return con6;
}

public WebElement getCon7() {
	return con7;
}

public WebElement getCon8() {
	return con8;
}

public WebElement getCon9() {
	return con9;
}

public WebElement getCon10() {
	return con10;
}
public WebElement getDelate() {
	return Delate;
}

}
