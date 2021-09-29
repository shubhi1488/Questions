public class outer {
    int v1=10;
    static int v2=20;
    class inner{
        public void display()
        {
            System.out.println(v1);
            System.out.println(v2);
        }
    }
}
class Test{
    public static void main(String[] args){
        new outer().new inner().display();
    }
}
