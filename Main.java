import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 3, 6000, 0, 9,5 };
        // int target=12;
        // int ans=TargetSum.targetPairSum(arr,target);
        // System.out.println(ans);
        // TargetSum.FileOutputEx();
        // TargetSum.FileInputEx();
        // TargetSum.BufferdOutputEx();
        // TargetSum.BufferdInputEx();
        // TargetSum.SequentialStreamEx();

        // ArrayListEx ex=new ArrayListEx();
        // ex.add(12);
        // ex.add(13);
        // ex.add(50);
        // System.out.println(ex);
        for (int i : arr)
            System.out.print(" " + i);
        System.out.println();
        // ArrayQues.reverseArray(arr, 0, arr.length-1);
        // int temp[]= ArrayQues.rotateArray(arr, arr.length, 36);

        // for(int i:temp)
        // System.out.print(" "+i);
        int query[]={500,600,1,2,45,6000};
        
       List l= ArrayQues.elementPesentOfNTime(arr,query);

        Iterator it=l.iterator();
        while (it.hasNext()) {
            Object obj=it.next();
            System.out.print(" "+obj);
        }
       

    }
}