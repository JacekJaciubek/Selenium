import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\michal\\Desktop\\Kurs - tester Jacek\\Chrome Web Driver for ver. 75\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com");

    :wq
    git System.out.println(driver.getTitle());
        WebElement element = driver.findElement(:wq
    :By.className("sb-destination__input"));
        System.out.println(element.getAttribute("placeholder"));
//Mój komentarz
    }
}
