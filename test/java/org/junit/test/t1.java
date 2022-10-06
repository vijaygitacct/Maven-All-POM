package org.junit.test;

import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class t1 {
	@Test
	public void Tc01() {
		System.out.println("method 1");
	}
	@Test
	public void Tc02() {
		System.out.println("method 2");
	}@Test
	public void Tc03() {
		System.out.println("method 3");
	}@Ignore
	public void Tc04() {
		System.out.println("method 4");
	}
}
