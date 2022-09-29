package cucumber.framework.runner.jcadmin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/jcadmin/01MenambahAbout.feature",
		"src/main/resources/jcadmin/01MenambahAbout.feature"},
glue = "cucumber.framework.runner.jcadmin",	
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html",
		"json:target/jcadmin/jsonreport/LoginRunner.json",
		"junit:target/jcadmin/junitreport/LoginRunner.xml"})
public class JCAdminRunner extends AbstractTestNGCucumberTests{

	
}
