package com.casr.createContact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.comcast.crm.listnerutility.listImpClass;

import aDomainname.appname.modulename.BaseClass;
import co.cast.generic.BaseClass.createOrganization;
import co.cast.generic.BaseClass.homeContact;
import co.cast.generic.BaseClass.orgInfoVerify;
import co.cast.generic.FileUtility.ExcelUtility;
import junit.framework.Assert;

public class crmContactsTest extends BaseClass {
	SoftAssert aser;
	@Test
	public void createContact() throws Exception {
				
		//click on contact linkText
		homeContact home=new homeContact(driver);
		home.contact();
		/**
		 * enter lastname and click on save
		 */
		String lastname=elib.getDataFromExcel("contact", 1, 2) +jvlib.getRandomNumber();
		createNewContact cnc=new createNewContact(driver);
		cnc.getlastname().sendKeys(lastname);
		cnc.getsavebtn().click();
		
		/**
		 * verifycation to check if its equals
		 */
		aser=new SoftAssert();
	String headercontact= driver.findElement(By.className("dvHeaderText")).getText();
  boolean act= headercontact.contains(lastname);
  aser.assertEquals(act, true);
  aser.assertAll();
	
 
	}
	@Test 
	public void contacWithDate() throws Exception {
		homeContact home=new homeContact(driver);
		home.contact();
		/**
		 * enter lastname and click on save
		 */
		String lastname=elib.getDataFromExcel("contact", 1, 2) +jvlib.getRandomNumber();
		createNewContact cnc=new createNewContact(driver);
		cnc.getlastname().sendKeys(lastname);
		wlib.ScrollByAmount(driver);
		cnc.getStrdate().clear();
  String sdate =    jvlib.getRequiredDateYYYYMMDD(30);
  cnc.getStrdate().sendKeys(sdate);
  
	}
	@Test
	public void contactWithOrg()throws Exception {
		homeContact home=new homeContact(driver);
		home.contact();
		/**
		 * enter lastname and click on save
		 */
		String lastname=elib.getDataFromExcel("contact", 1, 2) +jvlib.getRandomNumber();
		createNewContact cnc=new createNewContact(driver);
		cnc.getlastname().sendKeys(lastname);
		//save the details
		cnc.getsavebtn().click();
	String headercontact=	driver.findElement(By.className("dvHeaderText")).getText();
	boolean verify=headercontact.contains(lastname);

	aser.assertEquals(verify,true);
		createOrganization co=new createOrganization(driver);
		co.gettext().click();
		
		co.getcreatebtn().click();
String orgname=elib.getDataFromExcel("org", 1, 0) + jvlib.getRandomNumber();
		
		creatNewOrganization on=new creatNewOrganization(driver);
		on.getorgname().sendKeys(orgname);
		on.getsave().click();
		//verify the organization contans actual name orgname
		orgInfoVerify oi=new orgInfoVerify(driver);
	String ver=	oi.getverify().getText();
		
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(orgname, ver);
	soft.assertAll();	
	}
}
