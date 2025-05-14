package programmers;

public class Solution {

    public int solution(int a, int b, int c) {
        if (a == b && b == c) {
            return sos(a,b,c,1) * sos(a,b,c,2) * sos(a,b,c,3);
        } else if (a != b && b != c && a != c) {
            return sos(a,b,c,1);
        } else {
            return sos(a,b,c,1) * sos(a,b,c,2);
        }
    }

    public int sos(int a, int b, int c, int count) {
        return (int) Math.pow(a,count) + (int) Math.pow(b,count) + (int) Math.pow(c,count);
    }

    //문제 주석
    /*

     */

    //고민 주석
    /*
    2 3 4
    9

    2 3 4
    4 9 16
    29

    2 3 4
    4 9 16
    8 27 64
    99
     */
}
