/**
* Class file for goal that sets the length
* for the goal as well as a description and
* contains a list of milestones in order to
* achieve said goal.
*/
import java.util.*;

public class Goal
{

  String length;//length of the goal set in months
  String name;//name of the Goal
  String description;//description of the goal
  String cat;// category of the goal

  public Goal(){}//default constructor for Goal class
  public Goal(String Topic, String months, String title, String desc)//overloaded constructor for Goal class
  {
    length = months;
    name = title;
    description = desc;
  }

  public void setLength(String months)//sets length of goal
  { months = length; }

  public String getLength()//returns length of goal to main
  { return length; }

  public void setName(String title)//sets name of goal
  { name = title; }

  public String getName()//returns name of goal to main
  { return name; }

  public void setDescription(String desc)//sets description of goal
  { desc = description; }

  public String getDescription()//returns description of goal to main
  { return description; }

  public void setCat(String category)//sets the category for the goal
  { cat = category;  }

  public String getCat()//retrieves category that was set to goal
  { return cat; }

  public void displayGoal()//displays data about Goal
  {
    System.out.println(length);
    System.out.println(name);
    System.out.println(description);
  }
}
