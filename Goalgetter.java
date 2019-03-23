import java.util.*;

public class Goalgetter{
  public static void main(String[] args)
  {
    do{
        int ans = menu();
        if (ans = 1)
        { addGoals(); }

        if (ans = 2)
        { printGoals(); }
      } 
  }

  public static int menu()//menu class to help with navigation of program in cli
  {
    int ans = 0;
    Scanner in = new Scanner(System.in);

    System.out.println("\nWhat would you like to do today?\n" + " 1. Create Goal\n"
    + " 2. review goals\n" + " 3. review tasks\n");

    ans = in.nextInt();
    return ans;
  }

  public static void addGoals()// adds goals to ArrayList for review and modification
  {
    String title;
    String timeframe;
    String description;
    char ans;

    ArrayList<Goal> better = new ArrayList<Goal>();
    Scanner k = new Scanner(System.in);

    System.out.println("Let's add up to 3 goals to work on!");
    do{
        System.out.println("What's would you like to name this goal?");
        title = k.nextLine();

        System.out.println("How many months do you want this goal to last?");
        timeframe = k.nextLine();

        System.out.println("Write a short description of this goal");
        description = k.nextLine();

        Goal project = new Goal(title, timeframe, description);
        better.add(project);

        System.out.println("Would you like to add another goal?");
        ans = k.nextLine().charAt(0);
      }
      while (ans == 'y');
  }

  public static void printGoals(ArrayList copy)//prints out lists of goals for user
  {
    int count = 0
    int length = copy.size();

    while (count < length)
    {
      copy[int].displayGoal();
      int++;
    }
  }
}
