package cucumber12;



import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumbertest {

	/*@Given("^user should should not be logged in$")
	public void user_should_should_not_be_logged_in() throws Throwable {
	   System.out.println("user should create new id");
	}

	@When("^user enters all credentials$")
	public void user_enters_all_credentials() throws Throwable {
		 System.out.println("enter the credentials");
	}

	@Then("^Registered successfully$")
	public void registered_successfully() throws Throwable {
		 System.out.println("registration successful");
	}

	@Given("^user should be logged in$")
	public void user_should_be_logged_in() throws Throwable {
		 System.out.println("user should have an account");
	}

	@When("^user should search for the product$")
	public void user_should_search_for_the_product() throws Throwable {
		 System.out.println("search the product");
	}

	@Then("^Display the product$")
	public void display_the_product() throws Throwable {
		 System.out.println("product display");
	}
	@Given("^user must be registered$")
	public void user_must_be_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enters credentials and performs login$")
	public void user_enters_credentials_and_performs_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^user must be in the home page$")
	public void user_must_be_in_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Given("^Browser installed$")
	public void browser_installed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user enters AUT URL in browser$")
	public void user_enters_AUT_URL_in_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("^app must open$")
	public void app_must_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}
	
	@Given("^user must be registered$")
	public void user_must_be_registered() throws Throwable {
	    
	}

	@When("^login using lalitha and Password(\\d+)$")
	public void login_using_lalitha_and_Password(int arg1) throws Throwable {
	    
	}

	@Then("^user must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
	   
	}

	@When("^login using xyz(\\d+) and xyz(\\d+)$")
	public void login_using_xyz_and_xyz(int arg1, int arg2) throws Throwable {
	   System.out.println(arg1 +arg2);
	}*/
	@Given("^user must be registered$")
	public void user_must_be_registered() throws Throwable {
	   
	}

	@When("^login using <username> and <password>$")
	public void login_using_username_and_password(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@Then("^user must be in home page$")
	public void user_must_be_in_home_page() throws Throwable {
	   
	}



}
