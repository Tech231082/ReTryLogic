package main;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyzer implements IRetryAnalyzer {
	
	int counter=0;
	int retryCount=2;
	
	public boolean retry(ITestResult res) {
		if(counter<retryCount) {
			counter++;
			return true;
			
		}
		return false;
	}

}
