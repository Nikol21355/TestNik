import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = "stepdefs.MyStepdefs",
        tags = "@withdrawal",
        snippets = SnippetType.CAMELCASE
)
class RunnerTest {
}


