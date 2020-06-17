package com.example.restservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@SpringBootTest
@AutoConfigureMockMvc
public class RestServiceApplicationTests {
	@Autowired
private MockMvc mvc;

	    @Autowired
private CountryController countryController;
	
	@Test
	public void contextLoads() {
	  assertNotNull(countryController);
	}
@Test
public void testGetCountry() throws Exception {
   ResultActions actions = mvc.perform(get("/country"));
   actions.andExpect(status().isOk());
   actions.andExpect(jsonPath("$.code").exists());
   actions.andExpect(jsonPath("$.code").value("IN"));
   
   }

//@Test
//public void testGetCountryException()  throws Exception
//{
//	ResultActions actions = mvc.perform(get("/countries/code1"));
//	
//    actions.andExpect(status().isBadRequest());
//	actions.andExpect(status().reason("Country not Found Exception Occured"));
//}
   
}
