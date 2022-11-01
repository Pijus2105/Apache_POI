package readAnotherTest;

import org.testng.annotations.Test;

import dataTable.readAnother;

//Process-3

public class ReadAnotherTest {
	
	
	@Test
	public void Test() throws Exception {
		readAnother read = new readAnother();
		
		read.method("Test");
		String data = read.methodTwo(3, 1);
		
		System.out.println(data);
	}

}
