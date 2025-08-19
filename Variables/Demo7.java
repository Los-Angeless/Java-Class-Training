class Demo7
{
 public static void main(String [] args)
 {
  int x=10, y =20;
  
  // Before Swapping
  
  System.out.println("X = " + x);
  System.out.println("Y = " + y);
  
  System.out.println();
  
  //---------------------------------//
  
  x = x+y;
  y = x-y;
  x= x-y;
  
  // After Swapping 
  
  System.out.println("X = " + x);
  System.out.println("Y = " + y);
 }
}

//  swapping 2 number without using 3rd variable
