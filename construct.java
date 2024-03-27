class test{
        int roll ;
        String Name;
        int marks;

        test (int r ,String n , int m ){

            this.roll = r;
            this.Name = n;
            this.marks= m;
        }
    }



    public class construct
    {
        public static void main(String[] args) {

            test obj = new test (51,"Test",45);
            System.out.println(obj.marks);
        }
    }
    
