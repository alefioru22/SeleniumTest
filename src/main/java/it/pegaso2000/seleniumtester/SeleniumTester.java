/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.pegaso2000.seleniumtester;


/**
 *
 * @author ebuchicchio
 */
public class SeleniumTester {
      public static void main(String[] args) { 
      //TODO: gestire parametri a riga di comando
          //args[0] = ff | ie |ch
      String browserName ="";
          
       if(args==null || args.length <1 || args[0]==null || args[0].isEmpty()){
          browserName="ch";
        } else{
           browserName=args[0];
       }
      
      String url = "http://192.168.2.208:8088/anagscqa-0.3/";
      String defaultUserName = "user";
      String defaultPassword="pegaso";
    junit.textui.TestRunner.run(it.pegaso2000.seleniumtester.cqatest.TestSuiteAlessandro.seleniumTestSuite(browserName,url,defaultUserName,defaultPassword));
  }
    
}
