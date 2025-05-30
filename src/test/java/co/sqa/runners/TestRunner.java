package co.sqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/test.feature",
        glue = "co.sqa.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@RUN"
)
public class TestRunner {
}
