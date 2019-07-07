package exercises.org.recurrency.directory_lister;

import java.io.File;

/**
 * @author n2god on 07/07/2019
 * @project Exercises
 */
public class DirectoryLister {

    public static void main(String[] args) {
        File file = new File("c:\\java");
        showDirectories(file);
    }

    private static void showDirectories(File file) {
        File[] files = file.listFiles();

        if(files != null){
            for (File f : files) {
                if(f.isDirectory()){
                    System.out.println("folder " + f.getAbsolutePath());
                    showDirectories(f);
                } else{
                    System.out.println(" plik " + f.getAbsolutePath());
                }
            }
        }
    }

}
