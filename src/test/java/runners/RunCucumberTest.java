package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = {"stepdefs", "src/test/java/runners", "utils"},
		plugin = { "pretty", "json:target/Cucumber.json" , "html:target/cucumber-html-report"},
		
		////https://github.com/damianszczepanik/cucumber-reporting
		////json path has to match with path mention in the maven plugin
		
		/*
				[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.19:test (default-test) on project Mercurytours: 
				There are test failures.
				if any failures in test it will not generate results in target folder... to mitigate this we need to add following thing pom
				<configuration>
            		<testFailureIgnore>true</testFailureIgnore>
            	</configuration>
            	
            	commands to run
            	mvn clean
            	mvn verify  //verify is name we have given in pom
            	
            	<id>execution</id>
				    	<phase>verify</phase>
		
		*/
		//tags = {"@sanity1"},
		//dryRun = true,
		monochrome = true )

public class RunCucumberTest {
	

}