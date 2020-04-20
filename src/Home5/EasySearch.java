package Home5;


public class EasySearch implements ISearchEngine {
    String filePath = "C:/Users/tsybi/OneDrive/Рабочий стол/Data.text";
    String a = " Война";
    String b = " и ";
    String c = " мир ";
    public  int search(String text, String word) {
        word = word.toLowerCase();//игонор регистра
       // text = text.toLowerCase();

        int i = 0;//счетчик слов  через метод indexOf
        i = word.indexOf(text);
        int count = 0;
        while (i >= 0) {
            count++;
            i = word.indexOf(text, i + 1);
        }
        return count;
    }


}
