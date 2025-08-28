// check if male is eligible for marriage or not
class IfElse3 
{
 public static void main(String[] args) 
 {
   char gender = 'm';
   int age = 22;
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