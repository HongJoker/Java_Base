package array_base;

public class halfseach_2 {

    public static int seach(int[] arr,int key){
        int min=0;
        int max,mid;
        max = arr.length-1;

        while (min<=max){
            mid = (max+min)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if (arr[mid]>key){
                max = mid - 1;
            }
            else {
                min = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
           int[] arr_test = {1,2,3,4,5,6,7,8,9};
           int result = seach(arr_test,4);
           System.out.println(result);
    }
}


/*
    java分了5片内存
    1、寄存器   2、本地方法区     3、方法区   4、栈     5、堆
    栈：存储的都是局部变量（函数的参数，函数的变量，语句上的变量）
        只要数据运行完毕所在的区域结束，该数据就会被释放

    堆：
 */