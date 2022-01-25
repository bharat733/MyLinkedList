import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String num= sc.nextLine();


            boolean flag = false;
            for(int i=num.length()-1; i>0; i--) {
                int add = (num.charAt(i)-'0') + (num.charAt(i-1)-'0');
                if(add > 9) {
                    flag = true;
                    System.out.println(num.substring(0, i-1) + Integer.toString(add) + num.substring(i+1, num.length()));
                    break;
                }
            }
            if(!flag) {
                int add = (num.charAt(0)-'0') + (num.charAt(1)-'0');
                System.out.println(Integer.toString(add) + num.substring(2, num.length()));
            }
        }


    }
}