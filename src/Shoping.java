import java.util.ArrayList;

public class Shoping {
	
	ArrayList<Book> cartList ;

	Shoping() {
	
		cartList =new ArrayList<Book>();	
		
	} 
	
	public int getcount() {
		int total=0 ;
		int i = cartList.size() ; 
		for (int j =0 ; j<i;j++) { 
		total += cartList.get(j).price ;
		}
		return total ;
	}
}
