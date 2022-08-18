package study_hall.HackerRank;

public class staircase {

    public static void stairs(int n) {
        // Write your code here
        for(int i = 0;i<n;i++)
        {
            for(int j =1;j<=n;j++){
                if(j>= n-i && j <= n+i)
                {
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");

        }
    }
    public static void main(String[] args) {

    }
}
