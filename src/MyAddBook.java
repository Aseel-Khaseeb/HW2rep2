import java.util.ArrayList;

public class MyAddBook {
	
	public ArrayList<Shoping> add1=new ArrayList<Shoping>();	
	
	public void  addcart() {
		
		Shoping x = new Shoping() ;
		add1.add(x) ; 
	}
	
	public void addBook(int cart , int price , String name, int count) {
		Book n = new Book() ;
		n.Name=name; 
		n.Count=count ;
		n.price=price ;
		add1.get(cart).cartList.add(n) ;
	}	
	
}
