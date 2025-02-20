package question8fileman;

public class BookInformation {

    private String num;
    private String title;
    private double cost;

    public BookInformation() {
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTitle() {
        return title.toUpperCase();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
