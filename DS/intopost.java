package term3_13;
import java.util.Scanner;
public class intopost{
	
	public static void main(String[] args)
	{

	    System.out.print("Enter Expression : ");
	    Scanner input=new Scanner(System.in);
	    String exp=input.next();

	    int sym_top=0,po_top=-1,p=0,p2=0;
	    int size=exp.length();

	    char a[]=exp.toCharArray();
	    char symbols[]=new char[size];
	    char pfix[]=new char[size];

	    symbols[sym_top]='$';

	    for(int i=0;i<size;i++)
	    {
	        char c1=a[i];

	        if(c1==')')         
	        {
	            while(sym_top!=0)
	            {
	                if(symbols[sym_top]=='(')
	                   break;

	                pfix[++po_top]=symbols[sym_top--];                  
	            }
	            sym_top--;

	        }

	        else if(c1=='(')
	        {
	                         symbols[++sym_top]=c1;
	        }

	        else if(c1=='+' || c1=='-' || c1=='*' || c1=='/' || c1=='^')
	        {

	       switch(c1)
	       {
	         case '+':
	          case '-':   p=2;
	             break;

	          case '*':
	         case '/':   p=4;
	             break;

	         case '^':   p=5;
	                break;

	            default:    p=0;                              

	              }

	           if(sym_top<1)
	              {

	           symbols[++sym_top]=c1;

	           }

	           else
	           {

	          do
	            {

            char c2=symbols[sym_top];

	          if(c2=='^')
            {
	               p2=5;
          }

	         else if(c2=='*' || c2=='/')
	           {
	          p2=4;                
	                }

	        else if(c2=='+' || c2=='-')
	        {
	               p2=2;
	        }

	         else
	         {
	              p2=1;
	                      }

	                if(p2>=p)
	                  {                                                   
	                               pfix[++po_top]=symbols[sym_top--];
	                            }

	                 if(p>p2 || symbols[sym_top]=='$')
	                    {
	                 symbols[++sym_top]=c1;
	                      break;
	       }

	   }while(sym_top!=-1);

	                            }

	        }

	        else
	        {
	            pfix[++po_top]=c1;
	        }
	    }

	      for(;sym_top>0;sym_top--)
	      {

	               pfix[++po_top]=symbols[sym_top];

	      }

	    System.out.print("\nInfix to Postfix expression : ");

	    for(int j=0;j<=po_top;j++)
	    {

	            System.out.print(pfix[j]);

	    }    

	    System.out.println("\n");
	}
}