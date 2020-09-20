public class DictionaryCommand {
    /**
     * Hàm gọi insertFromCommandline() và showALlWords().
     */
    public void dictionaryBasic() {
        DictionaryManagement input = new DictionaryManagement();
        Dictionary save = input.insertFromCommandline();
        DictionaryCommandline ouput = new DictionaryCommandline();
        ouput.showAllWords(save);
    }
}
