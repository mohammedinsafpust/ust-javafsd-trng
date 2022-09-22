package Testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.db.Connection1db;

public class TestCase1 {

	@Test(expected = NullPointerException.class)
	public void test() {
	//	fail("Not yet implemented");
		assertEquals(2, 2);
		assertEquals(5,Connection1db.calculate(2,3));
	}
	@Test
	@Ignore
public void test1() {
		String s=null;
	assertEquals("ABC",s.toUpperCase());
}
	@After
	public void after() {
		System.out.println("in after");
	}
	@Before
	public void before() {
		System.out.println("In before");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("In after class");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("In before class");
	}
}
