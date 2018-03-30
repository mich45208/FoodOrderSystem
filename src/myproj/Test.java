package myproj;

import java.io.File;

public class Test {
    static public void main(String[] args) {
        File dir = new File("dirTest");
        System.out.println(dir.mkdir());
    }
}
