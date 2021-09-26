import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/Runner.html", "rerun:target/failed-scenarios/Runner.txt"},
        features = "src/main/resources/features/SaDemo.feature",
        glue = {"steps"},
        stepNotifications = true
)

public class Runner {

}