
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();
        int choice;
        
        while(true) {
            System.out.print("\n-----------------------------------");
            System.out.println("\n- Message                         -");
            System.out.println("-                                 -");
            System.out.println("-   1. Input Your Message         -");
            System.out.println("-   2. Send                       -");
            System.out.println("-   3. Display Message            -");
            System.out.println("-   4. Exit                       -");
            System.out.print("-----------------------------------");
            System.out.print("\nEnter your choice: ");
            try {
                choice = scan.nextInt();
                String message;
                switch (choice) {
                    case 1:
                    System.out.print("Enter Message: \n");
                        do{
                            
                            Scanner sc = new Scanner(System.in);
                            message = sc.nextLine();
                            
                            if (message.length()<250){
                                if (!(message.equals("done"))){
                                    queue.enqueue(message);                                   
                                }
                                
                                
                            }else{
                                System.out.println("Enter again");
                            }
                        }while(!(message.equals("done")));
                        if(message.equals("done")){
                            System.out.println("\nSending...");
                        }                
                        break;
                    case 2:
    
                        try{
                            while (!(queue.isEmpty())) {
                                String x=queue.dequeue();
                                stack.push(x);
                            }
                            System.out.println("\n Send Message Successfully!");
                        }catch(Exception e){
                            System.out.print(e.getMessage());
                            System.out.print("Can not send a message. Please try again.");
                        }
                        break;
                    case 3:
                        try{

                        while(!(stack.isEmpty())) {
                            System.out.print(stack.pop());
                            System.out.println();
                        }
                        }catch(Exception e){
                            System.out.print(e.getMessage());
                            System.out.print("Can not Display. Please try again.");
                            
                        }
                        break;
                        
                    case 4:
                        System.out.print("\n!!!!!!!!!!!!!!!!!!!! BYE !!!!!!!!!!!!!!!!!!\n");
                        System.exit(0);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Please Choose again!");
                scan.nextLine();                
            }
            
        }
        
    }
}
