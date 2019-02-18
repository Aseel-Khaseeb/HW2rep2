import static org.junit.Assert.*;
import org.junit.Test;

public class MyAddBookTest {

	@Test
	public void testAddcart() {
		Shoping x = new Shoping() ;
		assertTrue(0 == x.getcount()) ;
	}

	@Test
	public void testAddBook() {
		MyAddBook x = new MyAddBook() ;
		x.addcart();
		x.addBook(0, 127,"Java Book", 1);
		assertTrue(1==x.add1.get(0).cartList.size()) ;
		assertTrue(127 == x.add1.get(0).cartList.get(0).price) ;
		x.add1.get(0).cartList.clear();
		x.add1.clear();

	}
	
	@Test
	public void testAddBook2() {
		MyAddBook y = new MyAddBook() ; 
		y.addcart();
		y.addBook(0, 127,"Java Book", 1);
		y.addBook(0, 100,"Web desing Book", 1);
		assertTrue(2==y.add1.get(0).cartList.size()) ;
		assertTrue(227 == y.add1.get(0).getcount()) ;	
	}
}