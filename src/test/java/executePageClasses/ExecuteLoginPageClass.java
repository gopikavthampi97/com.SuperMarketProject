package executePageClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import elementRepository.LoginPageClass;

public class ExecuteLoginPageClass extends BaseClass {

LoginPageClass lp;

  @Test
  public void verify_The_Correct_Page_Is_Open_While_Hitting_The_Url() {
 
lp=new LoginPageClass(driver);
String actual_Result = lp.getUrl();
String expected_Result = "https://qabible.in/payrollapp/site/login";
Assert.assertEquals(actual_Result, expected_Result);

  }
 
  @Test
  public void verify_Successfull_Login() {
 
 lp=new LoginPageClass(driver);
 lp.login("carol", "1q2w3e4r");
 Boolean actual_Result = lp.isCarolThomasDisplayed();
 Assert.assertTrue(actual_Result);
 
  }
 
  @Test
  public void verify_UnSuccessful_Login() {
 
 lp=new LoginPageClass(driver);
 lp.login("carol", "1asdf1");
 String actual_Result = lp.getTextOfIncorectMsg();
 String expected_Result = "Incorrect username or password.";
 Assert.assertEquals(actual_Result, expected_Result);

       
  }
}
