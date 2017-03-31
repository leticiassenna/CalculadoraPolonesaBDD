package br.ifes.leticia.CalculadoraPolonesaBDD;

import static org.junit.Assert.assertEquals;

import br.ifes.leticia.CalculadoraPolonesaBDD.model.Calculadora;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculadoraPolonesaSteps {
	
	Calculadora calculadora;
	Double valor;
	
	@Given("^Eu quero realizar um calculo na notacao polonesa inversa$")
	public void eu_quero_realizar_um_calculo_na_notacao_polonesa_inversa() throws Throwable {
		this.calculadora = new Calculadora();
	}

	@When("^Eu insiro a entrada \"([^\"]*)\"$")
	public void eu_insiro_a_entrada(String arg1) throws Throwable {
	    this.valor = calculadora.evaluate(arg1);
	}

	@Then("^Eu tenho a saida \"([^\"]*)\"$")
	public void eu_tenho_a_saida(String arg1) throws Throwable {
		assertEquals(arg1, Double.toString(this.valor));
	}

}
