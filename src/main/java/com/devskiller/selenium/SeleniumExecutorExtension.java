package com.devskiller.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SeleniumExecutorExtension {

    private final WebDriver driver;

    public SeleniumExecutorExtension(WebDriver driver) {
        this.driver = driver;
    }

    private Select getDropdown() { return new Select(driver.findElement(By.tagName("select"))); }

    private List<WebElement> getInputs() { return driver.findElements(By.cssSelector(".container.text-box")); }

    public void setDropdownValues(String[] valuesToSet) {
        Select dropdown = getDropdown();
        for (String value: valuesToSet) {
            dropdown.selectByVisibleText(value);
        }
    }

    public String[] getInput() {
        List<String> allInputs = new ArrayList<String>();
        getInputs()
                .forEach(option -> allInputs.add(option.getAttribute("value")));
        String[] array = new String[allInputs.size()];
        allInputs.toArray(array);
        return array;
    }
}
