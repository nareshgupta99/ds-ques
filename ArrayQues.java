import java.util.ArrayList;
import java.util.List;

public class ArrayQues {

    public static int targetPairSum(int arr[], int target) {
        int ans = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    ans++;
            }
        }
        if (ans != -1)
            ans++;
        return ans;
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] rotateArray(int[] arr, int n, int k) {
        k = k % n;
        int rIndex = n - k;
        int tempIndex = rIndex;
        int i = 0;
        int temp[] = new int[n];

        while (rIndex < n) {
            temp[i] = arr[rIndex];
            rIndex++;
            i++;
        }
        rIndex = 0;
        while (rIndex < tempIndex) {
            temp[i] = arr[rIndex];
            i++;
            rIndex++;
        }
        return temp;
    }

    public static void rotateArrayWithoutXSpace(int[] arr, int n, int k) {
        k = k % n;
        int rindex = n - k;
        reverseArray(arr, rindex, n - 1);
        reverseArray(arr, 0, rindex - 1);
        reverseArray(arr, 0, n - 1);

    }

    public static List elementPesentOfNTime(int[] arr,int query[]) {
        List ans=new ArrayList<>();
        int size = 100001;
        int[] temp = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int t = arr[i];
            temp[t] = 1;
        }

        for(int i=0;i<query.length;i++){
            int data=query[i];
            if(temp[data]==1){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans ;
    }

   
















    // public static void FileInputEx(){
    // try {
    // FileInputStream file=new FileInputStream("welcome.c");
    // byte d[]=file.readAllBytes();
    // for(int i=0;i<d.length;i++)
    // System.out.print((char)d[i]);
    // } catch (Exception e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }

    // }
    // public static void FileOutputEx() {
    // try {
    // FileOutputStream file=new FileOutputStream("welcome.c");
    // String s="#include<stdio.h>";
    // byte d[]=s.getBytes();
    // file.write(d);
    // } catch (Exception e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }

    // }

    // public static void BufferdInputEx() {
    // try {
    // FileInputStream file=new FileInputStream("welcome.c");
    // BufferedInputStream bufferdInput=new BufferedInputStream(file);
    // byte []data=bufferdInput.readAllBytes();
    // for(byte i:data){
    // System.out.print((char)i);
    // }
    // } catch (Exception e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }
    // }

    // public static void BufferdOutputEx() {
    // try {
    // FileOutputStream fileOut=new FileOutputStream("welcome.c",true);
    // BufferedOutputStream bufferedOutput=new BufferedOutputStream(fileOut);
    // String s="#include<conio.h>";
    // byte[]d=s.getBytes();
    // bufferedOutput.write(d);
    // bufferedOutput.close();
    // } catch (Exception e) {
    // // TODO Auto-generated catch block
    // e.printStackTrace();
    // }

    // }

    // public static void SequentialStreamEx() {
    // try{

    // FileInputStream file=new FileInputStream("welcome.c");
    // FileInputStream file2=new FileInputStream("welcome.txt");
    // FileInputStream file3=new FileInputStream("TargetSum.java");
    // FileInputStream file4=new FileInputStream("Main.java");
    // Vector v=new Vector<>();
    // v.add(file);
    // v.add(file2);
    // v.add(file3);
    // v.add(file4);

    // Enumeration e=v.elements();

    // SequenceInputStream stream=new SequenceInputStream(e);

    // byte []data=stream.readAllBytes();
    // for(byte i:data){
    // System.out.print((char)i);
    // }
    // }
    // catch(Exception e){
    // e.printStackTrace();
    // }

    // }

}
