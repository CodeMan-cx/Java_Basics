/*定义一个数组
来存储10个学生的成绩{72,89,65,87,91,82,71,93,76,68}，
计算并输出学生的平均成绩。*/
public class Array_Demo5 {
    public static void main(String[] args) {
        int[] arr={72,89,65,87,91,82,71,93,76,68};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double ave=sum/arr.length;
        System.out.println("该组学生的平均成绩是："+ave);

    }
}
