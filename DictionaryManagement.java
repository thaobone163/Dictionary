import java.util.Scanner;

public class DictionaryManagement {
    /**
     * Hàm có chức năng nhập liệu.
     */
    public Dictionary insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong tu vung: ");
        Dictionary eng_vie = new Dictionary();
        eng_vie.size = Integer.parseInt(sc.nextLine()); //nhập số lượng từ cần dùng
        for (int i = 0; i < eng_vie.size; i++) {
            eng_vie.word[i] = new Word();
            //nhập target
            System.out.println("Nhap tu thu " + (i + 1));
            String target = sc.nextLine();
            eng_vie.word[i].setWord_target(target);
            //nhập explain
            System.out.println("Nhap vao nghia cua tu ");
            String explain = sc.nextLine();
            eng_vie.word[i].setWord_explain(explain);
        }
        return eng_vie;
    }
}
