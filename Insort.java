import java.util.Scanner;//导包
public class Selection {
    //排序算法类模板
    private static void exch(Comparable a[],int i,int j) {//交换元素位置
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    /*private static void show(Comparable a[]) {//本身想用它输出的但是不行
            for(int i = 0;i < a.length;i++) {
            StdOut.print(a[i]+"");
        }
        StdOut.println();
    }
    */
    private static boolean less(Comparable v,Comparable w) {//对元素进行比较
        return v.compareTo(w) < 0;
    }
    public static void sort(Comparable a[]) {
        int N =a.length;
        for(int i = 0;i < N;i++) {
            int min = i;
            for(int j = i+1;j < N;j++) {
                if(less(a[j],a[min])) //比较函数调用
                    min = j;
            }
            exch(a, i, min);//交换函数调用
        }
    }
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        String Arrays[] = new String[5];//Comparale排序接口，我们实参传递用字符串类型。
        for(int i = 0;i < 5;i++) {
            Scanner S = new Scanner(System.in);
            Arrays[i] = S.next();
        }
        sort(Arrays);//调用函数
        for(int i = 0;i < 5;i++) {//排序后输出
            System.out.print(""+Arrays[i]);
        }
    }
}