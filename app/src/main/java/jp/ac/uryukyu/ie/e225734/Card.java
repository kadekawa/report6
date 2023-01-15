package jp.ac.uryukyu.ie.e225734;
//トランプのカードのクラス。フィールドはスート（♡や♤など）と数字（１〜１３）
public class Card {
    private String suit;
    private String number;

    Card(String i ,String j){
        this.suit = i;
        this.number = j;
    }
    //スートを返すメソッド
    public String getSweet() {
        return suit;
    }

    //カードの数字を返すメソッド
    public String getNumber() {
        return number;
    }

    //カードのスート・数字をセットで返す。
    public void getName() {
        System.out.print(" "+this.suit);
        System.out.print(this.number);
    }
}