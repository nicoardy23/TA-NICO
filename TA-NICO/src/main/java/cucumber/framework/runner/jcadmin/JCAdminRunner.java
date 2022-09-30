package cucumber.framework.runner.jcadmin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/jcadmin/005About001AddTrainer.feature",
		"src/main/resources/jcadmin/005About003EditTrainer.feature",
		"src/main/resources/jcadmin/005About002FindAndMoveTrainer.feature"},
glue = "cucumber.framework.runner.jcadmin",	
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html",
		"json:target/jcadmin/jsonreport/LoginRunner.json",
		"junit:target/jcadmin/junitreport/LoginRunner.xml"})
public class JCAdminRunner extends AbstractTestNGCucumberTests{

}
