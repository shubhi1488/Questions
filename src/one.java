class one {
    int a=10;
    class Two
    {
        int a=20;
        void display(){
            int a=30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(one.this.a);
        }
    }
}
