package gitDemo.com.git;

class A1
{
    public static int a=5;
}
class B1 extends A1
{
    public static int a=8;
    void print(){
        System.out.println(super.a);
        System.out.println(a);
    }
}
public class TestStatic
{
    public static void main(String args[])
    {
        System.out.println("b.a="+B1.a);
        System.out.println("b.a="+A1.a);
        new B1().print();
    }
}
