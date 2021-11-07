package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RailwayBookingDetailsPOM {
	
	@FindBy(xpath= "/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")
	public static WebElement alertbox;
	
	@FindBy(xpath= "//*[@id=\'origin\']/span/input")
	public static WebElement fromBox;
	
	@FindBy(xpath= "//*[@id=\'destination\']/span/input")
	public static WebElement toBox;
	
	@FindBy(xpath= "//*[@id=\'journeyQuota\']/div")
	public static WebElement general;
	
	@FindBy(xpath= "//*[@id=\'journeyQuota\']/div/div[4]/div/ul/p-dropdownitem[1]/li")
	public static WebElement generlToGive;
	
	@FindBy(xpath= "//*[@id=\'jDate\']/span/input")
	public static WebElement date;
	
	@FindBy(xpath= "//*[@id=\'jDate\']/span/div/div/div[1]/a[2]")
	public static WebElement dateToGo;
	
	@FindBy(xpath= "//*[@id=\'jDate\']/span/div/div/div[2]/table/tbody/tr[2]/td[6]/a")
	public static WebElement dateToGive;
	
	@FindBy(xpath= "//*[@id=\'journeyClass\']/div")
	public static WebElement classBox;
	
	@FindBy(xpath= "//*[@id=\'journeyClass\']/div/div[4]/div/ul/p-dropdownitem[10]/li")
	public static WebElement classToGive;
	
	@FindBy(xpath= "//*[@id=\'divMain\']/div/app-main-page/div/div/div[1]/div[1]/div[1]/app-jp-input/div/form/div[5]/div/button")
	public static WebElement searchBox;

	

}
