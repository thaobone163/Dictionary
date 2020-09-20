public class DictionaryCommandline {
    /**
     * Hàm Xuất dữ liệu.
     * @param eng_vie
     */
    public void showAllWords(Dictionary eng_vie) {
        System.out.println("No\t|English\t|Vietnamese");
        for (int i = 0; i < eng_vie.size; i++) {
            System.out.print(i + 1);
            System.out.print("\t|");
            System.out.print(eng_vie.word[i].getWord_target());
            System.out.print("\t\t|");
            System.out.println(eng_vie.word[i].getWord_explain());
        }
    }
}
