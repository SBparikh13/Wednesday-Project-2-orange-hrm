package com.orangehrmlive.demo.testbase;



import com.orangehrmlive.demo.propertyreader.PropertyReader;
import com.orangehrmlive.demo.utilities.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeClass
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterClass
    public void tearDown() {
        closeBrowser();
    }

}
