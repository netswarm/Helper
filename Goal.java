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

  public void setLength(int months)//sets length of goal
  { months = length; }

  public int getLength()//returns length of goal to main
  { return length; }

  public void setName(String title)
  { name = title; }

  public String getName()
  { return name; }

  public void setDescription(String desc)
  { desc = description }

  public String getDescription()
  { return description; }

}
