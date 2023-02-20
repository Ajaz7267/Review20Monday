package Review.Monday20;


public class NthEvenFiboo {
    public static void main(String[] args) {
        int firstElement =1;
        int secondElement =1;
        int thirdElement;
        int count =0;
        int n = 10;
        System.out.print(firstElement+" "+secondElement);
        for (int i=1;i<n;i++) {
            if (i % 2 == 0) {
                count +=1;
                if (count == n) {
                    break;
                }
            }
            thirdElement = firstElement + secondElement;
            System.out.print(" "+thirdElement);
            firstElement = secondElement;
            secondElement = thirdElement;

        }

    }
}
