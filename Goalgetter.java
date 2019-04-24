import java.util.*;

public class Goalgetter{
  public static void main(String[] args)
  {
    int ans = menu();
    ArrayList<Goal> newer = new ArrayList<Goal>();

    do{
        if (ans == 1)
        {
          newer = addGoals();
          ans = menu();
        }

        else if (ans == 2)
        {
          if (newer.isEmpty() == true)
          {
            System.out.println("There are no goals to review");
            System.out.println("Returning to menu. Thank you!\n");
            ans = menu();
          }
          else
          {
            printGoals(newer);
            ans = menu();
          }
        }

        else if (ans == 4)
        {
          System.out.println("Thank you! Goodbye!");
          System.exit(0);
        }
      }
    while(ans != 4);
  }

  public static int menu()//menu class to help with navigation of program in cli
  {
    int ans = 0;
    Scanner in = new Scanner(System.in);

    System.out.println("\nWhat would you like to do today?\n" + " 1. Create Goal\n"
    + " 2. review goals\n" + " 3. review tasks\n" + " 4. quit\n");

    ans = in.nextInt();
    return ans;
  }

  public static ArrayList<Goal> addGoals()// adds goals to ArrayList for review and modification
  {
    String title;
    String timeframe;
    String description;
    String Topic;
    char ans;

    ArrayList<Goal> better = new ArrayList<Goal>();
    Scanner k = new Scanner(System.in);

    System.out.println("Let's add up to 3 goals to work on!\n");
    do{
        System.out.println("what Category does this topic fall under?");
        System.out.println(" 1. health\n 2. finance\n 3. housework\n");
        Topic = k.nextLine();

        switch(Topic)//switch that adds category type to goal object
        {
          case "1" :
            Topic = "health";
            break;
          case "2" :
            Topic = "finance";
            break;
          case "3" :
            Topic = "housework";
            break;
        }

        System.out.println("What's would you like to name this goal?");
        title = k.nextLine();//scanner object for name of goal

        System.out.println("How many months do you want this goal to last?");
        timeframe = k.nextLine();//scanner object for length of goal

        System.out.println("Write a short description of this goal");
        description = k.nextLine();//scanner object for description of goal

        Goal project = new Goal(Topic, title, timeframe, description);
        better.add(project);//instantializes goal object into goals array

        System.out.println("Would you like to add another goal?");
        ans = k.nextLine().charAt(0);//accepts user input for adding another goal
      }
      while (ans == 'y');
      return better;
  }

  public static void printGoals(ArrayList<Goal> copy)//prints out lists of goals for user
  {
    int count = 0;
    int length = copy.size();

    while (count < length)
    {
      copy.get(count).displayGoal();
      count++;
    }
  }
}
