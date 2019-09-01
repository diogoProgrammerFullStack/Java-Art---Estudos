package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContatoPage {
	
	@FindBy(xpath="//label[text()='Nome ']//following::input[1]")
	private WebElement campoNome;
	
	@FindBy(xpath="//label[text()='Endereço de Email ']//following::input[1]")
	private WebElement campoEnderecoEmail;
	
	@FindBy(xpath="//label[@id='fld_9033886Label']//following::input[1]")
	private WebElement campoTelefone;

	public WebElement getCampoNome() {
		return campoNome;
	}

	public void setCampoNome(WebElement campoNome) {
		this.campoNome = campoNome;
	}

	public WebElement getCampoEnderecoEmail() {
		return campoEnderecoEmail;
	}

	public void setCampoEnderecoEmail(WebElement campoEnderecoEmail) {
		this.campoEnderecoEmail = campoEnderecoEmail;
	}

	public WebElement getCampoTelefone() {
		return campoTelefone;
	}

	public void setCampoTelefone(WebElement campoTelefone) {
		this.campoTelefone = campoTelefone;
	}

	public ContatoPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
}
