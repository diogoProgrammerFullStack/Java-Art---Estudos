package actions;

import commons.BaseTest;
import commons.SeleniumRobot;
import commons.Url;
import page.ContatoPage;
import page.HomePageArt;

public class FormActions extends BaseTest{
	
	private ContatoPage contatoPage;
	private HomePageArt homePageArt;

	public FormActions() {
		this.contatoPage = new ContatoPage(webDriver);
		this.homePageArt = new HomePageArt(webDriver);
	}

	public void navegarAteHome() {
		webDriver.get(Url.ARTIT);
		//webDriver.manage().window().maximize();
	}
	
	public void clickContato() {
		this.homePageArt.getContato().click();
	}

	public void preenchimentoForm(String nome, String email, String tel) {
		SeleniumRobot.scroll(100);
		SeleniumRobot.waitElementAppear(this.contatoPage.getCampoNome());
		this.contatoPage.getCampoNome().sendKeys(nome);
		this.contatoPage.getCampoEnderecoEmail().sendKeys(email);
		this.contatoPage.getCampoTelefone().sendKeys(tel);
		SeleniumRobot.takeSnapShot();
	}
}
