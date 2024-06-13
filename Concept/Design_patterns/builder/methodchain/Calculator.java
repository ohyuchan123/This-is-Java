package Concept.Design_patterns.methodchain;

public class Calculator {
    private int first;
    private int second;

    public void setFirst(int first){
        this.first = first;
    }
    public void setSecond(int second){
        this.second = second;
    }

    public void showAdd(){
        System.out.println("Add "+this.first + " and"+this.second+
                " = "+(this.first + this.second));
    }
    public void showSub(){
        System.out.println("Sub "+this.first + " and"+this.second+
                " = "+(this.first - this.second));
    }
}
