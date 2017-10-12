import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testManager {

	@Test
	public void testInname() {
		assertEquals("JOHN", Manager.inputName());	
	}

}
