package XMLscanner;

import java.io.File;

/**
 * @author n2god on 07/07/2019
 * @project Exercises
 */
public class XmlScanner2 {

    public static void main (String args[]) {

        displayIt(new File("C:\\java"));
    }

    public static void displayIt(File node){

        System.out.println(node.getAbsoluteFile());

        if(node.isDirectory()){
            String[] subNote = node.list();
            for(String filename : subNote){
                displayIt(new File(node, filename));
            }
        }

    }
}
