import java.util.Scanner;
Public Class AttendanceStatusEvaluator
  {
  public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    int percentage = sc.nextInt();
    if (percentage > 85)
    {
      System.out.println("Excellent");
    }
    else if ((percentage >=60) && (percentage<=85))
    {
      System.out.println("Satisfactory");
    }
    else
    {
      System.out.println("Poor");
    }
    
    }
}
