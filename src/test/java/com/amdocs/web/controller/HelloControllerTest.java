package com.amdocs.web.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.amdocs.Calculator;
import com.amdocs.Increment;
import com.amdocs.config.SpringWebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringWebConfig.class})
@WebAppConfiguration
public class HelloControllerTest {
 
    private MockMvc mockMvc;
    
    @Autowired
    private WebApplicationContext webApplicationContext;
    
    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }
 
    @Test
    public void runHello() throws Exception {

        mockMvc.perform(get("/"))
                .andExpect(status().isOk()) ;
    }
    
    @Test
    public void runHelloName() throws Exception {

        mockMvc.perform(get("/hello/Prashant+Beniwal"))
                .andExpect(status().isOk()) ;
    }

    public void runNegativeScen() throws Exception {

        mockMvc.perform(get("/try/Prashant+Beniwal"))
                .andExpect(status().isOk()) ;
                //.andExpect(status().isNotFound()) ;
    }

    @Test
    public void runMyCalc() throws Exception {
    	Calculator myCalc = new Calculator();

        //assertEquals("Result", 8, myCalc.add());
        assertEquals("Result", 9, myCalc.add());
        assertEquals("Result", 3, myCalc.sub());
    }
 
    
    @Test
    public void runDecCounter0() throws Exception {
    	
        int ret = (new Increment()).decreasecounter(0);
        assertEquals("Message",1,ret);
    }


    @Test
    public void runDecCounter1() throws Exception {
    	
        int ret = (new Increment()).decreasecounter(1);
        assertEquals("Message", 0, ret);
    }

    public void runDecCounter2() throws Exception {
    	
        int ret = (new Increment()).decreasecounter(2);
        assertEquals("Message", 1, ret);
         
    }
}
