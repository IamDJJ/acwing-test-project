package easy;

/**
 * 输入两个整数，求这两个整数的和是多少。
 */

class aAndBProblem {
    public static int getCount(int a, int b) {
        if(a <= 0 || b >= Math.pow(10, 8)) {
            //log: a和b的取值范围不对
            return 0;
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(getCount(6,100000000 - 1));
    }
}