package gitDemo.com.git;

public class Test {

	@org.junit.Test
	public void testReturn() {
		for (int i = 0; i < 10; i++) {
			System.err.println(i);
			if (i==5) {
				continue; //!=break;  因为break会跳出for循环继续执行后面代码
			}
		}
	}
	
}
