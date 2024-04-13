class Human
{ // everytime you make a instance variable make it private
     private int age ;
     private String name ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     

}


public class encapsulation 
{
    public static void main(String[] args) 
    {
      Human obj = new Human();
      //obj.age = 19;
     // obj1.name = "Vedant";

     obj.setAge(19);
     obj.setName("Vedant");

      System.out.println(obj.getName() + ":" + obj.getAge());
        
    }
}
