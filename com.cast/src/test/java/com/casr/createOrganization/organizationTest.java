package com.casr.createOrganization;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.casr.createContact.creatNewOrganization;
import aDomainname.appname.modulename.BaseClass;
import co.cast.generic.BaseClass.createOrganization;
import co.cast.generic.BaseClass.orgInfoVerify;
import co.cast.generic.WebDriverUtitlity.UtilityClassObject;
import co.cast.generic.WebDriverUtitlity.WebDriverUtility;

@Listeners(com.comcast.crm.listnerutility.listImpClass.class)
public class organizationTest extends BaseClass {

	@Test
	public void createOrgTest() throws Exception {
		
		UtilityClassObject.getTest().log(Status.INFO,"read data from excel");

		
		// click on create orgnization
		createOrganization co = new createOrganization(driver);
		co.createorg();

		UtilityClassObject.getTest().log(Status.INFO,"Navigate To create Org Pag");

		// create new organization
		String orgname = elib.getDataFromExcel("org", 1, 0) + jvlib.getRandomNumber();

		UtilityClassObject.getTest().log(Status.INFO,"create a new org");

		creatNewOrganization on = new creatNewOrganization(driver);
		on.getorgname().sendKeys(orgname);
		on.getsave().click();
		
		UtilityClassObject.getTest().log(Status.INFO,"verify create a new org");

		// verify the organization contans actual name orgname
		orgInfoVerify oi = new orgInfoVerify(driver);
		String ver = oi.getverify().getText();

		SoftAssert soft = new SoftAssert();
		soft.assertEquals(orgname, ver);
		soft.assertAll();
	}

	@Test
	public void createverigyIndustryTest() throws Exception {

		WebDriverUtility wd = new WebDriverUtility();

		// create org
		createOrganization co = new createOrganization(driver);
		co.createorg();

		// select data from excel
		String orgname = elib.getDataFromExcel("org", 1, 0) + jvlib.getRandomNumber();
		// send the organization name
		creatNewOrganization on = new creatNewOrganization(driver);
		on.getorgname().sendKeys(orgname);
		// select dropdown
		String drop1 = elib.getDataFromExcel("tc", 1, 1);
		on.dropdown(drop1);

		on.getsave().click();	 
		// verify the industry drop down
		orgInfoVerify oi = new orgInfoVerify(driver);
		String dd = oi.getdd().getText();

		SoftAssert soft = new SoftAssert();
		soft.assertEquals(dd, drop1);
		soft.assertAll();

	}

	@Test
	public void orgPhonenumberTest() throws Throwable {
		WebDriverUtility wd = new WebDriverUtility();

		// create org
		createOrganization co = new createOrganization(driver);
		co.createorg();

		// select data from excel
		String orgname = elib.getDataFromExcel("org", 1, 0) + jvlib.getRandomNumber();
		creatNewOrganization on = new creatNewOrganization(driver);
		on.getorgname().sendKeys(orgname);

		// send phone number
		String phone = elib.getDataFromExcel("tc", 2, 1) + jvlib.getRandomNumber();
		on.getphone().sendKeys(phone);

		on.getsave().click();
		// verify the phone number
		String actphone = driver.findElement(By.id("dtlview_Phone")).getText();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actphone, phone);
		soft.assertAll();
	}
}
