package cucumber12;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Cucumber\\cucumber12\\cucuu\\cucumbersel.feature",
plugin= {"html:target\\Reports"})
public class runner {

 
}
