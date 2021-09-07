
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator {

    public Calculator(){


            System.out.println("calling constructor");

    }

    public void add(){

        System.out.println("Adding some numbers");
    }

    public void sub(){

        System.out.println("Subtracting some numbers");
    }

    public static void main(String[] args){

        Calculator calc = new Calculator();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\cmarkell\\Downloads\\chromedriver.exe");


        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        //call add method


    }
}
