import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {"@1"},format = {"pretty", "json:target/cucumber.json","html:target/cucumber.html"}, features = {"src/test/resources"})
public class CucumberRunner {

}