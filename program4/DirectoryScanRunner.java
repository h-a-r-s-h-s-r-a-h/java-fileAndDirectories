package program4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DirectoryScanRunner{
    public static void main(String[] args) throws IOException {
        Path pathFilesToWrite = Paths.get("./resource/file-write.txt");
        List<String> list = List.of("Jai Shree Ram","Har Har Mahadev","Jai Shree Shyam","Ram");
        Files.write(pathFilesToWrite,list);
    }
}