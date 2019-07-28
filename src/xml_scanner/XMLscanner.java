package xml_scanner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class XMLscanner {
    public static Scanner scanner = new Scanner(System.in);
    private String pathToPutXML;
    private String pathToScan;

    public static String pathToScanFromUser() {
        System.out.println("Wprowadz sciezke do zeskanowania:");
        String pathToScan = scanner.nextLine();
        return pathToScan;
    }

    public static String pathToPlaceXMLfile() {
        System.out.println("Wprowadz sciezke do umieszczenia pliku XML");
        String pathToPutXML = scanner.nextLine();
        return pathToPutXML;
    }


    public static void main(String[] args) throws IOException {
        //PathToPlaceXMLfile();
        final File folder = new File(pathToScanFromUser());
        listFilesForFolder(folder, pathToScanFromUser());
        scanner.close();
    }

    public static void listFilesForFolder(final File folder, String pathToScan) throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(pathToScan))) {
            paths
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);
        }
    }



}
