package DiziElemanSiralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        action();
    }

    static void action () {
        Scanner scan= new Scanner(System.in);
        System.out.println("Eleman Sayisini Giriniz : ");
        int n= scan.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n ;i++){
            System.out.println((i+1)+". elemanı giriniz");
            arr[i]=scan.nextInt();
        }
        sorting(arr);

        scan.close();        
    }

    static void sorting( int[] arr){
        for(int i=0;i< arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[i]){
                    minIndex=j;

                }

            }
            if(i!=minIndex){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;

            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
