
// short data type (2 byte = 16 bits)
// -32768 to +32767

class Demo9
{
  public static void main(String [] args)
  
  {
    short s1 = 32767;
    System.out.println(s1);
    
  // short s2 = 32768 ==> compilation error
    
    short s3 = -32768;
     System.out.println(s3);
    
   // short s4 = -32769  ==> compilation error
  }
}