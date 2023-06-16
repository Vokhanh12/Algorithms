public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = new int[]{3,7,8,5,4,2,6,1};

         megaSort(arr);


        for (int item : arr) {

            System.out.println(""+item);


        }


    }



    public static void megaSort(int[] arr){

        int mid = arr.length/2;
        int left = mid;
        int right = arr.length - mid;

        int arrLeft[] = new int[left];
        int arrRight[] = new int[right];

        int i = 0;
        int j = 0;

        if (arr.length <= 1)
            return;

        for(; i < arr.length ; i++){

            if(i < left)
                arrLeft[i] = arr[i];
            else{
                arrRight[j]=arr[i];
                j++;
            }

        }


        megaSort(arrLeft);
        megaSort(arrRight);

        mega(arrLeft,arrRight,arr);


    }



    public static void mega(int[] leftArr,int[] rightArr, int[] arr){

        int leftSize = arr.length / 2;
        int righSize = arr.length - leftSize;

        int l=0, r=0, i=0;

        while(l < leftSize && r < righSize){


            if(leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                i++;
                l++;

            }else {

                arr[i] = rightArr[r];
                i++;
                r++;


            }


        }

        while (l < leftSize){

            arr[i] = leftArr[l];
            i++;
            l++;

        }

        while (r < righSize){

            arr[i] = rightArr[r];

            i++;
            r++;

        }



    }

}