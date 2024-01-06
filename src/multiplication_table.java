import java.util.Scanner;

public class multiplication_table {
    public static void printEvery3(int i){
        int start = 1;
        System.out.println(start);
        //i 進來(跑幾次)
        //預設初始值int start = 1;
        //for 包一個從0開始跑小魚i
        // print start
        //
        for(int x =0;x<i;x++){
            start=start+3;
            System.out.println(start);

        }

    }

    public  static void  ninetable(int x ,int y){

        for (int i=1;i<=x;i++)
        {
            for (int j=i;j<=y;j++){
                System.out.println("i:"+i+" j:"+j+" i*j="+i*j);

            }

        }
    }
    public  static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        //printEvery3(putter);
        System.out.println("請輸入第一位數字：");
        int i = scanner.nextInt();
        System.out.println("請輸入第二位數字：");
        int j = scanner.nextInt();
        ninetable(i,j);
    }
}
