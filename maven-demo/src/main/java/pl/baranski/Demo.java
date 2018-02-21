package pl.baranski;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * New demo class.
 * 
 * @author bartosz.baranski
 *
 */
public class Demo {
	public static void main(String[] args) {

		System.out.println(RandomStringUtils.randomAlphanumeric(20));
	}

	public int add(int a, int b) {
		return a + b;
	}

}