public class Element {
    public static void main(String[] args){
        int[] myNum={1,2,3,4,5,6,7,8,9,10};
        boolean found=false;
        int n=11;
        for (int i:myNum){
            if(i==n){
                found=true;
                break;
            }


        }
        System.out.println(found);

    }
}
