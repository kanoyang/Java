    import javax.swing.*;
    import java.awt.*;
    import java.text.DecimalFormat;
    import java.util.*;
    public class Main {

        //編寫一個名為“printEvery3()”的函數，它打印出等差數列 1, 4, 7, …, 88。
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
        public  static void main(String[] args){
            Scanner scanner =new Scanner(System.in);
            int putter = scanner.nextInt();
            printEvery3(putter);

        }






    }
