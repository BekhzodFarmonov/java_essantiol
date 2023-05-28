package uz.pdp.googleTranslate;
import java.util.*;
import java.util.concurrent.ForkJoinWorkerThread;

public class Main {
    static Scanner scStr = new Scanner(System.in);
    static Scanner scInt = new Scanner(System.in);
    static List<String> synonymes = new ArrayList<>();
    static List<String> example = new ArrayList<>();
    static Map<String, word> dictionary= new HashMap<>();

    {
        dictionary.put("Hello", new word("salom", example, synonymes));
    }
    static wordServise wordServise1=new wordServiseImp();
    public static void main(String[] args) {
        synonymes.add("qalay");
        synonymes.add("qalesan");
        example.add("hii");
        example.add("helllo");
        var dictionary= new HashMap<String, word>();
        while (true) {
            System.out.println("Other=>logOut\n1=>add\n2=>translate\n3=>search");
            switch (scStr.nextLine()) {
                case "1"-> add();
                case "2"->translate();
                case "3"->search();
                default -> {
                    return;
                }
            }
        }
    }
    private static void add() {
        System.out.println(" England So'zni kiriting: ");
        String EngName=scStr.nextLine();
        System.out.println("Tarjimasini kiriting: ");
        String UzbName= scStr.nextLine();
        System.out.println("So'zning sinonimlari qancha: ");
        int number1 = scInt.nextInt();
        List<String> synonymes1=new ArrayList<>();
        while (number1>0){
            System.out.println(number1 + "- so'zni kiriting: ");
            synonymes1.add(scStr.nextLine());
            number1 -= 1;
        }
        System.out.println("So'zning exampllari qancha: ");
        int number2 = scInt.nextInt();
        List<String> examples1 = new ArrayList<>();
        while (number2 > 0){
            System.out.println(number2 + "- so'zni kiriting: ");
            examples1.add(scStr.nextLine());
            number2 -= 1;
        }
        word words=new word(UzbName,examples1,synonymes1);
        dictionary.put(EngName,words);
        dictionary.forEach((s, word) -> System.out.println(s+" "+word));
    }
    private static void translate() {
        System.out.println("so'z kiriting angland bulsin:");
        String nameEng=scStr.nextLine();
        Set<Map.Entry<String,word>> entrySet=dictionary.entrySet();
        for (Map.Entry<String,word> entry: dictionary.entrySet()
             ) {
            String s=entry.getKey();
            word word1=entry.getValue();
           if(s.equals(nameEng)) {System.out.println(s+"=>"+word1);break;
        }
        else System.out.println("siz lugatda yuq suzni yozdingiz");}
    }
    private static void search() {
    }
}