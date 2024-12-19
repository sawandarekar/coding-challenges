package org.techHub.challenge.comp;

/**
 *
 * isPossible Test <br>
 * <br>
 * Consider a pair of integers (a,b) we can perform the following operation on
 * (a,b) in any order, zero or more times (a,b)-> (a+b,b) (a,b)-> (a, a+b) <br>
 * <br>
 * function must return a string denoting whether or not you can convert(a,b) to
 * (c,d) by performing zero or more operations specified above, return YES or NO
 * <br>
 * <br>
 * <b>input :</b>1,4,5,9 <b>output :</b> YES <br>
 * <br>
 * explanation: (1+4,4) -> (5,4) (5,5+9) -> (5,9)
 *
 *
 * @author darekar
 *
 */
public class PossibilityTest {


    static boolean result =false;

    public static void main(String[] args) {
        //        int[] a = {1,4};
        //        checkPossibility(a, 5,9);
        int[] a = {1,3};
        checkPossibility(a, 20,49);
        if(result) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    private static boolean checkPossibility(int[] temp, int c, int d) {
        System.out.println(temp[0]+":"+temp[1]);
        if(temp[0] == c && temp[1] == d){
            System.out.println("Possible:"+temp[0]+":"+temp[1]);
            result=true;
            return true;
        }else if(temp[0] > c || temp[1] > d){
            System.out.println("Not Possible");
            return false;
        }else {
            for(int i=0;i<temp.length;i++){
                if(i==0) {
                    int[] f = {temp[0]+temp[1],temp[1]};
                    if(checkPossibility(f, c, d)) {
                        break;
                    };
                }else if(i ==1 ) {
                    int[] f = {temp[0],temp[0]+temp[1]};
                    if(checkPossibility(f, c, d)) {
                        break;
                    };
                }
            }
            return false;
        }
    }
}

