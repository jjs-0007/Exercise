package jp.co.jjs.java_seminar.exercise_20140516_01;

public class ShoppingTask extends Task {

    private int money; // 買い物の金額
    
    public ShoppingTask(String shoplabel, int money) {
        super(shoplabel);
        this.money = money;
        }
    
    public String getlabel() {
        return super.getlabel() + " " + money;
    }
    
}
