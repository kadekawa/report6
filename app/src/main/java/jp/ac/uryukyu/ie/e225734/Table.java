package jp.ac.uryukyu.ie.e225734;

import java.util.ArrayList;

public class Table {
    private ArrayList<Card> cards;
    private int tip = 0;

    //場のカードを追加する
    public void addCards(Card a){
        cards.add(a);
    }
    //場のカードリストを返す
    public ArrayList<Card> getCards() {
        return cards;
    }
    //集まったコインの数を返す
    public int getTip() {
        return tip;
    }
    // 場のコインにレイズなどのコインを追加する
    public void addTip(int i){
        this.tip +=i;
    }
    //勝った人にコインを渡した後、場のコインを０にするためのメソッド
    public void  returnTip(int i){
        this.tip -=i;
    }
}
