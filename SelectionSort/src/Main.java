public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{6,3,2,4,8,6,9,7,11,1};

        SelectionSort(arr);

        for(int item : arr){
            System.out.println(""+item);
        }


    }

    public static void SelectionSort(int[] arr){


        for(int i = 0 ; i < arr.length - 1 ; i++){

            int min = arr[i];

            int min_index = i;

            for(int j = i + 1 ; j < arr.length ; j++){

                if(min > arr[j]){

                    min = arr[j];
                    min_index = j;

                }

            }

            int temp = arr[i];

            arr[i] = min;

            arr[min_index] = temp;





        }



    }

}