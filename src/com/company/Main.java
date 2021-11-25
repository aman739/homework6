package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(75);
        boss.setHealth(1500);
        boss.setWeapon(new Weapon("Gun", "Desert Eagle"));{
        boss.setUltimate("Magic");

        System.out.println("Boss Health" + ":" + boss.getHealth()+"," + " Boss Damage" + ":" + + boss.getDamage() + "," +
                " Boss Ultimate " + ":" +
                 boss.getUltimate() +"," +" Boss Weapon"+ ":" +  boss.getWeapon().getGun() + boss.getWeapon().getSteelArms());
        }
     }
    }

