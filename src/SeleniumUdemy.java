import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUdemy {

    public static void main(String[] args){

        //1. Define the web driver

        System.setProperty("webserver.chrome.driver","C:\\Users\\cmarkell\\Downloads\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        //2. Open web browser and navigate to page

        driver.get("http://sdettraning.com/trguitransactions/AccountManagement.aspx");

        // Find elements: Locate the element / Determine the action, Pass any parameters



        //3. Enter email address
        driver.findElement(By.name("email_address")).sendKeys("cm@outlook.com");
        //4.Enter Password
        driver.findElement(By.name("passwrd")).sendKeys("trpass");
        //5. Click login
        driver.findElement(By.name("btn_login")).click();
        //6. Get confirmation
String message = driver.findElement(By.id("conf_message")).getText();
System.out.println("Confirmation: " + message);

//find page title
        String pageTitle = driver.getTitle();
        if (pageTitle == "dfgdfgfd"){

            System.out.println("page title test passed");
        }


        //7. Close the browser

        driver.close();

        //----------------ITEM lOCATOR by LinkText

        driver.findElement(By.linkText("Create Account")).click();

        //------------------------XPATH----------------------firepath install------
        //we have RELATIVE & ABSOLUTE XPATH
        driver.findElement(By.xpath("xpathepression").sendKeys("1223214134");

        //--------By CSS Selector
        drive.findElement(By.cssSelector("input[type='password']")).sendKeys("mspass");

        //-------Work with multiple HTML Form Elements
//radio button
        driver.findElement(By.id("MainContentFemale")).click();
        driver.findElement(By.cssSelector("input[type='password'][value='Female'")).click();

        //select with options

        new Select(driver.findElement(By.id("MainContent_menuCountry"))).selectByVisibleText("Germany");



    }
}
