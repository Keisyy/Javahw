import javax.swing.*;
import java.awt.*;
public class Coffeebar{
 public static void main(String[]args){
   String s; 
   int menu;
   int coffeemenu;
   s=JOptionPane.showInputDialog("Choose menu:\n(1)Coffeemenu\n(2)Payment");
   menu=Integer.parseInt(s);
   if(menu==1)
   {
    int comenu;
    int price=0;
    int qty=0;
    int total=0;
    s=JOptionPane.showInputDialog("Choose your coffee:\n(1)Americano $20\n(2)Mocha $25\n(3)Valnilla  $30\n(4)Expresso  $23\n(5)Latte  $19");
    comenu=Integer.parseInt(s);
     if(comenu==1)
      {
      price=20;
       }
     if(comenu==2)
      {
      price=25;
      }
     if(comenu==3) 
     {
     price=30;
      }
     if(comenu==4)
     {
      price=23;
     }
     if(comenu==5)
     {
     price=19;
     }
     s=JOptionPane.showInputDialog("Enter Quantity");
     qty=Integer.parseInt(s);
     total=qty*price;
     System.out.println("Total cost: "+total);
}
  if(menu==2)
  {
   int position;
   int wages=0;
   int hour=0;
   int payment=0;
   s=JOptionPane.showInputDialog("Choose position: \n(1)CIN  $45\n(2)Manager  $35\n(3)Employee  $29");
   position=Integer.parseInt(s);
   if(position==1)
     {
      wages=45;
     }
   if(position==2)
     {
      wages=35;
     }
   if(position==3)
    {
    wages=29;
     }
   s=JOptionPane.showInputDialog("Workload hours");
   hour=Integer.parseInt(s);
   payment=wages*hour;
   System.out.println("Payment: " +payment);
}
}
}












 