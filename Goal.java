/**
* Class file for goal that sets the length
* for the goal as well as a description and
* contains a list of milestones in order to
* achieve said goal.
*/
import java.util.*;

public class Goal
{

  int length;//length of the goal set in months
  String name;//name of the Goal
  String description;//description of the goal

  public Goal(int months, String title, String desc)//overloaded constructor
  {
    months = length;
    name = title;
    description = desc;
  }

  public void setLength(int months)//sets length of goal
  { months = length; }

  public int getLength()//returns length of goal to main
  { return length; }

  public void setName(String title)//sets name of goal
  { name = title; }

  public String getName()//returns name of goal to main
  { return name; }

  public void setDescription(String desc)//sets description of goal
  { desc = description }

  public String getDescription()//returns description of goal to main
  { return description; }

}
