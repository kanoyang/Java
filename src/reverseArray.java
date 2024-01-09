public class reverseArray {
    public static int[] reverseArray(int[] array){

        int count =array.length;
        int[] arr =new int[count];
        int temp =count-1;
        for(int i=0;i<array.length;i++){
            arr[i] = array[temp];
            temp --;
            System.out.println("arr:"+arr[i]+" array:"+array[i]);
        }


        return arr;
    }
}
