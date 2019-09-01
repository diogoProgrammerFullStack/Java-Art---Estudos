package br.com.art.steps;

import actions.FormActions;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class Steps {
	
	private FormActions form;
	public Steps() {
		this.form = new FormActions();
	}
	@Dado("^que estou na home do artit$")
	public void que_estou_na_home_do_artit() throws Throwable {
		this.form.navegarAteHome();
	}

	@Quando("^preencho os campos nome endereco de email e telefone$")
	public void preencho_os_campos_nome_endereco_de_email_e_telefone() throws Throwable {
		this.form.clickContato();
		this.form.preenchimentoForm("Diogo", "teste@teste.com.br", "123456789");
		
	}
}
