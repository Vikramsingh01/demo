import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ts {
	public String baseURL = "http://www.javascripttoolbox.com/lib/mktree/";

	public static WebDriver driver;

	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void setup() {
		driver.get(baseURL);
	}

	@AfterMethod
	public void tear() {
		driver.quit();
	}

	@Test
	public void testTreeStructure() throws InterruptedException {
		driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[1]/div[2]/div[2]/p[6]/a[2]")).click();
		Thread.sleep(3000);
		WebElement root = driver.findElement(By.xpath(".//*[@id='tree1']/li[19]"));
		
		
			String xpath = ".//*[@id='tree1']/li[19]";
			checkChild(root,xpath);
		
	}

	private void checkChild(WebElement element, String xpath) throws InterruptedException {
		
		String classType = element.getAttribute("class");
		if (classType.equalsIgnoreCase("liClosed")) {
			openTree(xpath);
			//String childXpath = xapth+/ul/li;
			List<WebElement> children = driver.findElements(By.xpath(xpath));
			List<WebElement> childs = driver
					.findElements(By.xpath(".//*[@id='tree1']/li[children]/ul/li"));
			int count = 1;
			for(WebElement child:children){
				if(count<=children.size()){
					
					String childXpath = xpath+"/ul/li";
					checkChild(child, childXpath);
				}
				
				
			}
		}
		
		
	}

	public void openTree(String xpath) throws InterruptedException {
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(3000);
	}
	
	void findVerifyClick( WebElement element,String xpath)throws InterruptedException{
		List<WebElement> roots = driver.findElements(By.xpath(".//*[@id='tree1']/li"));
		int rootSize = 19;
	}
}