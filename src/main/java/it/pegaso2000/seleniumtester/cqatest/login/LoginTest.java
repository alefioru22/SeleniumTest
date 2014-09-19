package it.pegaso2000.seleniumtester.cqatest.login;

import it.pegaso2000.seleniumtester.cqatest.BaseTest;
import java.util.concurrent.TimeUnit;
import static junit.framework.TestCase.fail;
import org.junit.*;

public class LoginTest extends BaseTest{

  @Test
  public void testLogin() throws Exception {

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    //TODO: verificare cambio pagina
  }


}