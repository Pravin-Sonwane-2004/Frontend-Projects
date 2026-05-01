import java.util.Scanner;
public class StackApplicationGiri {
    static int[] stack = new int[5];  //4
  static int top=-1;

    static void main(String[] x)
   {    
      do{
	     Scanner xyz  = new Scanner(System.in);
		 System.out.println("1:Push");
		 System.out.println("2:POP");
		 System.out.println("3:Display");
		 System.out.println("Enter your choice");
		 int choice=xyz.nextInt();
		 switch(choice)
		 {
		            case 1:
			System.out.println("Enter data in stack");
			int value=xyz.nextInt();
			push(value);
			break;
			case 2:
			if(top!=-1)
			{ System.out.println("Removed data is "+pop());
			}
			else{
			 System.out.println("Stack is underflow");
			}
			break;
			case 3:
			display();
			break;
			case 4:
			System.exit(0);
			break;
			default:
			System.out.println("Wrong choice");
		 }
	  }while(true);
   }
   public static void push(int value)
   {
               if(top==(stack.length-1))
	      {  System.out.println("Stack is overflow");
	      }
	     else{
		  top = top+1;
		  stack[top]=value;
	   }
   }
   public static int pop(){
      if(top==-1)
	  {  return top;
	  }
	  else{
	   int value=stack[top];
	   top=top-1;
	   return value;
	  }
   }
   public static void display()
   {
              if(top==-1)
	  { 
 System.out.println("Stack is underflow");
	  }
	  else{

	            for(int i=top; i>=0;i--)
		{ 
    System.out.printf("%d\n",stack[i]);
		}
	  }
   }
}
 
