package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.DashboardPageClass;
import elementRepository.DedudctionPageClass;
import elementRepository.LoginPageClass;

public class ExecuteDeductionPageClass extends BaseClass{
	
	LoginPageClass lp;
	DashboardPageClass dp;
	DedudctionPageClass dpp;
	
  @Test
  public void verifyDeductionPageOpeiningWhileClickingDeductionTab() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  dpp=new DedudctionPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  dp.clickOnDeductionsTab();
	  boolean actual_Result=dpp.isDeductionPageOpening();
	  Assert.assertTrue(actual_Result);
	  
  }
@Test
  public void verifyToCreateANewDedudction() {
	  
	  lp=new LoginPageClass(driver);
	  dp=new DashboardPageClass(driver);
	  dpp=new DedudctionPageClass(driver);
	  lp.login("carol", "1q2w3e4r");
	  dp.clickOnDeductionsTab();
	  dpp.clickonAddDeductionTab();
	  dpp.selectValueFromWorker("Rijil");
	  dpp.selectValueFromTextBox();
	  dpp.selectValueFromType(1);
	  dpp.typeIntoAmount("1000");
	  dpp.typeIntoDate("19-06-2023");
	  dpp.clickOnSaveButton();
	  boolean Actual_Result=dpp.isWorkerNameDisplayed();
	  Assert.assertTrue(Actual_Result);
	  
  }
}