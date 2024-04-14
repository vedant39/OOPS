 class A extends Object // jhon cena
 {
     public A()
    {
        super();
        System.out.println("in A ");
    }

    public A (int n)
    {
        super(); // another jhon cena 
        System.out.println("in A int");
    }
 }
//---------------------------------------------------------
class B extends A
{
  public B()
    {
        super();
        System.out.println("in B ");
    }
    public B (int n)
    {
        super(n);
        System.out.println("in B int");
    }
}
//---------------------------------------------------------
class C  extends B {
    public C() {
        super();
        System.out.println("in C");

}

public C(int n) {
    this();
    System.out.println("in C int");
}
}


public class This_Super {

    public static void main(String[] args) {

       C obj = new C(5);

    }
    
}
