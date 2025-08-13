package runnerIO;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "./src/test/java/features/LoginToVtigerApp.feature",

		              glue = "Step_Defination", dryRun = false)
public class RunnerClassForVtiger extends AbstractTestNGCucumberTests {

}
