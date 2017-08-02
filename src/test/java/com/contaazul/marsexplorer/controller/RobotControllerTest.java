package com.contaazul.marsexplorer.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.contaazul.marsexplorer.ExplorerApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExplorerApplication.class)
@WebAppConfiguration
public class RobotControllerTest {
	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Before
	public void setupMockMvc() throws Exception {
		mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void moveRobotToX2Y0S() throws Exception {
		mockMvc.perform(post("/rest/mars/MMRMMRMM"))
			.andExpect(status().isOk())
			.andExpect(content().string("(2, 0, S)"));
	}
	
	@Test
	public void moveRobotToX0Y2W() throws Exception {
		mockMvc.perform(post("/rest/mars/MML"))
			.andExpect(status().isOk())
			.andExpect(content().string("(0, 2, W)"));
	}

	@Test
	public void invalidCommand() throws Exception {
		mockMvc.perform(post("/rest/mars/AAA"))
			.andExpect(status().isBadRequest())
			.andExpect(content().string("400 Bad Request"));
	}
	
	@Test
	public void robotOutOfBounds() throws Exception {
		mockMvc.perform(post("/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM"))
			.andExpect(status().isBadRequest())
			.andExpect(content().string("400 Bad Request"));
	}
}
