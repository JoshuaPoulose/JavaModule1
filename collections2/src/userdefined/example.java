package userdefined;
import java.util.HashMap;
 
class example {
    public static void main(String[] args)
    {
 
        String str = "This this class consists exclusively of static methods that operate on or return collections."
        		+ "It contains polymorphic algorithms that operate on collections,"
        		+ "which return a new collection backed by a specified collection,and a few other odds and ends.";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String str3=str.toLowerCase();
        String str1=str3.replace(".", " ");
        String str2=str1.replace(",", " ");
 
        String[] j = str2.split(" ");
 
        for (String ch : j) {
 
            Integer integer = hashMap.get(ch);
            System.out.println(ch);
 
            if (integer == null)
                hashMap.put(ch, 1);
 
            else {
                hashMap.put(ch, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}