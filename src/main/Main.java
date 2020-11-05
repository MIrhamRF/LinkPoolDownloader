package main;
import java.awt.Desktop;
import java.net.URI;
import java.util.concurrent.TimeUnit;
import java.io.File;
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.io.FilenameFilter;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] myList =
                {
                       //pool of download link
                		//ex:
                		/*
                		 https://aaaaaa/download/zip/3,
                		 https://yyyyyy/download.html,
                		 https://xxxxxx/download/zip/1
                		 */
                };
        
        int arrLength = myList.length;
        int i=-1;
        File folder = new File("D:/");
        int Jumlah1 = (folder.listFiles().length);

        while (i<arrLength){
            File file2 = new File("D:\\");

            double size = file2.getFreeSpace() / (1024.0 * 1024 * 1024);
            System.out.printf( "%.3f GB\n", size);

            System.out.println("1 = " + Jumlah1);
            File[] listOfFiles = folder.listFiles();
            boolean ada2 = false;
            for (File file : listOfFiles) {
                String namaFile = file.getName();
                boolean ada = namaFile.endsWith(".crdownload");
                if (file.isFile() && ada) {
                    ada2=true;
                    Jumlah1 = folder.listFiles().length;
                    TimeUnit.SECONDS.sleep(7);
                }
            }

            //System.out.println(ada2);
            if (!ada2) {

                int Jumlah2 = folder.listFiles().length;
                System.out.println("2 = " + Jumlah2);

                //i++;
                    if (Jumlah1==Jumlah2) {
                        i++;
                    }

                System.out.println("i = " + i);
                Desktop d = Desktop.getDesktop();
                d.browse(new URI(myList[i]));
                System.out.println(myList[i]);
                TimeUnit.SECONDS.sleep(5);
                if (size < 1.00 ) {
                    break;
                }
                //    int Jumlah3 = Jumlah2;
                //System.out.println("3 = " + Jumlah3);

            }

        }

    }


}

