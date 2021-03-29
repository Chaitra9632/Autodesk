package pac;

import org.testng.annotations.Test;

public class SampleTest {
	
	
	@Test
	public void createContact() {
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		
		System.out.println(URL);
		System.out.println(BROWSER);

	}

}
