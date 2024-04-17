import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver" , "\"C:\\Users\\User\\OneDrive\\שולחן העבודה\\Selenuim\\chromedriver-win64\\chromedriver.exe\"");

        WebDriver driver =  new ChromeDriver();


        driver.get("https://www.wikipedia.org/");
        String sTitle1 = driver.getTitle();

        if (sTitle1.equals("Wikipedia")) {
            System.out.println("it worked");
        }else {
            System.out.println("it didn't");

        }

        String sURL2 = driver.getCurrentUrl();

        if (sURL2.equals("https://www.wikipedia.org/")) {
            System.out.println("it matches");
        }else {
            System.out.println("it doesn't match");
        }

        String sMySource2 = driver.getPageSource();


        if (sMySource2.contains("portal/wikipedia.org/assets/img/Wikipedia-logo-v2.png"
        )) {
            System.out.println("it does");
        } else {
            System.out.println("no");
        }

        driver.quit();





    }
}