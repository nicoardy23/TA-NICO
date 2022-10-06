package cucumber.framework.runner.jcadmin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/jcadmin/005About001AddTrainer.feature",
		"src/main/resources/jcadmin/005About002AddTrainerNegative.feature",
		"src/main/resources/jcadmin/005About004FindAndMoveTrainer.feature",
		"src/main/resources/jcadmin/005About005FindAndMoveNegative.feature",
		"src/main/resources/jcadmin/005About007EditTrainer.feature",
		"src/main/resources/jcadmin/005About008EditTrainerNegative.feature",
		"src/main/resources/jcadmin/005About009EditInputTrainerNegative.feature",
		"src/main/resources/jcadmin/006Blog005FindAndEditBlogNegative.feature",
		"src/main/resources/jcadmin/007ContactMessages001GetMessages.feature",
		"src/main/resources/jcadmin/007ContactMessages002SearchMessages.feature",
		"src/main/resources/jcadmin/007ContactMessages004MovePage.feature",
		"src/main/resources/jcadmin/007ContactMessages007CariNegative.feature",
		"src/main/resources/jcadmin/005About010FindAndEdit.feature"},
glue = "cucumber.framework.runner.jcadmin",	
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html"})
public class JCAdminRunner extends AbstractTestNGCucumberTests{

}






















