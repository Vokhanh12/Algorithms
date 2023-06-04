public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1,23,41,4,2,5,8,9,2,7,3,6,4,5};

        BubbleSort(arr);

        for (int a:arr) {

            System.out.println(""+a);

        }

    }

    public static void BubbleSort(int[] arr){

        int[] arr_new =arr;

        for(int i = 0 ; i < arr.length-1 ; i++){

            for (int j = 0 ; j  < arr.length-1-i ; j++){


                if(arr[j] < arr[j+1])
                {

                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                }



            }


        }


    }

}