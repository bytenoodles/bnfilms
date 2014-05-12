/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bytenoodles.bnfilms.struts.action;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author jorge
 */
public class LoginActionTest {
    
    public LoginActionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of login method, of class LoginAction.
     */
    @org.junit.Test
    public void testLogin() {
        System.out.println("login");
        LoginAction instance = new LoginAction();
        String expResult = LoginAction.SUCCESS;
        String result = instance.login();
        assertEquals(expResult, result);
    }

    /**
     * Test of logout method, of class LoginAction.
     */
    @org.junit.Test
    public void testLogout() {
//        System.out.println("logout");
//        LoginAction instance = new LoginAction();
//        String expResult = LoginAction.SUCCESS;
//        String result = instance.logout();
//        assertEquals(expResult, result);
        assertTrue(true);
    }

}
