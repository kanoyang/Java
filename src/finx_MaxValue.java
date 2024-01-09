public class finx_MaxValue {

    public static int findMax(int arrary[] ){
        int max=0,temp;
        for(int i=0;i<=arrary.length-1;i++){
            temp =arrary[i];
            if(max<temp){
                max =temp;
            }
        }
        return max;
    }

    }




