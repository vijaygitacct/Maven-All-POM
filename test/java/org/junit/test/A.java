package org.junit.test;

import org.junit.Test;

import junit.framework.Assert;

public class A {
	
	@Test
public void test() {
		System.out.println("Start..........");
		Assert.assertTrue("verifyUser", true);
		Assert.assertTrue("verifypassword", true);
		Assert.assertTrue("verifyUser", true);
		
		System.out.println("end...");
		

}
	
	@Test
	public void test2() {
		
		System.out.println("test2");

	}
}
