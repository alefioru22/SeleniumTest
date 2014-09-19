/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.pegaso2000.seleniumtester.cqatest.prova;


import it.pegaso2000.seleniumtester.cqatest.BaseTest;
import it.pegaso2000.seleniumtester.cqatest.TestSuiteAlessandro;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Test1  extends BaseTest{


  
//  @Test
//  public void testProvagoogle() throws Exception {
//    driver.get(baseUrl);
//    driver.findElement(By.id("gbqfq")).clear();
//    driver.findElement(By.id("gbqfq")).sendKeys("itis");
//    driver.findElement(By.id("gbqfb")).click();
//  }
//  @Test
//  public void testCheckboxex() throws Exception {
//    driver.get("http://handsontable.com/demo/checkbox.html");
//    driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
//    driver.findElement(By.xpath("//div/div[2]/div")).click();
//    driver.findElement(By.xpath("//div[@id='example1']/div[2]/textarea")).clear();
//    driver.findElement(By.xpath("//div[@id='example1']/div[2]/textarea")).sendKeys("Merhuujiuki");
//  }
//    @Test
//  public void testOrdinamentoClick() throws Exception {
//    driver.get("http://handsontable.com/demo/date.html");
//    driver.findElement(By.xpath("//div[@id='example1']/div/div[2]/div/div/div/table/thead/tr/th[3]/div/span")).click();
//    driver.findElement(By.xpath("//div[@id='example1']/div/div[2]/div/div/div/table/thead/tr/th[4]/div/span")).click();
//    driver.findElement(By.xpath("//div[@id='example1']/div/div[2]/div/div/div/table/thead/tr/th[2]/div/span")).click();
//    driver.findElement(By.xpath("//div[@id='example1']/div/div[2]/div/div/div/table/thead/tr/th/div/span")).click();
//  }
//   @Test
//  public void testTriangolino() throws Exception {
//    driver.get("http://handsontable.com/demo/date.html");
//    driver.findElement(By.cssSelector("div.htAutocompleteArrow")).click();
//  }
//  @Test
//  public void testLogin() throws Exception {
//    doLogin(TestSuiteAlessandro.getUsername(),TestSuiteAlessandro.getPassword());
//  }
//  
//  @Test
//  public void testApriElaborazioni() throws Exception {
//    doLogin(TestSuiteAlessandro.getUsername(),TestSuiteAlessandro.getPassword());
//   
//    driver.findElement(By.xpath("(//a[contains(text(),'Elaborazioni')])[1]")).click();
//    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//    assertTrue(isElementPresent(By.id("grid_filter")));
//  }
    ///vvvvvvv
  @Test
  public void testTab1() throws Exception {
    
    doLogin(TestSuiteAlessandro.getUsername(),TestSuiteAlessandro.getPassword());
    driver.findElement(By.linkText("Elaborazioni")).click();
    
    By byObj =By.xpath("//*[@id='grid_filter']/div[2]/div[2]/div/div/table/tbody/tr[4]/td[3]");
    WebElement elem=driver.findElement(byObj);
    elem.click();
    
    driver.findElement(By.name("periodoElaborazione")).clear();
    driver.findElement(By.name("periodoElaborazione")).sendKeys("2014-01");
    new Select(driver.findElement(By.name("statoElaborazione"))).selectByVisibleText("chiusa");
  }
  
  @Test
  public void testTab2() throws Exception {
      doLogin(TestSuiteAlessandro.getUsername(),TestSuiteAlessandro.getPassword());
    driver.findElement(By.linkText("Elaborazioni")).click();
    driver.findElement(By.xpath("//div[@id='grid_filter']/div[3]/div/button[2]")).click();
    driver.findElement(By.xpath("//div[@id='grid_filter']/div/div[2]/span")).click();
    driver.findElement(By.xpath("//div[@id='grid_filter']/div/div[2]/span")).click();
    driver.findElement(By.cssSelector("div.top-btn.pq-sb-btn")).click();
    driver.findElement(By.cssSelector("div.bottom-btn.pq-sb-btn")).click();
    driver.findElement(By.xpath("//div[@id='grid_filter']/div[2]/div/span/table/tbody/tr[2]/td[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='grid_filter']/div[2]/div/span/table/tbody/tr[2]/td[2]/div")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[23]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[25]")).click();
    
    WebElement dropDownListBox = driver.findElement(By.xpath(".//*[@id='grid_filter']/div[3]/div/span[5]/select"));
    dropDownListBox.click();
    Select s = new Select(dropDownListBox);
    s.selectByVisibleText("10");
//DropDownListBox clickThis = new DropD(dropDownListBox);
//clickThis.SelectByText("Germany");
  }
  

 
    @Before
    @Override
    public void setUp() throws Exception {
    driver = getDriverByName(TestSuiteAlessandro.getTargetBrowser());
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    baseUrl = TestSuiteAlessandro.getBaseUrl();
      
      
      //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


}

 
 



