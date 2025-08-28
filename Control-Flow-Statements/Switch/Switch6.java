// statements are allowed within switch
// but independent sttmnts have to be within the cases or should be within default
// without that it will through error

class Switch6
{
 public static void main(String[] args)
 { System.out.println("Start @ Cyber Success");
 
  int a=3;
  switch(a)
  {
  //  System.out.println("Inside Switch statmnt");      => this will through error
  
  }
  System.out.println("Stop @ Cyber Success");
 }
}