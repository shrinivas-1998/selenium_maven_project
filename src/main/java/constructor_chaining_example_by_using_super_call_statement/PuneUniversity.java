package constructor_chaining_example_by_using_super_call_statement;

public class PuneUniversity 
{
    int uid;
  
    PuneUniversity()
    {
        System.out.println("no argument parent constructor");
    }
  
    class Qspiders extends PuneUniversity
    {
        Qspiders()
        {
            super();
            System.out.println("no argument child constructor");
        }
    }

    public static void main(String[] args) 
    {
        System.out.println("main starts");
        PuneUniversity university = new PuneUniversity();
        Qspiders q1 = university.new Qspiders();
        System.out.println("main ends");
    }
}
