package jp.ac.uryukyu.ie.e225734;

import java.util.ArrayList;
import java.util.Random;

public class GameMaster {
    ArrayList <Character> PCs;
    Table table;
    Deck deck;
    Random rand = new Random();

    //ゲーム開始前の準備でプレイヤーとNPCを用意する
    GameMaster(){
        PCs = new ArrayList<>();
        Player one = new Player(); 
        NPC NPC1 = new NPC();
        NPC NPC2 = new NPC();
        NPC NPC3 = new NPC();
        PCs.add(one);
        PCs.add(NPC1);
        PCs.add(NPC2);
        PCs.add(NPC3);
        table = new Table();
    }

    void game(ArrayList<Character> PCs){
        for(int i =0; i<4; i++){
            deck = new Deck();
            for(int x=0;x<2;x++){
                int num = rand.nextInt(deck.getSize());
                deck.eraseCard(num);
                table.addCards(deck.getCard(num));
                for (int y=0;y<PCs.size();y++){
                    int ran =rand.nextInt(deck.getSize());
                    deck.eraseCard(ran);
                    PCs.get(y).addHand(deck.getCard(num));
                }
            }
        }
     }

}
