package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GeneralUtilities;

public class DashboardPageClass {

WebDriver driver;

GeneralUtilities gl=new GeneralUtilities();

public DashboardPageClass(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[text()='Dashboard']")
WebElement dashboard;

@FindBy(xpath="//a[text()='Company']")
WebElement company;

@FindBy(xpath="//a[text()='Clients']")
WebElement clients;

@FindBy(xpath="//a[text()='Workers']")
WebElement workers;

@FindBy(xpath="//a[text()='Deduction']")
WebElement deduction;

@FindBy(xpath="//a[text()='TimeSheet']")
WebElement timeSheet;

@FindBy(xpath="//a[text()='Payslip']")
WebElement paySlip;

@FindBy(xpath="//a[text()='Invoice']")
WebElement inVoice;

@FindBy(xpath="//a[text()='Report']")
WebElement report;

@FindBy(xpath="//a[@href='/payrollapp/user']")
WebElement settings;

@FindBy(xpath="//p[contains(text(),'Welcome')]")
WebElement dashboardDisplyMsg;



public Boolean isdashboardDisplyMsgDisplayed() {
return gl.isDisplayedMethod(dashboardDisplyMsg);

}

public void clickOnClientTab() {
gl.clickElement(clients);

}

public void clickOnDeductionsTab() {
	gl.clickElement(deduction);
	
}

public void clickOnWorkersTab() {
	gl.clickElement(workers);
	
}



}