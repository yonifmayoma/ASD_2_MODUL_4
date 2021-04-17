package LATIHAN_4;
public class Lat_Insertionsort {
    public static void insertionSort(int[] A){
        for (int i = 1; i < A.length; i++){ //i=1, i=2, i=3
           int key = A[i]; //A[1]=10 ,A[2]=4, A[3]=2
           int j = i - 1; //j=0, j=1, j=2
           while ((j >= 0) && (A[j] > key)){ //0>=0 & A[0]3>10-F
                 A[j + 1] = A[j]; //A[2]=A[1]=10
                 j--; //j=0
             }
             A[j + 1] = key; //A[1]=10, A[1]=4, A[0]=2
        }//3,10   
    }
    public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    System.out.println();
    }
    public static void main(String[] args){
        int A[] = {3, 10, 4, 2, 8, 9, 7, 6};
        Lat_Insertionsort.tampil(A);
        Lat_Insertionsort.insertionSort(A);
        Lat_Insertionsort.tampil(A);
    }
}


