package cucumber.framework.runner.jcadmin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/jcadmin/005About001AddTrainer.feature",
		"src/main/resources/jcadmin/005About002AddTrainerNegative.feature",
		"src/main/resources/jcadmin/005About003FindAndMoveTrainer.feature",
		"src/main/resources/jcadmin/005About004FindAndMoveNegative.feature",
		"src/main/resources/jcadmin/005About005EditTrainer.feature",
		"src/main/resources/jcadmin/005About006EditTrainerNegative.feature",
		"src/main/resources/jcadmin/005About007EditInputTrainerNegative.feature",
		"src/main/resources/jcadmin/006Blog005FindAndEditBlogNegative.feature",
		"src/main/resources/jcadmin/007ContactMessages001GetMessages.feature",
		"src/main/resources/jcadmin/007ContactMessages002SearchMessages.feature",
		"src/main/resources/jcadmin/007ContactMessages003MovePage.feature",
		"src/main/resources/jcadmin/007ContactMessages004CariNegative.feature",
		"src/main/resources/jcadmin/005About08FindAndEdit.feature"},
glue = "cucumber.framework.runner.jcadmin",	
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html"})
public class JCAdminRunner extends AbstractTestNGCucumberTests{

}