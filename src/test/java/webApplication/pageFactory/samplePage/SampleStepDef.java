package webApplication.pageFactory.samplePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleStepDef {
    private SamplePagePA samplePagePA = new SamplePagePA();
    private boolean result = false;
    //region Given
    @Given("^sample feature file is ready$")
    public void givenStatment() {
        System.out.println("Given statement executed successfully");
    }

    @Given("^Navigate to URL \"(.*)\"$")
    public void navigateToURL(String url) {
        samplePagePA.navigateToURL(url);
    }
    //endregion

    //region When
    @When("^I run the feature file$")
    public void whenStatement() {
        System.out.println("When statement execueted successfully");
    }
    //endregion

    //region Then
    @Then("^run should be successful$")
    public void thenStatment() {
        System.out.println("Then statement executed successfully");
    }

    @Then("^Verify Popup title$")
    public void verifyPopupTitle() {
        result = samplePagePA.verifyPopupTitle();
        System.out.printf(String.valueOf(result));
    }
    //endregion
}
