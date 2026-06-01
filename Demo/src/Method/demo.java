package Method;

public class demo {
	
	public int display(String name) { 
		System.out.println(name);
		return 45;
	}
	
	public long display1() { 
		 return 8776546764l;
		
	}
	public static void main(String[] args) {
		demo d=new demo();
		
		int i=d.display("mamata");
		System.out.println(i);
		
		long l=d.display1();
		System.out.println();
		
	}

}
