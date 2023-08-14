import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class FeedbackStepDefinitions {

    @Given("the user navigates to JavaTpoint.com")
    public void navigateToJavaTpoint() {
        // code to navigate to JavaTpoint.com
    }

    @When("the user clicks on Feedback")
    public void clickFeedback() {
        // code to click on the Feedback button
    }

    @And("the Feedback page opens")
    public void feedbackPageOpens() {
        // code to verify that the Feedback page has opened
    }

    @And("the user submits feedback message")
    public void submitFeedback() {
        // code to fill out and submit the feedback form
    }

    @Then("feedback should be received on the admin page")
    public void verifyFeedbackReceived() {
        // code to verify that the feedback has been received on the admin page
    }

    @And("admin can reply to the user")
    public void adminCanReply() {
        // code to verify that the admin can reply to the user's feedback
    }
}