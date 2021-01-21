package Algorithm; /**
 * @author xupeng
 * @date 2020/12/22 14:22
 * @description
 */

/**
多项式函数:
Q:计算一个多项式在给定x点的值  function -> f,f1
  f1的效率比f2慢大概一个数量级的样子，应为f1涉及指数运算，比较耗费时间
Q:
*/
public class Polynomial {
    private static int N = 100; //   多项式最高次幂
    private static double a[] = new double[101];   //系数集合
    private static double X = 1.1;  //自编量

    private static double COUNT= 1e6;  //程序运行的次数
    private static long start;         //开始时间
    private static long stop;          //结束时间


    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        //填充系数集合
        for (int i = 0; i <=N  ; i++) {
            if(i == 0)
                a[i] = 1.0;
            else
                a[i] = 1.0/i;
        }

        //开始测试
        start = System.currentTimeMillis();
        double res = 0.0;
        for (int i = 0; i <COUNT ; i++) {
            res= f1(N, a, X);
        }
        System.out.println("逐项累加法");
        System.out.println("计算结果：" + res);
        stop = System.currentTimeMillis();
        System.out.println("计算一次的运行时间：" + (stop - start)/COUNT/1000);

        start = System.currentTimeMillis();
        for (int i = 0; i <COUNT ; i++) {
            res  =  f2(N,a,X);
        }
        System.out.println();
        System.out.println("秦九韶算法");
        System.out.println("计算结果：" + res);
        stop = System.currentTimeMillis();
        System.out.println("计算一次的运行时间：" + (stop - start)/COUNT/1000);


    }

    /**
     * 算法一  单项累加算法
     * @param n
     * @param a
     * @param x
     * @return
     */
    public static double f1(int n,double a[],double x){
        double sum = 0.0;
        while(n>=0){
            sum += a[n]*Math.pow(x,n--);
        }
        return sum;
    }

    /**
     * 算法二： 秦九韶算法
     * @param n
     * @param a
     * @param x
     * @return
     */
    public static double f2(int n,double a[],double x){
        double sum = a[n];
        while(n > 0){
            sum = a[--n] + sum*x;
        }
        return sum;
    }

}
