package plataforma.efectigo.runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import plataforma.efectigo.utils.BeforeSuite;
import plataforma.efectigo.utils.DataToFeature;

import java.io.IOException;
@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "@cancelarCredito",
        glue = "plataforma.efectigo.stepdefinitions",
        snippets =  CucumberOptions.SnippetType.CAMELCASE)

public class cancelarCreditoRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features");
    }
}
