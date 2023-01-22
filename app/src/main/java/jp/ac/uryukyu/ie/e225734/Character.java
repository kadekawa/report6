package jp.ac.uryukyu.ie.e225734;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * プレイヤーやNPCのスーパークラス
 */
public class Character {
    private int coin = 20;
    private String mane;
    private ArrayList<Card> hand;
    private boolean continues = true ;
    private int role= 0;

    Character(String _mane){
        mane = _mane;
    }
    public void setMane(String mane) {
        this.mane = mane;
    }

    public String getMane() {
        return mane;
    }
    //配られたカードを手札に加える
    void addHand(Card i){
        this.hand.add(i);
    }
    //勝った時にコインを加えるためのメソッド
    void addCoin(int i){
        this.coin += i;
    }
    //コインを払うためのメソッド
    void takeCoin(int i){
        this.coin -=i;
    }
    //持っているコインを数を返す
    int getCoin() {
        return coin;
    }
    //続けるかの確認
    boolean getcontinue(){
        return continues;
    }

    void ready(){
        hand = new ArrayList<>();
        continues = true;
        role = 0;
    }
    
    //手札と場のカードのスートを確認する
    //戻り値はMap
    Map<String,Integer> checkSuit(Table table){
        String[] suits = new String[]{"♡","♢","♤","♧"};
        Map<String,Integer> handSuits =new HashMap<String,Integer>();
        for(int suit=0; suit<suits.length;suit++){
            int i =0;
            for(int y=0;y<table.getCards().size();y++){
                if(suits[suit].equals(table.getCards().get(y).getSuit())){
                    i +=1;
                }
            }
            for(int x=0; x<hand.size(); x++){
                if (suits[suit].equals(hand.get(x).getSuit())){
                    i +=1;
                }
                handSuits.put(suits[suit],i);
            }
        }return handSuits;
    }
    //手札を公開する
    void openHand(){
        System.out.print(this.mane + "の手札:");
        for(int i=0;i<hand.size();i++){
            hand.get(i).getName();
        }
        System.out.println("");
    }
    //自分の手札・場のカードの番号を確認する
    //戻り値はMap
    Map<String,Integer> checkNumber(Table table){
        String[] numbers = new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        Map<String,Integer> hundNumbers = new HashMap<String,Integer>();
        for(int number=0; number<numbers.length;number++){
            int i =0;
            for(int y=0;y<table.getCards().size();y++){
                if(numbers[number].equals(table.getCards().get(y).getNumber())){
                    i +=1;
                }
            }
            for(int x=0; x<hand.size(); x++){
                if (numbers[number].equals(hand.get(x).getNumber())){
                    i +=1;
                }    
                hundNumbers.put(numbers[number],i);
            }
        }return hundNumbers;
    }
    //自分の役を確認する
    //現在　フォーカード・フルハウス・フラッシュ・スリーカード・ワンペアのみ実装
    // 引数は Map<string,Integer> を二つ（checkSuit
    int checkRole(Map<String,Integer> number, Map<String,Integer> suit){
        if (number.containsValue(4)){
            role += 700;
        }else if(number.containsValue(2)&&number.containsValue(3)){
            role += 600;
        }else if(suit.containsValue(5)){
            role += 500;
        }else if(number.containsValue(3)){
            role += 300;
        }else if (number.containsValue(2)){
            role += 100;
        }
        return role;
    }
    
}