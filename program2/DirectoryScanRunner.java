package program2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner{
    public static void main(String[] args) throws IOException {
        Path currentDirectoty = Paths.get(".");
        
        // filtering only .java files;;
        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        
        //here we are going 4 level deep;; 
        Files.walk(currentDirectoty, 4).filter(predicate).forEach(System.out::println);

        System.out.println();

        //2nd method to filter;;
        
        BiPredicate<Path, BasicFileAttributes> matcher = (path,attributes) -> String.valueOf(path).contains(".java");
        
        Files.find(currentDirectoty, 4, matcher).forEach(System.out::println);
        
    }
}