package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.agent.PowerMockAgent;
//import org.powermock.modules.junit4.PowerMockRunner;
//import org.powermock.modules.junit4.rule.PowerMockRule;

@RunWith(PowerMockRunner.class)
@PrepareForTest({UserService.class})
public class UserServiceTest {

//	@Rule
//	public PowerMockRule rule = new PowerMockRule();
//
//	static {
//		PowerMockAgent.initializeIfNeeded();
//	}
//	
	@InjectMocks
	private UserService service;
	
	private UserService spy;
	
	@Before
	public void setup()
	{
		spy = PowerMockito.spy(service);
	}
	
	@Test
	public void getUserTest() throws Exception
	{
		User u  = new User();
		u.setName("Pratik");
		PowerMockito.doReturn(u).when(spy, "getPrivateMethod");
		
		User actual = spy.getUser();
		assertNotNull(actual);
		assertEquals(actual.getName(), "Pratik");
	}

}
