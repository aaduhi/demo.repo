package Constructor;

public class demo {
	
	public demo() {
		System.out.println("hello world");
		}
	public demo(String name) {
		System.out.println("My name is = "+name);
	}
	public demo(long mobno) {
		System.out.println("My phone no is = "+mobno);
	}
	
   public static void main(String[] args) {
	   demo d=new demo();
	   demo d1=new demo("aditi");
	   demo d2=new demo(9233456789l);
   }

}
