package DemoSikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class MercuryToursTest {

	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver", "D://Advance Selenium Softwares1 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/mercurysignon.php");

		Screen sc = new Screen();
		Pattern usnm = new Pattern("D:\\Advance Selenium Softwares1 (2)\\Sikuly\\mercurttours\\usernm.PNG");
		Pattern pswd = new Pattern("D:\\Advance Selenium Softwares1 (2)\\Sikuly\\mercurttours\\pswd.PNG");
		Pattern login = new Pattern("D:\\Advance Selenium Softwares1 (2)\\Sikuly\\mercurttours\\login.PNG");

		sc.type(usnm, "deepalithorat23@gmail.com");
		sc.type(pswd, "Deepali");
		sc.click(login);

		String s = driver.getTitle();
		System.out.println(s);

	}

}
