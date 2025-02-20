package question8fileman;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Question8FileMan {

    public static void main(String[] args) {
        Book obj = new Book();
        ArrayList<BookInformation> bookInfo = new ArrayList<>();

        try {
           bookInfo= obj.readFile();
           
         
               JOptionPane.showMessageDialog(null, bookInfo.get(0).getTitle());
           }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        try{
            obj.writting();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        

    }

}
