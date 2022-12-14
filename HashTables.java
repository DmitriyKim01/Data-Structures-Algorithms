import java.util.Hashtable;

public class HashTables {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100,  "Spongebob");
        table.put(555,  "Squidward");
        table.put(321,  "Sandy");
        table.put(123,  "Patrick");
        table.put(777,  "Gary");

//        table.remove(777);

        for(Integer key : table.keySet()){
            System.out.println( key.hashCode() % 10+ "\t" +key + "\t" + table.get(key));
        }

    }
}
