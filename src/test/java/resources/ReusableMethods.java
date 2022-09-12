package resources;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReusableMethods extends InitializeDriver {
    static String fileName;
    public static String sDefaultPath = System.getProperty("user.dir");

    //Element locator method
    public static String ReadElementsLocator(String key, String Path) throws IOException {
        FileInputStream file = new FileInputStream(Path);
        Properties property = new Properties();
        property.load(file);
        return property.get(key).toString();
    }

    // Method to verify text on page
    public static boolean ValidateTextOnPage(WebDriver driver, String expValue)
    {
        boolean result = false;
        if(driver.getPageSource().contains(expValue))
        {
            result=true;
        }
        return result;
    }

    //Method to hover over an element
    public static void MouseHover(WebDriver driver, WebElement HoverToMainMenu, WebElement ElementToClick) throws Exception
    {
        try
        {
            Actions action = new Actions(driver);
            action.moveToElement(HoverToMainMenu).click(ElementToClick).build().perform();
        }
        catch (Exception e)
        {
            throw new Exception("Error on this [MouseHover] method, please debug and see where the error might be");
        }
    }

    //Method to validate text on an element
    public static boolean ValidateTextPresentOnElement(WebDriver driver, String locatorType,String locatorValue,String expText) {
        boolean result = false;
        String actValue = "";
        try {
            if (locatorType.equalsIgnoreCase("xpath")) {
                actValue = driver.findElement(By.xpath(locatorValue)).getText();
            } else if (locatorType.equalsIgnoreCase("id")) {
                actValue = driver.findElement(By.id(locatorValue)).getText();
            } else if (locatorType.equalsIgnoreCase("name")) {
                actValue = driver.findElement(By.name(locatorValue)).getText();
            }
            if (actValue.equals(expText)) {
                result = true;
            }
        } catch (Exception e) {

        }
        return result;
    }

    //Method to read data inputs from excel sheet
    public static String datareading(String excelpath, int sheetName, int row, int column) throws IOException
    {
        XSSFWorkbook wb;
        XSSFSheet sheet1;

        File src = new File(excelpath);
        FileInputStream fis = new FileInputStream(src);
        wb = new XSSFWorkbook(fis);

        sheet1 = wb.getSheetAt(sheetName);
        String data = sheet1.getRow(row).getCell(column).getStringCellValue();
        return data;
    }

    //Function below is used to switch to pop up windows
    public static void switchWindows(){
        Set parentWindow = driver.getWindowHandles();
        for (String handles1 : driver.getWindowHandles()) {
            driver.switchTo().window(handles1);
        }
    }

    //Custom method to calculate Total price and verify it matches system total
    public static void calculateTotalPrice(double price,int quantity) throws IOException {
        double totalShipping = 2;
        String TotalPrice = "$"+((price * quantity) + totalShipping);
        System.out.println(TotalPrice);
        boolean result = ValidateTextOnPage(driver,TotalPrice);
        Assert.assertTrue("[ERROR - Prices do not match]",result);
    }

}
