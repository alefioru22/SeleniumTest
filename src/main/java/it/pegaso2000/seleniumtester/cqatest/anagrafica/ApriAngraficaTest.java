package it.pegaso2000.seleniumtester.cqatest.anagrafica;

import it.pegaso2000.seleniumtester.cqatest.BaseTest;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;

public class ApriAngraficaTest  extends BaseTest{

  @Test
  public void testLogin() throws Exception {
    driver.get(baseUrl+"/protected");
    driver.findElement(By.linkText("Anagrafica")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.id("anagraficaMainContainer"));
  }

}
