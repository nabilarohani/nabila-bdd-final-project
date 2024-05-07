package TEK.BDD.FINALPROJECT.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "TEK.BDD.FINALPROJECT.STEPS",
        tags = "@Regression",
        dryRun = false,
        plugin = {
                "pretty",
                "html:target/report/report.html",
                "json:target/jsonReports/jsonReport.json"
        }
        )
public class TestRunner {
}