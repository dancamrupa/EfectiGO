package plataforma.efectigo.runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import plataforma.efectigo.utils.BeforeSuite;
import plataforma.efectigo.utils.DataToFeature;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "@solicitarCredito",
        glue = "plataforma.efectigo.stepdefinitions",
        snippets =  CucumberOptions.SnippetType.CAMELCASE)

public class solicitarCreditoRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features");
    }
}
