import javax.swing.*;
import java.awt.*;
public class AddSubMul{
  public static void addNumber()
{
   int a=24;
   int b=12;
   int c=0;
   c=a+b;
  System.out.println("The answer for addition: " +c);
}
   public static void subNumber()
{
   int a=24;
   int b=12;
   int c=0;
   c=a-b;
  System.out.println("The answer for subtration: " +c);
}
   public static void mulNumber()
{
   int a=24;
   int b=12;
   int c=0;
   c=a*b;
  System.out.println("The answer for multiplication: " +c);
}

  public static void main(String[]args){

      int menu;
      String s;
  s=JOptionPane.showInputDialog("Choose menu: \n(1)Addition. \n(2)Subtration. \n(3)Multiplication.");
  menu=Integer.parseInt(s);
   if(menu==1)
{
   addNumber();
}
   if(menu==2)
{
   subNumber();
}
   if(menu==3)
{
   mulNumber();
}
}
}

























