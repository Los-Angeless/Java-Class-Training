class Demo8 
{
  public static void main(String [] args)
  
  {
    byte var1 = 127;
    System.out.println(var1);
    
    // byte var3 = 128 ==> compilation error
    
    byte var3 = -128;
    System.out.println(var3);
    
    // byte var4 = -129  ==> compilation error
  }
}