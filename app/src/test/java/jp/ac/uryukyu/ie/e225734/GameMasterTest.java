package jp.ac.uryukyu.ie.e225734;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameMasterTest{
    @Test void GameMasterTest() {
        GameMaster Gm = new GameMaster();
        Gm.ready();
        Gm.table.addCards(new Card("♡", "A"));
        Gm.table.addCards(new Card("♤", "2"));
        Gm.table.addCards(new Card("♡", "5"));
        Gm.table.addCards(new Card("♡", "3"));
        Gm.table.addCards(new Card("♧", "A"));

        Gm.PCs.get(0).addHand(new Card("♢", "A"));
        Gm.PCs.get(0).addHand(new Card("♤", "A"));

        Gm.PCs.get(1).addHand(new Card("♡", "Q"));
        Gm.PCs.get(1).addHand(new Card("♡", "4"));

        Gm.PCs.get(2).addHand(new Card("♤", "2"));
        Gm.PCs.get(2).addHand(new Card("♡", "2"));

        Gm.PCs.get(3).addHand(new Card("♢", "K"));
        Gm.PCs.get(3).addHand(new Card("♢", "7"));

        //assertNotNull(Gm.confirmRole(),"プレイヤー:フォーカード　\nNPC1:フラッシュ \nNPC2:フルハウス \nNPC3:ワンペア" );
        
    }
}
