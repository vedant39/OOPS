class Aa 
{
    public void show()
    {   
        System.out.println("in A show");
    }

    public void config  ()
       {
           System.out.println("In A config ");
       }
    
    public void print(String n )
    {
         n = "Meathod In A";

        System.out.println(n);
    }
}
//---------------------------------------------------------
class Bb extends Aa
{
    @Override
    public void show()
    {   
        System.out.println("Meatod in class a is overrided");
    }

    @Override
    public void print(String n )
    {
         n = "Meathod In A";

        System.out.println(n + "Meathos print in class Aa is Overrided by Meathos in Class Bb");
    }
   
}
//---------------------------------------------------------

public class Meathod_Overriding {

   public static void main(String[] args) {

      Bb obj = new Bb();
      obj.show();
      obj.config();
      obj.print("hehe");

   }
   
}
