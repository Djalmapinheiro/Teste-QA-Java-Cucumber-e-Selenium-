package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	private By versao = By.xpath("//select[@id='switch-version-select']");
	private By name = By.xpath("//input[@id='field-customerName']");
	private By lastName = By.xpath("//input[@id='field-contactLastName'] ");
	private By btnAdd = By.xpath("//a[@href='/v1.x/demo/bootstrap_theme_v4/add']");

	private By contactFirstName = By.xpath("//*[@id='field-contactFirstName']");
	private By Phone = By.xpath("//*[@id='field-phone']");
	private By addressLine1 = By.xpath("//*[@id='field-addressLine1']");
	private By addressLine2 = By.xpath("//*[@id='field-addressLine2']");
	private By city = By.xpath("//*[@id='field-city']");
	private By state = By.xpath("//*[@id='field-state']");
	private By postalCode = By.xpath("//*[@id='field-postalCode']");
	private By country = By.xpath("//*[@id='field-country']");
	private By fromEmployeer = By.xpath("//select[@id='field-salesRepEmployeeNumber']");
	private By creditLimit = By.xpath("//*[@id='field-creditLimit']");
	private By deleted = By.xpath("//*[@id='field-deleted']");

	private By btnSave = By.xpath("//*[@id='form-button-save']");
	private By btnSaveAndGo = By.xpath("//*[@id='save-and-go-back-button']");
	private By btnCancel = By.xpath("//*[@id='cancel-button']");
	private By msgSucesso = By.xpath("//div[@id='report-success']");
	//span[text()='Select from Employeer']
	public By getVersao() {
		return versao;
	}

	public By getName() {
		return name;
	}

	public By getLastName() {
		return lastName;
	}

	public By getBtnAdd() {
		return btnAdd;
	}

	public By getContactFirstName() {
		return contactFirstName;
	}

	public By getPhone() {
		return Phone;
	}

	public By getAddressLine1() {
		return addressLine1;
	}

	public By getAddressLine2() {
		return addressLine2;
	}

	public By getCity() {
		return city;
	}

	public By getState() {
		return state;
	}

	public By getPostalCode() {
		return postalCode;
	}

	public By getCountry() {
		return country;
	}

	public By getFromEmployeer() {
		return fromEmployeer;
	}

	public By getCreditLimit() {
		return creditLimit;
	}

	public By getDeleted() {
		return deleted;
	}

	public By getBtnSave() {
		return btnSave;
	}

	public By getBtnSaveAndGo() {
		return btnSaveAndGo;
	}

	public By getBtnCancel() {
		return btnCancel;
	}

	public By getMsgSucesso() {
		return msgSucesso;
	}

}
