class Demo20 {
  public static void main(String[] args) {
   //  byte var1 = 128;          throws error
   //  short s1 = 32768;         throws error
   //  int var3 = 2147483648 ;   throws error
   //	
   
   long var4 = 2147483648L;
   System.out.println(var4);
   
   long var5 = 2147483649l;
   System.out.println(var5);
  }
}