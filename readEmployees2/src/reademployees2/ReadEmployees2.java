package reademployees2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadEmployees2 {

    public static String read1(File file) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));

        String data = " ";
        String line = br.readLine();
        int i = 0;

        while (line != null) {
            data += line + System.getProperty("line.separator");
            i++;
        }
        br.close();
        return data;
    }

    public static ArrayList<String> read2(File theFile) throws IOException {
        ArrayList<String> data = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(theFile));

        int i = 0;
        String line = br.readLine();

        while (line != null) {
            data.add(line);
        }
        br.close();
        return data;

    }

    public static void main(String[] args) {

        File theFile = new File(" ");

        String strFromFile = " ";
        
        try{
            strFromFile=read1(theFile);
        }catch(IOException e){
            System.out.println("Cold not read");
        }
        System.out.println(strFromFile);

        ArrayList<String>fromFileAsList= new ArrayList<>();
        
        try{
            fromFileAsList=read2(theFile);
        }catch(IOException e){
            System.out.println("No reading ");
        }
        System.out.println();
    }

}
