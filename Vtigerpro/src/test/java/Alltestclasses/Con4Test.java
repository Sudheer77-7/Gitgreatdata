package Alltestclasses;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Contactidfulldatapage.Fullcontactids;
import Contactsfullpage.Callsfullpage;
import Contactspage.Contactlist;
import Org.genericLibpage.Baseclasss;
import Org.genericLibpage.Iconstant;
import Utilitiespage.Excelutility;
import Utilitiespage.Javautilities;
import Utilitiespage.WebDriverUtility;
@Listeners(Org.genericLibpage.Listner.class)

public class Con4Test extends Baseclasss 
{
	WebDriverUtility wdu;
	Excelutility eu;
	Javautilities ju;
	Fullcontactids Fci;
	@Test(groups="ST")
	public void Con4data() throws Throwable
	{
		Contactlist ca=new Contactlist(driver);
		ca.getCalls().click();
		Callsfullpage cls=new Callsfullpage(driver);
		cls.getSearch().click();
		eu=new Excelutility();
		ju=new Javautilities();
		wdu=new WebDriverUtility(); 
		int data=ju.randomnumber();
		cls.getSearch().sendKeys(eu.singleDatafetch(Iconstant.excel,"Sheet2", 2, 2)+data);
		cls.getSearchfield().click();
		String data1=eu.singleDatafetch(Iconstant.excel,"Sheet2", 2, 2);
		wdu.selectOptionByVisibleText(cls.getSearchfield(), data1);
		cls.getSearchfield().click();
		Fullcontactids  Fci=new Fullcontactids(driver);
		Fci.getCon4().click();
		Thread.sleep(3000);
		Fci.getEdit().click();
		Thread.sleep(3000);


		
	}
}
