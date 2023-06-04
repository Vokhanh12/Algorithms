public class Main {

    //mid = low + (target - arr[low]) * ((high - low )/(arr[high] - arr[low]))

    public static void main(String[] args) {

        long startTime;
        long endTime;
        long elapsedTime;


        int arr[] = new int[]{10,12,13,16,18,19,20,21,22,23,24,33,35,42,47};

        startTime = System.nanoTime();

        int index = interpolationSearch(20 ,arr);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;

        System.out.println("InterPolation: "+elapsedTime+"ns");


        if(index != -1){

            System.out.println("tìm thấy tại "+ index + "Có value là:"+arr[index]);

        }else{
            System.out.println("not found element");
        }


    }

    public static int interpolationSearch(int target, int[] arr){

        int low = 0;
        int high = arr.length -1;

        while (low < high){

            int mid = low + (target - arr[low]) * ((high - low)/(arr[high] - arr[low]));



            int value = arr[mid];


            if(value < target)
                low = mid + 1;
            else if(value > target)
                high = mid - 1;
            else if(target == value)
                return mid;



        }

        return -1;

    }

}