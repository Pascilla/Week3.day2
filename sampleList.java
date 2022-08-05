package Week3.Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String text="";
		String text1="";
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='facet-linkhead']/following::label)[1]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());

        //list of brands
		List<WebElement> brandlist=driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> brand=new ArrayList<String>(); 
		Thread.sleep(3000);
		System.out.println("The number of brands is "+brandlist.size()); 
		for(int i=0;i<brandlist.size();i++) {
			text=brandlist.get(i).getText(); 
			brand.add(text); 
		}
		System.out.println(brand);
		//list of names
		List<WebElement> namelist=driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> name=new ArrayList<String>();
		Thread.sleep(3000);
		System.out.println("The number of names is "+namelist.size());
		for(int j=0;j<namelist.size();j++) {
			text1=namelist.get(j).getText();
			name.add(text1);
		}
		System.out.println(name);
	}

}