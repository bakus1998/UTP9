package zad1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Futil {


    public static void processDir(String dirName, String resultFileName){
        BufferedWriter writer;
        try{
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(resultFileName), StandardCharsets.UTF_8));
            Files.walkFileTree(Paths.get(dirName), new SimpleFileVisitor<Path>(){
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    BufferedReader reader = Files.newBufferedReader(file,Charset.forName("CP1250"));
                    String s;
                    while ((s=reader.readLine())!=null){
                        writer.write(s + "\n");
                        //System.out.println(s);
                    }
                    writer.flush();
                    return FileVisitResult.CONTINUE;
                }
            });
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
