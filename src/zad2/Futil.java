package zad2;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Futil {


    public static void processDir(String dirName, String resultFileName) {
        BufferedWriter writer;

        try (Stream<Path> fileTree = Files.walk(Paths.get(dirName))) {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resultFileName), StandardCharsets.UTF_8));
            fileTree.filter(Files::isRegularFile)
                    .forEach(path -> {
                try {
                    BufferedReader reader = Files.newBufferedReader(Paths.get(String.valueOf(path)), Charset.forName("CP1250"));
                    //System.out.println(counter++ + " " +String.valueOf(path));
                    String toSave ;
                    while((toSave=reader.readLine())!=null){
                        System.out.println(toSave);
                        writer.write(toSave + "\n");
                    }
                    writer.flush();

                }catch (IOException e){
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
