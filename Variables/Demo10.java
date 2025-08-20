
// Intiger data type (4 byte = 32 bits)
// -2147483648  to +2147483647

class Demo10
{
  public static void main(String [] args)
  
  {
    int var1 = 2147483647;
    System.out.println(var1);
    
  // int var2 = 2147483648 ==> compilation error
    
    int var3 = -2147483648;
    System.out.println(var3);
    
   // int var4 = -2147483649  ==> compilation error
  }
}