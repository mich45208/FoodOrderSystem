package myproj;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Utils {
    static void writeContent(File file, byte[] content){
        try {
            if (file.isDirectory()) {
                throw new IllegalArgumentException("cannot write to directory");
            }
            Files.write(file.toPath(), content);
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    static byte[] readContent(File file) {
        try {
            if (!file.isFile()) {
                throw new IllegalArgumentException("must be a normal file");
            }
            return Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
