package com.casino.games;

import java.util.ArrayList;
import java.util.Collection;

class SlotMachine {
    private static int credit;
    private static Collection<Reel> playline;
    private static int winnerPaid;

    private int bet;
    private int insertCoin = 0;

    private boolean cashOut = false;
    private int coinTray;

    // METHOD
    public Collection<Reel> spinReel() {
        playline = new ArrayList<>();

        Reel reel1 = new Reel();
        Reel reel2 = new Reel();
        Reel reel3 = new Reel();

//        reel1.getRandom();
//        reel2.getRandom();
//        reel3.getRandom();

        playline.add(reel1);
        playline.add(reel2);
        playline.add(reel3);


        return playline;
    }

    // GETTERS & SETTERS
    public static int getCredit() {
        return credit;
    }

    public static void setCredit(int credit) {
        SlotMachine.credit = credit;
    }

    public static Collection<Reel> getPlayline() {
        return playline;
    }

    public static void setPlayline(Collection<Reel> playline) {
        SlotMachine.playline = playline;
    }

    public static int getWinnerPaid() {
        return winnerPaid;
    }

    public static void setWinnerPaid(int winnerPaid) {
        SlotMachine.winnerPaid = winnerPaid;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getInsertCoin() {
        return insertCoin;
    }

    public void setInsertCoin(int insertCoin) {
        this.insertCoin = insertCoin;
    }

    public boolean isCashOut() {
        return cashOut;
    }

    public void setCashOut(boolean cashOut) {
        this.cashOut = cashOut;
    }

    public int getCoinTray() {
        return coinTray;
    }

    public void setCoinTray(int coinTray) {
        this.coinTray = coinTray;
    }

    @Override
    public String toString() {
        return "SlotMachine{" +
                "bet=" + bet +
                ", insertCoin=" + insertCoin +
                ", cashOut=" + cashOut +
                ", coinTray=" + coinTray +
                '}';
    }
}
