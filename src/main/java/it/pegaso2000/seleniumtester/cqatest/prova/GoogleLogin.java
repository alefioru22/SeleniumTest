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


import it.pegaso2000.seleniumtester.cqatest.BaseTest;
import it.pegaso2000.seleniumtester.cqatest.TestSuiteAlessandro;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;

public class GoogleLogin  extends BaseTest{


  
  @Test
  public void testGoogleLogin() throws Exception {
    driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&hl=it&emr=1&elo=1");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    
    if(isElementPresent(By.id("Email"))){
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("nessunnome222@gmail.com");
    }

    driver.findElement(By.id("Passwd")).clear();
    driver.findElement(By.id("Passwd")).sendKeys("P21fjoe5gw");
    driver.findElement(By.id("signIn")).click();
    
//    driver.findElement(By.xpath("//div[@id=':4r']/div/div")).click();
//    driver.findElement(By.id(":a3")).clear();
//    driver.findElement(By.id(":a3")).sendKeys("nessunnome222@gmail.com");
//    driver.findElement(By.id(":9o")).clear();
//    driver.findElement(By.id(":9o")).sendKeys("e-mail di prova");
//    driver.findElement(By.id(":9e")).click();
//    driver.findElement(By.id("link_vsm")).click();

  }
  
 @Test
 public void testSendMail(){
     
     //provo ad aprire la webmail gmail 
     //aspetto 10 secondi 
     //se vengo mandato al login allora faccio il login
     
     //preparo la mail
     
     //invio la mail
     
     
 }
  
    @Before
    @Override
    public void setUp() throws Exception {
    driver = getDriverByName(TestSuiteAlessandro.getTargetBrowser());
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    baseUrl = "http://www.avolta.pg.it/";
      
      
      //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


}
