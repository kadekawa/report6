package jp.ac.uryukyu.ie.e225734;

import java.util.ArrayList;

public class Deck {
  private  ArrayList<Card> deck;
  private String[] swits= new String[]{"♡","♢","♤","♧"};
  private String[] numbers = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    Deck(){
        makeDack();
    }
    //山札にカードを加える（makeDeckメソッドで使用）
    void addDeck(String a, String b){
        deck.add(new Card(a, b));
    }

    //新しいトランプの束を作るためのメソッド
    public void makeDack(){
        deck = new ArrayList<>();
        for(int i=0;i<swits.length;i++){
            for(int j=0; j<numbers.length;j++){
                deck.add(new Card(swits[i], numbers[j]));
            }
        }
    }
    /*カードを山札から抜く
    *@param　number 整数値
    */
    void eraseCard(int i){
        deck.remove(i);
    }

    //山札の残り枚数を返す
    int getSize(){
        return deck.size();
    }
    
    //山札のカードを確認する
    Card getCard(int i){
        return deck.get(i);
    }

}
