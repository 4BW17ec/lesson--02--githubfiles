
  public class accessSpecifiers1
  {
	 public static void main(String[] args)
     { 
         System.out.println("You are accessing protected method of the class access"); 
     }
	 private void test()
	 {
		 
         System.out.println("my private method");
	 }
	 public void hello()
	 {
		 
		 System.out.println("public method");
	 }
	 void world()
	 {
		 System.out.println("default method");
}
  }