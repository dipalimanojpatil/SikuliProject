package DemoSikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FacebookTest {

	public static void main(String[] args) throws FindFailed, InterruptedException {

		Screen sc = new Screen();
		Pattern email = new Pattern("D:\\Advance Selenium Softwares1 (2)\\Sikuly\\Facebook\\email.PNG");
		Pattern pswd = new Pattern("D:\\Advance Selenium Softwares1 (2)\\Sikuly\\Facebook\\pswd.PNG");
		Pattern login = new Pattern("D:\\Advance Selenium Softwares1 (2)\\Sikuly\\Facebook\\login.PNG");

		System.setProperty("webdriver.chrome.driver", "D://Advance Selenium Softwares1 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(1000);
		sc.type(email, "deepalithorat23@gmail.com");
		sc.type(pswd, "Dipali23@");
		sc.click(login);

	}

}
