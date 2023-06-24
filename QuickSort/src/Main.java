public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = new int[]{8,2,4,7,1,3,9,6,5};

        quickSort(arr,0,arr.length - 1);

        for(int item : arr){
            System.out.println(item);
        }

    }


    public static void quickSort(int[] Array,int start, int end){


        if(start >= end) return;

        int privot = partition(Array, start, end);



        quickSort(Array, start,privot - 1);
        quickSort(Array,privot + 1, end);




    }



    public static int partition(int[] Array,int start,int end){

        int pivot = Array[end];

        int i = start - 1;


        for (int j = start ; j <= end ; j++){

            if(Array[j] < pivot){

                i++;


                int temp = Array[i];

                Array[i] = Array[j];

                Array[j] = temp;





            }



        }

        i++;

        int temp = Array[i];
        Array[i] = Array[end];
        Array[end] = temp;

        System.out.println("Pivot:"+ i);


        return i;



    }



}