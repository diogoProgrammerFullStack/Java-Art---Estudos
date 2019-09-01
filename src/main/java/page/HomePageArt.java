package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageArt {

	@FindBy(xpath="//a[text()='Contato']")
	private WebElement contato;

	public WebElement getContato() {
		return contato;
	}

	public void setContato(WebElement contato) {
		this.contato = contato;
	}

	public HomePageArt(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
}
