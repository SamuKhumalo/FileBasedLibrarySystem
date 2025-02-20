package reademployees1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadEmployees1 {

    public static void main(String[] args) {
        File theFile = new File(" ");

        try {
            BufferedReader br = new BufferedReader(new FileReader(theFile));

            String line = br.readLine();
            while (line != null) {
                System.out.println("");
                line = br.readLine();
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Colud not read from file");
        }
    }

}
