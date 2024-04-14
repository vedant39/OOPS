class A 
{
    public A()
    {
        System.out.println("Object created");
    }

    public void  show ()
    {
        System.out.println("in a show");
    }
}


public class AnonymousObject {
    public static void main(String[] args) {

        //int marks ;
        //marks = 99 ;
        //A obj;
        //obj = new A(); // "new A " is when the object will be created with show() meathod
        //obj.show();
        
        new A().show();

    }    
}
