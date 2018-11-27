import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindDupVal {
	public static WebDriver driver;

	@AfterTest
	void closeb() {
		driver.close();
	}

	@BeforeTest
	void starting() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@BeforeClass
	void openbrowser() {
		driver.get("http://localhost:4200/home");
		driver.manage().window().maximize();
	}

	@org.testng.annotations.Test
	void ddTest() {
		WebElement dd_element = driver.findElement(By.id("selectid"));
		Select select = new Select(dd_element);
		List<WebElement> listofElements = select.getOptions();
		Map<String, Integer> wordCount = new HashMap<>();

		for (WebElement element : listofElements) {
			if (wordCount.containsKey(element.getText())) {
				wordCount.put(element.getText(), wordCount.get(element.getText()) + 1);
			} else {
				wordCount.put(element.getText(), 1);
			}
		}
		//System.out.println(wordCount);
		for(Entry<String, Integer> wc :wordCount.entrySet()){
               if(wc.getValue()>1){
            	   System.out.println(wc);
               }
		}

		// wordCount=listofElements.stream().map(x->x.getText()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		// System.out.println(wordCount.entrySet().stream().filter(x->x.getValue()>1).collect(Collectors.toList()));
	}
}
