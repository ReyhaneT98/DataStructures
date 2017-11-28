package term_14;

import java.util.*;


class arrayQueue
{
     int Queue[] ;
     int front, rear, size, len;
 
    
    public arrayQueue(int n) 
    {
        size = n;
        len = 0;
        Queue = new int[size];
        front = -1;
        rear = -1;
    }    
    
    public boolean isEmpty() 
    {
        return front == -1;
    }    
    
    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    }    
    
    public int getSize()
    {
        return len ;
    }    
    
    public void insert(int i) 
    {
        if (rear == -1) 
        {
            front = 0;
            rear = 0;
            Queue[rear] = i;
        }
        
        else if ( rear + 1 < size)
            Queue[++rear] = i;    
        len++ ;    
    }    
    
    public int remove() 
    {
        
            len-- ;
            int ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
                
    }
    
    public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = front; i <= rear; i++)
            System.out.print(Queue[i]+" ");
        System.out.println();        
    }
}
 

public class Queue_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		 

        System.out.printf("please enter Size of Integer Queue : ");
        int n = input.nextInt();
        System.out.println();
       
        arrayQueue q = new arrayQueue(n);        
        
        char ch;
        
        do{
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. check empty");
            System.out.println("4. check full");
            System.out.println("5. size");
            
            int choice = input.nextInt();
            
            switch (choice)
            {
            case 1 : 
                System.out.println("please enter integer element to insert");
               
                    q.insert( input.nextInt() );
                                       
                break;                         
            case 2 : 
                   System.out.println("Removed Element = "+q.remove());
                
                
                break;                                                    
            case 3 : 
            	
                System.out.println("Empty status = "+q.isEmpty());
                
                break;                
            case 4 : 
            	
                System.out.println("Full status = "+q.isFull());
                
                break;                          
            case 5 : 
            	
                System.out.println("Size = "+ q.getSize());
                break;                         
            default :
            	
            	System.err.println("Erorr");
                break;
            }
            
            
            q.display();            
            System.out.printf("\nDo you want to continue type y/n : ");
            
            ch = input.next().charAt(0);
 
        } while (ch == 'y');

	}

}
