/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.pegaso2000.seleniumtester.cqatest;


import it.pegaso2000.seleniumtester.cqatest.login.*;
import it.pegaso2000.seleniumtester.cqatest.anagrafica.*;
import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteCQA {
    private static String targetBrowser;
    private static String baseUrl;
    private static String username;
    private static String password;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        TestSuiteCQA.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        TestSuiteCQA.password = password;
    }

    public static String getBaseUrl() {
        return baseUrl;
    }

    public static void setBaseUrl(String baseUrl) {
        TestSuiteCQA.baseUrl = baseUrl;
    }

    public static String getTargetBrowser() {
        return targetBrowser;
    }

    public static void setTargetBrowser(String targetBrowser) {
        TestSuiteCQA.targetBrowser = targetBrowser;
    }

  public static Test suiteCQA(String browserName,String baseUrl
          , String defaultUsername, String defaultPassword) {
    TestSuiteCQA.setTargetBrowser(browserName);
    TestSuiteCQA.setBaseUrl(baseUrl);
    TestSuiteCQA.setUsername(defaultUsername);
    TestSuiteCQA.setPassword(defaultPassword);
    
    TestSuite suite = new TestSuite(); 
    suite.addTestSuite(LoginTest.class);
    suite.addTestSuite(LoginBadCredentialTest.class);
    suite.addTestSuite(ApriAngraficaTest.class);
    
    return suite;
  }
}
