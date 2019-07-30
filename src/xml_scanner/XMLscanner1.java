package xml_scanner;

import java.io.*;
import java.util.Scanner;

public class XMLscanner1 {
    private static BufferedWriter writer;

    public static void main(String[] args) {
        EnterData enterData = new EnterData().invoke();
        File currentDir = enterData.getCurrentDir();
        String xmlPath = enterData.getXmlPath();

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(xmlPath));
            if(currentDir.exists() && currentDir.isDirectory()){
                File files[] = currentDir.listFiles();
                writer.write("<file list>");

                recursiveSaveToFile(files, 0, 0);

                writer.write("</file list>");
            }
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku: " + xmlPath);
        }
    }

    private static void recursiveSaveToFile(File[] files, int index, int level) throws IOException {
        //terminate condition
        if (index == files.length){
            return;
        }

        //tabs for internal levels
        for (int i = 0; i < level; i++) {
            writer.write("\t");
        }

        //for files
        if (files[index].isFile()){
            writer.write(files[index].getName());
            writer.newLine();
        }
        //for sub-directories
        else if (files[index].isDirectory()){
            writer.write("<" + files[index].getName() + ">");
            //recursion for sub-directories
            recursiveSaveToFile(files[index].listFiles(), 0, level + 1);
            writer.write("</" + files[index].getName() + ">");
        }
        recursiveSaveToFile(files, ++index, level);
    }

    public static class EnterData {
        private File currentDir;
        private String xmlPath;

        public File getCurrentDir() {
            return currentDir;
        }

        public String getXmlPath() {
            return xmlPath;
        }

        public EnterData invoke() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj ścieżkę do zeskanowania: ");
            currentDir = new File(sc.nextLine());
            System.out.println("Podaj ścieżkę do umieszczenia pliku XML ze strukturą plików: ");
            xmlPath = sc.nextLine() + "SCAN.xml";
            return this;
        }
    }
}
