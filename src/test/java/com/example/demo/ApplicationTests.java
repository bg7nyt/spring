package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Test
	public void contextLoads() {
		Assert.assertEquals(15,5);
	}
	@Test
	public void success() {
		Assert.assertEquals(10,10);
	}
	@Test
	public void failures() {
		Assert.assertEquals(10,8);
		Assert.assertEquals(10,90);
	}
	@Test
	public void skipped() {
		Assert.assertEquals(10,100);
	}
}

