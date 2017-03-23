package oop.nested;

public class AA {
	
	public static int a1;
	
	static{
		a1=3;
	}
	
	public AA() {
		a1 = 1111;
	}
	
	
	public void f2(){
		
		BB b = new BB();
		
		b.f1();
		

	}
		
	
	class BB{
		
		private int a1 =5;
		
		public void f1(){
						
			int a1 = 7;
		
			System.out.println(AA.this.a1);
			
			System.out.println(new AA().a1);
			
		}
		
	}
	
	
	
}
