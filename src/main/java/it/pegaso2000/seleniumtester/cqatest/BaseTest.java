/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.pegaso2000.seleniumtester.cqatest;

import java.util.concurrent.TimeUnit;
import junit.framework.TestCase;
import static junit.framework.TestCase.fail;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 *
 * @author ebuchicchio
 */
public abstract class BaseTest extends TestCase{
    private final String username;
    private final String password;
    
    protected WebDriver driver;
    protected String baseUrl;
    protected boolean acceptNextAlert = true;
    protected StringBuffer verificationErrors = new StringBuffer();

    public BaseTest(){
        super();
        this.username= TestSuiteCQA.getUsername();
        this.password= TestSuiteCQA.getPassword();
    }
    
    /***
     * Esegue login se necessario
     */
    protected void doLogin(){
        doLogin(this.username,this.password);
    }
    
    protected void doLogin(String username, String password) {
        driver.get(baseUrl+"login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("loginTxtUsername")).clear();
        driver.findElement(By.id("loginTxtUsername")).sendKeys(username);
        driver.findElement(By.id("loginTxtPassword")).clear();
        driver.findElement(By.id("loginTxtPassword")).sendKeys(password);
        driver.findElement(By.name("submit")).click();   
    }
    
    @Before
    @Override
    public void setUp() throws Exception {
      driver = getDriverByName(TestSuiteCQA.getTargetBrowser());
      baseUrl = TestSuiteCQA.getBaseUrl();
    }
    
    @After
    @Override
    public void tearDown() throws Exception {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
    }



    protected WebDriver getDriverByName(String drivername)  {
        WebDriver drv = null;
        switch (drivername){
            case "ff":
                drv= new FirefoxDriver();
                break;
            case "ie":
                drv= new InternetExplorerDriver();
                break;
            case "sf":
                drv = new SafariDriver();
                break;
            case "ch":
                drv = new ChromeDriver();
                break;
            default:
                //TODO: gestire errore driver non trovato
                break;
        }
        //TODO: congirare driver
        return drv;
    }
    
    protected boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

    protected boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

    protected String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
    
}
