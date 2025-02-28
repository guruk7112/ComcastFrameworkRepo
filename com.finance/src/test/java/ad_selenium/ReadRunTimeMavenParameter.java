package ad_selenium;

import org.junit.Test;

public class ReadRunTimeMavenParameter {

	@Test
		public void runtimeParameterTest() {
		
		String url=System.getProperty("url");
		String un=System.getProperty("username");
		String pwd=System.getProperty("password");
		String browser=System.getProperty("browser");
		
		System.out.println("Env Data==>url ==>"+url);
		System.out.println("browser date==>url ==>"+browser);
		System.out.println("pwd data==>url ===>"+pwd);
		System.out.println("un data ==>url ==>"+un);
		
	}
}
