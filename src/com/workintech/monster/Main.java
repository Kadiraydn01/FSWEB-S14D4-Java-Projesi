package com.workintech.monster;

public class Main {
    public static void main(String[] args) {
        Werewolf kurt = new Werewolf("Bahçesiz" , 40 ,31);
        System.out.println("Werevolf Attack Damage: " + kurt.attack());
    }
}
