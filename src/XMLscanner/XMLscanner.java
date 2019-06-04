package XMLscanner;

import java.io.File;
import java.util.Scanner;

public class XMLscanner {
    public static Scanner scanner = new Scanner(System.in);
    private String pathToPutXML;

    public static void enterPathToScanFromUser() {
        System.out.println("Wprowadz sciezke do zeskanowania:");
        String pathToScan = scanner.nextLine();
    }

    public static String enterPathToPlaceXMLfile() {
        System.out.println("Wprowadz sciezke do umieszczenia pliku XML");
        String pathToPutXML = scanner.nextLine();
        scanner.close();
        return pathToPutXML;
    }

    private void listFilesForFolder(File folder) {
        createXMLfile();
    }

    void createXMLfile() {
        File actualFolder = new File(pathToPutXML);
        listFilesForFolder(actualFolder);
    }

    public static void main(String[] args) {
        enterPathToScanFromUser();
        enterPathToPlaceXMLfile();


    }

}
