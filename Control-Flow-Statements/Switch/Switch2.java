// if the switch argmnt doesnt match any cases then 
// by default it will execute default case

class Switch2
{
 public static void main(String[] args)
 {
  int a=5;
  switch(a)
  {
   case 1 : System.out.println("Inside Case1");
   break;
   case 2 : System.out.println("Inside Case2");
   break;
   default : System.out.println("Inside default");
   break;
  }
 }
}