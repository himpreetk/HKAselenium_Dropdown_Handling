# HKAselenium_Dropdown_Handling
A. Project Description

    This project demonstrates how to automate dropdown selection using Selenium WebDriver with Java. It is designed to interact with different types of dropdown elements on a web page, ensuring seamless automation of user actions. The script is implemented to run on Google Chrome using ChromeDriver and includes explicit waits for improved stability.

B. Features:

    B.1. Automates dropdown interactions on a sample website.
    B.2. Uses explicit waits to handle dynamic elements.
    B.3. Supports single-select and multi-select dropdowns.
    B.4. Implements try-catch for exception handling.
    B.5. Uses Selenium Select class for standard dropdown handling.

C. Technologies Used

    C.1. Java (JDK 11 or later recommended)
    C.2. Selenium WebDriver
    C.3. ChromeDriver
    C.4. Maven (Optional, for dependency management)

D. Project File Structure

     selenium-dropdown-handling/
     │-- src/
     │   └── packageDropDown/
     │       └── DropDownHandling.java  # Main test script
     │-- resources/
     │   └── chromedriver.exe           # WebDriver executable
     │-- pom.xml                        # Maven dependencies (if applicable)
     │-- README.md                      # Project documentation

E. Prerequisites

    Before running this project, ensure you have the following installed:
       E.1. Java (JDK 11+ recommended)
       E.2. Chrome Browser
       E.3. ChromeDriver (compatible with your Chrome version)
       E.4. Eclipse/IntelliJ IDEA (or any Java IDE)
       E.5. Selenium WebDriver JAR files (or managed via Maven)

F. Setup Instructions

      F.1. Clone the Repository
             - git clone https://github.com/yourusername/selenium-dropdown-handling.git
             - cd selenium-dropdown-handling

      F.2. Configure WebDriver
             - Download ChromeDriver from ChromeDriver Downloads
             - Place it in the resources folder
             - Update the path in the DropDownHandling.java file:
             - System.setProperty("webdriver.chrome.driver", "C:\path\to\chromedriver.exe");

       F.3. Install Dependencies (If using Maven)
            If you are using Maven, add the following dependencies to pom.xml:
                 <dependencies>
                       <dependency>
                            <groupId>org.seleniumhq.selenium</groupId>
                            <artifactId>selenium-java</artifactId>
                            <version>4.0.0</version>
                       </dependency>
                 </dependencies>

       F.4. Run the Script
              - Open the project in your Java IDE
              - Run DropDownHandling.java as a Java Application

G. Code Explanation

            // Set up ChromeDriver path
            System.setProperty("webdriver.chrome.driver", "C:\path\to\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            // Maximize browser window and set explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.manage().window().maximize();

            driver.get("https://demoqa.com/select-menu");

            // Handling 'Select Value' dropdown
            WebElement selectValueDropdown = driver.findElement(By.xpath("//*[@id=\"withOptGroup\"]/div"));
            selectValueDropdown.click();
            WebElement groupOption = driver.findElement(By.xpath("//div[contains(text(),'Group 1, option 1')]");
            groupOption.click();

            // Handling 'Select One' dropdown
            WebElement selectOneDropdown = driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div"));
            selectOneDropdown.click();
            WebElement selectOption = driver.findElement(By.xpath("//div[contains(text(),'Dr.')"]);
            selectOption.click();

            // Handling 'Old Style Menu' dropdown
            Select oldStyleMenu = new Select(driver.findElement(By.id("oldSelectMenu")));
            oldStyleMenu.selectByVisibleText("Blue");

           // Handling Multi-Select dropdown
           WebElement multiSelectDropdown = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]"));
           multiSelectDropdown.click();
           WebElement greenOption = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]"));
           greenOption.click();
           WebElement redOption = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]/div[1]/div/div[1]"));
           redOption.click();
           multiSelectDropdown.click();

           // Handling 'Standard Multi-Select' dropdown
           Select standardMultiSelect = new Select(driver.findElement(By.id("cars")));
           standardMultiSelect.selectByVisibleText("Volvo");
           standardMultiSelect.selectByVisibleText("Audi");

          // Pause and close browser
          Thread.sleep(3000);
          driver.quit();

H. Key Steps:

     H.1. Setting Up WebDriver: The script initializes ChromeDriver, maximizes the browser, and sets an explicit wait.
     H.2. Navigating to DemoQA: The script accesses the DemoQA Select Menu.
     H.3. Handling Different Dropdowns:
           - Uses click() for dynamically loaded dropdowns.
           - Uses Select class for standard HTML <select> dropdowns.
           - Handles multi-select dropdowns by selecting multiple options.
     H.4. Execution Flow:
           - The script waits for interactions.
           - Selects different dropdown options.
           - Closes the browser after execution.

I. Expected Output

      I.1. The script successfully selects values from different dropdowns.
      I.2. The browser remains open for 3 seconds for visualization.
      I.3. The browser closes after execution.

J. Troubleshooting

      J.1. Ensure ChromeDriver matches your Chrome browser version.
      J.2. If encountering ElementNotInteractableException, add explicit waits:
           - WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           - wait.until(ExpectedConditions.elementToBeClickable(By.xpath("your_xpath_here"))).click();
      J.3. If elements are not found, verify the XPaths using Chrome DevTools (F12 > Inspect).

K. Contribution

    Feel free to fork the repository and submit pull requests for improvements.
