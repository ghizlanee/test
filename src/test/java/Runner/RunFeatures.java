package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/hp/IdeaProjects/creditAuto/src/test/java/features/CreateContractForExistingClient.feature",//the path of the feature file
       glue= {"StepsDefinitions"},//the path of the step definition file
        format = {"pretty","html:test-outout"}//generate a report
        //monochrome = true, //display the console output is a proposer readable format
        //dryRun = false //check the mapping between features and steps
)

public class RunFeatures {


}
