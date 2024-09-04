package TEST_RUNNER;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		
		features=".//FEATURE/",
		glue="STEPS",
		dryRun=false,
		monochrome=false,
		plugin= {"pretty",
				"html:target/cucumber-reports.html"
		}
		
	
	)
public class TEST_RUNNER {
	

	

}
