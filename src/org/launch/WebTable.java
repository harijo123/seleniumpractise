package org.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {
public static void main(String[] args) {
	WebDriver dr = new ChromeDriver();
	dr.get("hhttps://in.investing.com/indices/global-indices");
	dr.manage().window().maximize();
	
	WebElement table = dr.findElement(By.xpath("//table[@class='common-table medium js-table js-streamable-table']"));
	List<WebElement> tablerows = table.findElements(By.tagName("tr"));
	int rowssize = tablerows.size();
	System.out.println(rowssize);
//	System.out.println(tablerows.get(1).getText());
	
	dr.close();
	
	
	
}
	
	
	
	
	
}
