package com.devskiller.selenium;

import org.openqa.selenium.WebDriver;

public class SeleniumExecutor {

  private final WebDriver driver;

  public SeleniumExecutor(WebDriver driver) {
    this.driver = driver;
  }

  public String[] getDropdownValues() {
    return null;
  }

  public void setInput(String input) { throw new org.apache.commons.lang3.NotImplementedException("Please implement this method"); }
}
