package org.junit.test;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class t2 {
	@Test
	public void Tc01() {
		System.out.println("method 1");
	}
	@Test
	public void Tc02() {
		System.out.println("method 2");
	}@Ignore
	public void Tc03() {
		System.out.println("method 3");
	}@Test
	public void Tc04() {
		System.out.println("method 4");
		Assert.assertFalse(false);
	}
}
