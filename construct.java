
    
class Human
{ // everytime you make a instance variable make it private
     private int age ;
     private String name ;

    public Human() 
    {
        age = 12;
        name = "default";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

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


public class construct
{
    public static void main(String[] args) 
    {
      Human obj = new Human(); 
      Human obj1 = new Human(14 , "hehe");
      System.out.println(obj.getName() + ":" + obj.getAge());
      System.out.println(obj1.getName() + ":" + obj1.getAge());
      //obj.age = 19;
     // obj1.name = "Vedant";

      obj.setAge(19);
      obj.setName("Vedant");

        
    }
}
