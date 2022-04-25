import java.util.*; 
class PrintArray{
      public static void main(String[] args){
		  
		  int n;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number of elements you want to store");
		  n=sc.nextInt();
		  int[] a= new int[5];
		  System.out.print("print the Array Elements");
		 
		     for(int i=0;i<n;i++)
			 {
				 a[i]=sc.nextInt();
				
			 }
			 System.out.println("array elements are");
			 for(int i=0;i<n;i++){
				System.out.println(a[i]); 
	  }
}
}