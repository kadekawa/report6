package jp.ac.uryukyu.ie.e225734;

import java.util.ArrayList;

public class Table {
    private ArrayList<Card> cards;
    private int tip = 0;

    //場のカードを追加する
    void addCards(Card a){
        cards.add(a);
    }
    //場のカードリストを返す
    ArrayList<Card> getCards() {
        return cards;
    }
    //集まったコインの数を返す
    int getTip() {
        return tip;
    }
    // 場のコインにレイズなどのコインを追加する
    void addTip(int i){
        this.tip +=i;
    }
    //勝った人にコインを渡した後、場のコインを０にするためのメソッド
    void  returnTip(int i){
        this.tip -=i;
    }
    //各回開始時に場のカードをなくす
    void ready(){
        this.cards = new ArrayList<>();
        this.tip =0;
    }

    //ばのカードを出す
    void openCads(){
        for(int i=0;i<cards.size();i++){
            cards.get(i).getName();
        }
    }
    
}
