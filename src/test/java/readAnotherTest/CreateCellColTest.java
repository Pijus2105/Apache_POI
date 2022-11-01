package readAnotherTest;

import org.testng.annotations.Test;

import dataTable.CreateCellCol;

public class CreateCellColTest {
	
	CreateCellCol ccc = new CreateCellCol();
	
	
	@Test
	public void method() throws Exception {
		ccc.Another("Test", "Country", 0, 2);
	}

}
