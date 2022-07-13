public class ArrayFindNumber {
    /*Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program
     */
    static boolean isFind(int []arr,int val){
        for (int i:arr){
            if(i==val){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {2, 7, 3,12, 3, 2, 9, 10, 21, 10, 33, 9, 12};
        int[] duplicate = new int[array.length];
        int startIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[j] == array[i]&& array[j]%2==0) {
                    if(!isFind(duplicate,array[i])){
                        duplicate[startIndex++]=array[i];
                    }
                    break;
                }
            }
        }
        for (int value:duplicate){
            if (value!=0){
                System.out.println(value);
            }
        }
    }
}
