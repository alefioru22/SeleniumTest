/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.pegaso2000.seleniumtester.cqatest.prova;

import it.pegaso2000.seleniumtester.cqatest.BaseTest;
import it.pegaso2000.seleniumtester.cqatest.TestSuiteAlessandro;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 *
 * @author afiorucci
 */
public class TestItis1 extends BaseTest{
    
  @Test
  public void apriItis() throws Exception {
    driver.get(baseUrl);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.linkText("entra")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.linkText("Giornale di Istituto")).click();
  }
  
    @Before
    @Override
    public void setUp() throws Exception {
    driver = getDriverByName(TestSuiteAlessandro.getTargetBrowser());
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    baseUrl = "http://www.avolta.pg.it";
      
      
      //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    
}
