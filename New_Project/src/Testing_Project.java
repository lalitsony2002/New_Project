
public class Testing_Project {
	
	 public static void test_1()
	 {
		 System.out.println("Hello World");
	 }
	 
	 public static void sum_number()
	 {
		 int a =2;
		 int b =5;
		 int c =5;
		 System.out.println(c);
		 c= a+b;
		 System.out.println(c);
	 }
	 
	 public static void argu_sum(int k, int j)
	 {
		 int m;
		 m = k+j;
		 System.out.println(m);
	 }
	 

	public static void main(String[] args) {
		
		Testing_Project obj = new Testing_Project();
		obj.test_1();
		obj.sum_number();
		obj.argu_sum(20, 30);
		
	}

}
