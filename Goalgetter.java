import java.util.*;

public class Goalgetter{
  public static void main(String[] args)
  {
    String title;
    String timeframe;
    String description;
    char ans;

    Scanner k = new Scanner(System.in);
    ArrayList<Goal> better = new ArrayList<Goal>();

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
    if (ans == 'n')
    {
      better.get(0).displayGoal();
    }
  }

}
