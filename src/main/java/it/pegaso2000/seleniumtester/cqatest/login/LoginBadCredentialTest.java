package it.pegaso2000.seleniumtester.cqatest.login;

import it.pegaso2000.seleniumtester.cqatest.BaseTest;
import it.pegaso2000.seleniumtester.cqatest.TestSuiteCQA;
import java.util.concurrent.TimeUnit;
import org.junit.*;

public class LoginBadCredentialTest extends BaseTest{

    @Before
    @Override
    public void setUp() throws Exception {
      driver = getDriverByName(TestSuiteCQA.getTargetBrowser());
      baseUrl = TestSuiteCQA.getBaseUrl();
      doLogin("baduser","badpassword");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
  @Test
  public void testBadLogin() throws Exception {
      //TODO: verificare che ci sia il messaggio di errore
      fail("NOT IMPLEMENTED TEST");
  }

}
