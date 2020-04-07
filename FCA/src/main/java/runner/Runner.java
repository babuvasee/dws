package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
                                //features = "C:\\Work\\eclipse-workspace\\FCA\\src\\main\\java\\features\\login.feature",
								features = "features//LoginMain.feature",
                                glue= {"stepdefn"}
                                )

public class Runner {

}
