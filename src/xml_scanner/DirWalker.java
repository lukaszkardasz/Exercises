package xml_scanner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirWalker {
    private List<File> recursiveList = new ArrayList<File>();

    public void walkDir(String pathname) {
        File files = new File(pathname);
        recursiveList.add(files);
        if(files.isDirectory()) {
            for(String f : files.list()) {
                walkDir(f);
            }
        }
    }

    public List<File> getRecursiveList() {
        return recursiveList;
    }

    public static void main(String[] args) {
        DirWalker dirWalker = new DirWalker();
        dirWalker.walkDir("c:\\");
        dirWalker.getRecursiveList().forEach(System.out::println);
    }
}
