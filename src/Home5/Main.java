package Home5;



public class Main {
    public static void main(String[] args) {
        EasySearch s = new EasySearch();
        System.out.println("Слово 'Война' встречается "+ s.search(s.a,(s.filePath)) + " раз.");//51
        System.out.println("Слово 'И' встречается "+ s.search(s.b, (s.filePath)) + " раз.");//13883
        System.out.println("Слово 'Мир' встречается "+ s.search(s.c,(s.filePath)) + " раз.");//18
    }
}

