package StepDefinition;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature",glue= {"StepDefinition"},monochrome=true,
plugin={"pretty","html:target/cucumber-reports/reports.html"}
)
  

public class GoogleRunner {
//	
//	public static String getFormatTime()
//	{
//	
//	}getFormatTime();
//
//
//	public static String getFormatTime() {
//		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd_HHmmss");
//		return format.format(new Date());
//		
//	}
//	public static void main(String[] args) {
//		getFormatTime();
//	}
	
//	
//	Instant timestamp = Instant.now();
//	LocalDateTime dateTime = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault());
//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//	String formattedDateTime = dateTime.format(formatter);
	


}
