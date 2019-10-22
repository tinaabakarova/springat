package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import pages.Home;

public class HomeSteps {

    @Autowired
    Home home;

    @Given("^I open pn\\.com\\.ua$")
    public void shouldOpenMainPage() throws Throwable {
        home.open();
    }

    @When("^I select category \"(.*?)\"$")
    public void shoulSelectCategory(String cat) throws Throwable {
        home.getCategoty(cat).click();
    }

}