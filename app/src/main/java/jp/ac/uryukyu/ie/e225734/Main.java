package jp.ac.uryukyu.ie.e225734;

public class Main{
    public static void main(String[] args) {
        GameMaster GM = new GameMaster();
        GM.ready();
        GM.fast();
        GM.distribute();
        GM.distribute();
        GM.distribute();
        GM.confirmRole();
        GM.PCs.get(0).openHand();
        GM.PCs.get(1).openHand();
        GM.PCs.get(2).openHand();
        GM.PCs.get(3).openHand();
        GM.table.openCads();
    
    }
}
