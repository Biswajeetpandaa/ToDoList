import java.util.*;
class ToDoProject
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isTrue = true;
        boolean exitCh = true;
        ArrayList<String> task = new ArrayList<String>();

        // System.out.println(isTrue);
        // Instead of do while used while loop.
        while(isTrue) 
        {
            System.out.println("----Menu----");
            System.out.println("1 for add task");
            System.out.println("2 for view tasks");
            System.out.println("3 for remove task");
            System.out.println("0 for quit from the application");

            // initialized ch with 0 for the try catch block else it will show ch is not initialized.
            int ch = 0;
            // handled input with try catch which only takes integer.
                try
                {
                    System.out.println("Enter your choice : ");
                    ch = sc.nextInt();
                    sc.nextLine();
                }
                catch(Exception e)
                {
                    System.out.println("Not a number!");
                    sc.nextLine();
                }
            switch (ch) 
            {
                case 1 -> 
                {
                System.out.println("Enter the task that you have to add : ");
                String t = sc.nextLine();
                task.add(t);
                System.out.println("task added");
                
                }
                case 2 -> 
                {
                    if(task.size() == 0 )
                    {
                        System.out.println("The task list is empty ");
                    }
                    else 
                    {
                        System.out.println("The task are : ");
                        for(int i =0 ; i<task.size();i++)
                        {
                            System.out.println("no  "+ (i+1) + " : "+ task.get(i));
                        }
                    }

                }
                case 3 ->
                {
                    System.out.println("Enter task no. that you want to remove : ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if(index <=0 ||index > task.size())
                    {
                        System.out.println("Invalid task");
                    }
                    else 
                    {   
                        index = index-1 ;
                        task.remove(index);
                        System.out.println("Task removed");
                    }
                
                }
                case 0  ->
                {   
                    System.out.println("Existing.........");
                    isTrue = false;

                }
                default -> 
                {
                    System.out.println("You have choosen  an invalid option ");
                    System.out.println("Choose again");
                }
            }

        }

        // this is the traditional switch statement 
        // switch (ch) 
        // {
        //         case 1 : 
        //         break;
        //         case 2 :
        //         break;
        // }

    }
    
}
