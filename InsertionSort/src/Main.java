public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = new int[]{6,1,7,4,2,9,8,5,3};

        //3,9......
        // 3,9,2....
        //3,2,9
        //2,3,9
        //
        //

        insertSort(arr);

        for (int i : arr) {
          System.out.println(""+i);
        }

    }

    public static void insertSort(int[] arr){

        for(int i = 1 ; i < arr.length ; i++){

            int temp = arr[i];

            int temp_index = i;


            for(int j = i - 1 ; j >= 0 ; j--){

                if(temp < arr[j]){

                    arr[j + 1] = arr[j];


                    temp_index = j;


                } else{
                    break;
                }

                arr[temp_index] = temp;



            }



        }

    }

}