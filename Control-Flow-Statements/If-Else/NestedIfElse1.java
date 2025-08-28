
class NestedIfElse1
{
 public static void main(String[] args) 
 {
 char ProdType='M';
 int CustQty = 25;
 
 if(ProdType=='L')
  {
     if(CustQty>20)
     {
      System.out.println("Purchase Laptop");
     }
     else
     {
      System.out.println("Laptop are less in Quantity");
     }
   
  }
  else
  {
     if(CustQty>35)
     {
     System.out.println("Purchase Mobile");
     }
     else
     {
      System.out.println("Mobiles in less in Quantity");
     }
  }
 
 }
}