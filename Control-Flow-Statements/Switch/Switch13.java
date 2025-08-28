class Switch13
{
 public static void main(String[] args)
 {
  byte s = 126;
  switch(s)
  
       {
        case 126 : System.out.println("Inside 126");
	    break;
	    
        case 127 : System.out.println("Inside 127");
	    break;
	    
     //   case 128 : System.out.println("Inside 128");              // it will throws error
	 //   break;
	    
	    
	 default : System.out.println("Inside default");
	    break;    
       }
 }

}
