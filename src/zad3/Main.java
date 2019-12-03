/**
 *
 *  @author Baka Krzysztof S16696
 *
 */

package zad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static int maxSize = 0;

    public static void main(String[] args) {
        String dir = "unixdict.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(dir));
            Map<String, List<String>> anagrams =
                    reader.lines()
                            .collect(Collectors.groupingBy(e -> {
                                char[] toCheck = e.toCharArray();
                                Arrays.sort(toCheck);
                                String r = String.valueOf(toCheck);
                                return r;
                            }));

            anagrams.forEach(((s1, s2) -> {
                if (s2.size() > maxSize) {
                    maxSize = s2.size();
                }
            }));

            for(Map.Entry<String, List<String>> entry : anagrams.entrySet()){
                Collections.sort(entry.getValue());
            }

            Map<String, List<String>> toShow =
                    anagrams.entrySet()
                            .stream()
                            .sorted((o1,o2)->{
                                int i = o1.getValue().get(0).compareTo(o2.getValue().get(0));
                                if(i==0) {
                                    return Integer.compare(o2.getValue().size(), o1.getValue().size());
                                }else{
                                    return i;
                                }
                            })
                            .filter(s1 ->
                                    s1.getValue().size() == maxSize)
                            .collect(
                                    Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                            (s1,s2)-> s1, LinkedHashMap::new));

            toShow.forEach((e1, e2) -> {
                for (int i = 0; i < e2.size(); i++) {
                    if(i<e2.size()-1) {
                        System.out.print(e2.get(i) + " ");
                    }else{
                        System.out.print(e2.get(i));
                    }
                }
                System.out.println("");
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
