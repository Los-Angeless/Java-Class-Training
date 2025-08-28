class Switch12
{
 public static void main(String[] args)
 {
  char s = 98;
  switch(s)
  
       {
        case 98 : System.out.println("Inside a");
	    break;
	    
	    case 'b' : System.out.println("Inside b");    // it will throw error // duplicate case label
	    break;
	    
	    default : System.out.println("Inside default");
	    break;    
       }
 }

}
