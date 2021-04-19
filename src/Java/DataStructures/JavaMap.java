package Java.DataStructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class JavaMap {
    public static void main(String[] argh) {
        File fileObj = new File("C:\\per scholas\\JavaAssignments\\PerScholasHackerRankExcercies\\src\\Java\\DataStructures\\phoneBook.txt");
        Map<String, Integer> phoneBook;
        List<String> queryList;
        try {
            Scanner in = new Scanner(fileObj);
            int n = in.nextInt();
            in.nextLine();
            phoneBook = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String name = in.nextLine();
                int phone = in.nextInt();
                phoneBook.put(name, phone);
                in.nextLine();
            }
            queryList = new ArrayList<>();
            while (in.hasNext()) {
                String s = in.nextLine();
                queryList.add(s);
            }
            for (String name : queryList) {
                if (phoneBook.get(name) != null) {
                    System.out.println(name + "=" + phoneBook.get(name));
                } else {
                    System.out.println("Not found");
                }
            }
            in.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
