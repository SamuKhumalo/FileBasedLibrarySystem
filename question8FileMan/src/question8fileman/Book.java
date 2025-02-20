package question8fileman;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Book {

    private File theFile;
    private ArrayList<BookInformation> bookInfo;

    public Book() {
        theFile = new File("C:\\Users\\samuk\\OneDrive\\Documents\\book information.txt");
        bookInfo = new ArrayList<>();
    }

    public ArrayList<BookInformation> readFile() throws IOException {
         //ArrayList<BookInformation> bookInfo = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(theFile))){

        String sep = "";

        while ((sep=br.readLine()) != null) {
            BookInformation books = new BookInformation();
            String[] splits = sep.split(";");
            books.setNum(splits[0]);
            books.setTitle(splits[1]);
            books.setCost(Double.parseDouble(splits[2]));

            bookInfo.add(books);

        }
        br.close();
        return bookInfo;
        }

    }
    
    public double totalCost(){
        double cost=0;
        for(int i=0;i<bookInfo.size();i++){
            cost+=bookInfo.get(i).getCost();
        }
        
        return cost;
    }
    
    public void writting() throws IOException{
        
        BufferedWriter bW= new BufferedWriter(new FileWriter(" ",true));
        
        for(int i=0;i<bookInfo.size();i++){
        bW.write(bookInfo.get(i).getTitle()+"\n"+bookInfo.get(i).getCost());
        JOptionPane.showMessageDialog(null, bookInfo.get(i).getTitle()+"\n"+bookInfo.get(i).getCost());
    }
        bW.close();
    }
}
