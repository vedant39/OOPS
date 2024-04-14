



public class Inheritance {
    
    public static void main(String[] args) {

          Calc obj = new Calc(); 
          int r1 = obj.add(13,10);
          int r2 = obj.sub(13,10);
          System.out.println(r1);
          System.out.println(r2);
          
          AdvCalc obj1 = new AdvCalc(); 
          int r3 = obj1.multi(13,10);
          int r4 = obj1.div(13,10);
          System.out.println(r3);
          System.out.println(r4);
          
          SciCalc obj2 = new SciCalc();
          int r5 = (int) obj2.power(13 , 2);
          System.out.println(r5);

    }
}  