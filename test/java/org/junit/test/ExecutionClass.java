package org.junit.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({t1.class,t2.class,t3.class})
public class ExecutionClass {

	public static void main(String[] args) {
		
		Result runClasses = JUnitCore.runClasses(ExecutionClass.class);
		int runCount = runClasses.getRunCount();
		System.out.println("Total Run Count : "+runCount);
		
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println(ignoreCount);
		
		int failureCount = runClasses.getFailureCount();
		System.out.println("fail"+failureCount);
		
		List<Failure> failures = runClasses.getFailures();
		for (Failure failure : failures) {
			System.out.println("failure"+failure);
			
			int ignoreCount2 = runClasses.getIgnoreCount();
			
			System.out.println("ignore count:"+ignoreCount2);
		}
	}
}
