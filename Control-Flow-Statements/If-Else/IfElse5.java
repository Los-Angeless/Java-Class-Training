// check if female is eligible for marriage or not

class IfElse5
{
 public static void main(String[] args) 
 {
   char gender = 'f';
   int age = 26;
   if((gender=='m' && age>=21) || (gender =='f' && age>=18))
   {
     System.out.println("Eligible for marriage");
   }
   else 
   {
     System.out.println("Not Eligible for marriage");
   }
 }
}