package com.devskiller.selenium;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeleniumExecutorTest extends BaseSeleniumTest {

    @Test
    public void shouldInputValues() {
        webDriver.get("http://localhost:8089/index.html");
        SeleniumExecutor executor = new SeleniumExecutor(webDriver);

        executor.setInput("test input");

        String[] inputs = new SeleniumExecutorExtension(webDriver).getInput();
        assertEquals("test input", inputs[0]);
        assertEquals("test input", inputs[1]);
        assertEquals("test input", inputs[2]);
    }
}
