import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(選項包含 AZ,BNT,Moderna,janssen):");
        vaccine =vaccine.toLowerCase();
        if(vaccine.equals("az")){
                JOptionPane.showMessageDialog(null,"AZ\n研發國:英國,瑞典\n疫苗類型:腸病毒疫苗\n劑量:2劑\n保護力:81%" );
        } else if (vaccine.equals("bnt")) {
            JOptionPane.showMessageDialog(null,"BNT\n研發國:得國,美國\n疫苗類型:mRNA\n劑量:2劑\n保護力:95%" );
        } else if (vaccine.equals("mpderna")) {
            JOptionPane.showMessageDialog(null,"Moderna\n研發國:得國,美國\n疫苗類型:mRNA\n劑量:2劑\n保護力:94%" );
        } else if (vaccine.equals("janssen")) {
            JOptionPane.showMessageDialog(null,"Janssen\n研發國:比利時,美國\n疫苗類型:腸病毒疫苗\n劑量:1劑\n保護力:66%" );
        }else {
            JOptionPane.showMessageDialog(null,"請重新輸入其他內容,並確認沒有空白鍵或中文字");
        }
    }
}