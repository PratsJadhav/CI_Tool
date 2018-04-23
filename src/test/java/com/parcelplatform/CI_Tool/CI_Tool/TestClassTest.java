package com.parcelplatform.CI_Tool.CI_Tool;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestClassTest {
  @Test
  public void f() {
	  
	  System.out.println("testing CI....");
	  System.out.println("finished CI with success");
	  System.out.println("another edit");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
