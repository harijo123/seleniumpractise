package org.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Same2 {
	public static void main(String[] args) {
		WebDriver dr = new EdgeDriver();
		dr.get("https://demoqa.com/webtables");
		dr.manage().window().maximize();
		
		WebElement table = dr.findElement(By.xpath("//table[@class='dataTable']"));
		
		//Tablerow
		List<WebElement> tr = table.findElements(By.tagName("tr"));
		
		//size
		int rowssize = tr.size();
        System.out.println(rowssize);
		
		//Text of 1 row
//		System.out.println(tr.get(2).getText());
		
		//Text of all row
//		for (int i = 0; i < rowssize; i++) {
//			System.out.println(tr.get(i).getText());
//		}
		
//***********************************************************************
		//TableHead
//		List<WebElement> th = table.findElements(By.tagName("th"));
		
		//size
//		int thsize = th.size();
//		System.out.println(thsize);
		
		//text
//   	System.out.println(th.get(1).getText());
		
//***********************************************************************		
		//TableData
//		List<WebElement> td = table.findElements(By.tagName("td"));
		//size
//		int tdsize = td.size();
//		System.out.println(tdsize);
		

		dr.close();
}
}
