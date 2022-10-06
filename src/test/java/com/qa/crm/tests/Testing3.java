package com.qa.crm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
	
	
  @Test (priority = 1) //create new user test@test.com
  public void createUser() {
	  System.out.println("I am in home test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(2 > 3, "Verifying Element"); // we use regular assert in industry
	  System.out.println("After Assertion");
	  Assert.assertEquals("abc", "abc");
  }
  
  @Test (priority = 2, dependsOnMethods = "createUser")  //edit new user test@test.com
  public void editUser() {
	  System.out.println("I am in edit user");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(2 > 3, "Verifying Element"); // we use regular assert in industry
	  System.out.println("After Assertion");
	  softAssert.assertAll(); // similar to error collector in junit
  }
 
  @Test (priority = 3, dependsOnMethods = "editUser")  //delete new user test@test.com
  public void deleteUser() {
	  System.out.println("I am in end test");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(2 > 3, "Verifying Element"); // we use regular assert in industry
	  System.out.println("After Assertion");
	  softAssert.assertEquals("abc", "abc"); 
	  System.out.println("after second assertion");
	  softAssert.assertAll();
  }
  
  
}
