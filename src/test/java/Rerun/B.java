package Rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;import com.beust.jcommander.MissingCommandException;

public class B implements IRetryAnalyzer {
	int minCount=0, maxCount=10;
	public boolean retry(ITestResult a                                                                                  ) {
		if(minCount< maxCount) {
			minCount++;
			return true;
		}
		return false;
	}

}
