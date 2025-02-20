package writetofile1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class WriteToFile1 {
    public static void saveToFile(File theFile,String data) throws IOException{
       
        BufferedWriter bw= new BufferedWriter(new FileWriter(theFile,false));
        
        bw.write(data);
        bw.close();
        
    }

    public static void main(String[] args) {
        File theFile= new File(" ");
        
        String strToFile=JOptionPane.showInputDialog(null,"Enter data:");
        
        try{
            saveToFile(theFile, strToFile);
        }catch(IOException e){
            System.out.println("No data");
        }
    }
    
}
