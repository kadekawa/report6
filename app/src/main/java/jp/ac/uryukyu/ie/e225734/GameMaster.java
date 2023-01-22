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
        Player one = new Player("プレイヤー"); 
        NPC NPC1 = new NPC("NPC1");
        NPC NPC2 = new NPC("NPC2");
        NPC NPC3 = new NPC("NPC3");
        PCs.add(one);
        PCs.add(NPC1);
        PCs.add(NPC2);
        PCs.add(NPC3);
        table = new Table();
    }
    //各回最初の手札の用意
    void fast(){
        deck = new Deck();
        for(int x=0;x<2;x++){
            int num = rand.nextInt(deck.getSize());
            table.addCards(deck.getCard(num));
            deck.eraseCard(num);
            for (int y=0;y<PCs.size();y++){
                int ran =rand.nextInt(deck.getSize());
                PCs.get(y).addHand(deck.getCard(ran));
                deck.eraseCard(ran);
            }
        }
    }
    //場にカードを配る（出す？）
    void distribute(){
        int num = rand.nextInt(deck.getSize());
            deck.eraseCard(num);
            table.addCards(deck.getCard(num));
    }
    //手札の初期化などゲームの各回最初にやること
    void ready(){
        table.ready();
        for (int i=0;i<PCs.size();i++){
            PCs.get(i).ready();
        }
    }

    void confirmRole(){
        String role;
        for(Character who:PCs){
            int i= who.checkRole(who.checkNumber(table), who.checkSuit(table));
            if(700<=i &&i<800){
                role = "フォーカード";
            }else if(600<=i &&i<700){
                role = "フルハウス";
            }else if (500<=i &&i<600){
                role = "フラッシュ";
            }else if(400<=i && i<500){
                role = "ストレート";
            }else if(300<=i &&i<400){
                role = "スリーカード";
            }else if (200<=i && i<300){
                role = "ツーペア";
            }else if (100<=i && i<200){
                role = "ワンペア";
            }else{
                role = "役なし";
            }
            System.out.println(who.getMane() +":"+role);
        }
    }
    
}    