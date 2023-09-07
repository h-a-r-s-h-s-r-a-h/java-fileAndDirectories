package program3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DirectoryScanRunner{
    public static void main(String[] args) throws IOException {
        Path pathFilesToRead = Paths.get("./resource/data.txt");
        List<String> lines = Files.readAllLines(pathFilesToRead);
        System.out.println(lines);

        System.out.println();

        //2nd method;;
        //here we are mapping and converting all string to upper case;
        // we can also filter ;;
        Files.lines(pathFilesToRead).filter(e -> e.contains("a")).map(e -> e.toUpperCase()).forEach(System.out::println);
        
    }
}