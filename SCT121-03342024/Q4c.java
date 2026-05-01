import java.util.Scanner;

public class Q4c
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
            
            //code to capture the choice from user            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            if(choice>=1 && choice<=4)
            {
            
            //code accept the numbers
            System.out.print("Enter a: ");
                int a=sc.nextInt();
                System.out.print("Enter b: ");
                int b=sc.nextInt();
                
                //code to display result
                switch(choice)
                {
                    case 1: System.out.println("Sum: "+(a+b)); break;
                    case 2: System.out.println("Diff: "+(a-b)); break;
                    case 3: System.out.println("Prod: "+(a*b)); break;
                    case 4: System.out.println(b==0?"Cannot divide by zero":"Quotient: "+(a/b)); break;
                }
            }
            //code for looping 
        }while(choice!=5);
    }
}
