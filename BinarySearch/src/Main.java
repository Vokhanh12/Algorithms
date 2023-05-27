public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{2,5,8,12,16,23,38,56,72,91};

        int target = 23;

        int index = binarySearch(array,target);

        if(index != -1){
            System.out.println("Tìm thấy số "+target+ "tại "+index);
        }else{
            System.out.println("Không tìm thấy element");
        }

    }
    //0 ,1 ,2, 3 ,4,5
    //[0,1,2,3,4,5,]
    //midle 2 value 2
    // target 1

    public static int binarySearch(int Array[],int target){
        int Left = 0;
        int Right = Array.length-1;

        while(Left <= Right){

            int Middle = Left + (Right - Left)/2;
            int value = Array[Middle];

            System.out.println("Mid:"+value);

            if(value < target){
                Left = Middle + 1;
            }else if(value > target){
                Right = Middle - 1;
            }else if(value == target){
                return Middle;
            }

        }





        return -1;

    }

}