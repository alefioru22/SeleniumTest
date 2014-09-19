/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.pegaso2000.seleniumtester.cqatest;


import it.pegaso2000.seleniumtester.cqatest.prova.GoogleLogin;
import it.pegaso2000.seleniumtester.cqatest.prova.Test1;
import it.pegaso2000.seleniumtester.cqatest.prova.Test2;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteAlessandro {
    private static String targetBrowser;
    private static String baseUrl;
    private static String username;
    private static String password;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        TestSuiteAlessandro.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        TestSuiteAlessandro.password = password;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static void setBaseUrl(String baseUrl) {
        TestSuiteAlessandro.baseUrl = baseUrl;
    }

    public static String getTargetBrowser() {
        return targetBrowser;
    }

    public static void setTargetBrowser(String targetBrowser) {
        TestSuiteAlessandro.targetBrowser = targetBrowser;
    }

  public static Test seleniumTestSuite(String browserName,String baseUrl
          , String defaultUsername, String defaultPassword) {
    TestSuiteAlessandro.setTargetBrowser(browserName);
    TestSuiteAlessandro.setBaseUrl(baseUrl);
    TestSuiteAlessandro.setUsername(defaultUsername);
    TestSuiteAlessandro.setPassword(defaultPassword);
    
    TestSuite suite = new TestSuite(); 
//    suite.addTestSuite(LoginTest.class);
//    suite.addTestSuite(LoginBadCredentialTest.class);
//    suite.addTestSuite(ApriAngraficaTest.class);
    //suite.addTestSuite(Test1.class);
    suite.addTestSuite(Test1.class);
    
    return suite;
  }
}
