package xml_scanner;

import java.io.*;
import java.util.Scanner;

public class XMLscanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ścieżkę do zeskanowania: ");
        File currentDir = new File(sc.nextLine());
        System.out.println("Podaj ścieżkę do umieszczenia pliku XML ze strukturą plików: ");
        String xmlPath = sc.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(xmlPath));) {
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

    private static void recursiveSaveToFile(File[] files, int index, int level) {
        //terminate condition
        if (index == files.length){
            return;
        }

        //tabs for internal levels
        for (int i = 0; i < level; i++) {
            writer.
        }
    }


}
