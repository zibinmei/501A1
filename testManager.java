import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testManager {

	public Manager M = new Manager();

	
	@Test
	public void testInputs() {
		assertEquals("JOHN", M.inputName());	
	//	assertEquals({}, )
	}

}
