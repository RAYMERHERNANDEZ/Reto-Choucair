package co.com.choucair.reto.pruebaraymer.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/retoChoucair.feature",
        tags = "",
        glue = "co.com.choucair.reto.pruebaraymer.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
