package Review.Monday20;

public class CountSmallerElement {
    public static void main(String[] args) {
        int[] array ={3,8,10,9,1,1,2,7,5};
        int Smaller =array[0];
        for (int i =1;i<array.length;i++){
            if(array[i]<Smaller){
                Smaller =array[i];
            }
        }
        System.out.println("minimum element is "+Smaller);
        int count =0;
        for (int j=0;j<array.length;j++){
            if (array[j]==Smaller){
                count+=1;
            }
        }
        System.out.println("The Smaller Element "+count);
    }
}
