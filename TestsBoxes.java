import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestsBoxes{ 
	@Test
	public void testBoxCreate(){
		Box b = new Box();
	}

	@Test
	public void testBoxAdd(){
	Box b = new Box();
	b.add("truc1");
	b.add("truc2");
	}
}
