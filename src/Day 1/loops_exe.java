public class loops_exe{

    public static void main(String[] args) {

        System.out.println("Even Numbers:");
        for (int i=1; i<=30; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
        System.out.println("Odd Numbers:");
        int j=1;
        do {
            if(j%2!=0) {
                System.out.println(j);
            }
            j++;
        }while(j<=30);

    }

}