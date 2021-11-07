package testCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import commonActions.CommonFunctions;
import pageObjectModel.RailwayBookingDetailsPOM;




public class RailwayBookingDetails extends CommonFunctions{
	
	Logger logger = Logger.getLogger(RailwayBookingDetails.class);
	
	
	@Test
    public void bookingDeatilsTC() {
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Started To Enter Values in TravelBookingBoxes");
		
		PageFactory.initElements(driver,RailwayBookingDetailsPOM.class );
		RailwayBookingDetailsPOM.alertbox.click();
		RailwayBookingDetailsPOM.fromBox.sendKeys(properties.getProperty("fromBox"));
		RailwayBookingDetailsPOM.toBox.sendKeys(properties.getProperty("toBox"));
		RailwayBookingDetailsPOM.general.click();
		RailwayBookingDetailsPOM.generlToGive.click();
		RailwayBookingDetailsPOM.date.click();
		RailwayBookingDetailsPOM.dateToGo.click();
		RailwayBookingDetailsPOM.dateToGive.click();
		RailwayBookingDetailsPOM.classBox.click();
		RailwayBookingDetailsPOM.classToGive.click();
		RailwayBookingDetailsPOM.searchBox.click();
		
		
    }

}
