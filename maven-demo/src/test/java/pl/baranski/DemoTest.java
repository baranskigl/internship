package pl.baranski;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {

	@Test
	public void testAdd() {
		Demo demo = new Demo();

		int result = demo.add(1, 2);

		Assert.assertEquals(3, result);
	}

}