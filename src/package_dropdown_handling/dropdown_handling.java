package package_dropdown_handling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown_handling 
       {

			  public static void main(String[] args) {
		        // Set path to Chrome driver
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\raman\\eclipse-workspace\\testerr\\HKAselenium_dropdown_handling\\source\\chromedriver.exe");

		        // Initialize the Chrome Browser
		        WebDriver driver = new ChromeDriver();

		        // Maximize the browser window
		        driver.manage().window().maximize();

		        // Set explicit wait
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        try {
		            // Open the URL
		            driver.get("https://demoqa.com/select-menu");

		            // Handle 'Select Value' Dropdown
		            WebElement selectValueDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='withOptGroup']/div")));
		            selectValueDropdown.click();
		            WebElement groupOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Group 1, option 1')]")));
		            groupOption.click();

		            // Handle 'Select One' Dropdown
		            WebElement selectOneDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='selectOne']/div")));
		            selectOneDropdown.click();
		            WebElement selectOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Dr.')]")));
		            selectOption.click();

		            // Handle 'Old Style Menu' Dropdown
		            Select oldStyleMenu = new Select(driver.findElement(By.id("oldSelectMenu")));
		            oldStyleMenu.selectByValue("2"); // 'Blue' option value

		            // Handle Multi-Select Dropdown
		            WebElement multiSelectDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='selectMenuContainer']/div[7]/div/div/div/div[1]")));
		            multiSelectDropdown.click();
		            WebElement greenOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Green')]")));
		            greenOption.click();
		            WebElement redOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Red')]")));
		            redOption.click();
		            multiSelectDropdown.click(); // Close dropdown

		            // Handle 'Standard Multi-Select' Dropdown
		            Select standardMultiSelect = new Select(driver.findElement(By.id("cars")));
		            standardMultiSelect.selectByVisibleText("Volvo");
		            standardMultiSelect.selectByVisibleText("Audi");

		            // Pause for demonstration
		            Thread.sleep(3000);

		        } catch (Exception e) {
		            e.printStackTrace();
		        } finally {
		            // Close the browser
		            driver.quit();
		        }
		    }
}


