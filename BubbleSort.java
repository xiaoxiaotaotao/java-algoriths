import java.util.Scanner;

public class BubbleSort {
    public static void Function(int a[]) {
        int i,j,temp;
        for(i=0;i<a.length-1;i++) {
            for(j=0;j<a.length-i-1;j++) {
                if(a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // TODO 自动生成的方法存根
        int i;
        int Arrays[] = new int[5];
        System.out.println("请输入五个数进行排序：");
        for(i=0;i<5;i++) {
            Scanner S =new Scanner(System.in);
            Arrays[i] = S.nextInt();
        }
        Function(Arrays);
        for(i=0;i<5;i++) {
            System.out.println("排序后数组为："+Arrays[i]);
        }

    }

}