import java.util.Scanner;

public class Game {
    static Scanner keyboard = new Scanner(System.in);
    static Player player1 = new Player("Alvan");
    static Player player2 = new Player("Peter");
    static Skill skill1 = new Skill("Small Fire", 5, 0, 0.8);
    static Skill skill2 = new Skill("Middle Fire", 20, 10, 0.5);
    static Skill skill3 = new Skill("Big Fire", 30, 20, 0.3);

    public static void main(String[] args) {
        playerStatus();
        System.out.println();
        skillsList();

        do {
            System.out.print("\nPlayer 1 please input the number of skill: ");
            int num1 = keyboard.nextInt();
            System.out.print("\nPlayer 2 please input the number of skill: ");
            int num2 = keyboard.nextInt();

            if (num1 == 1) {
                player1.smallAttack();

                if (skill1.judgement(skill1.getMissRate())) {
                    player2.receivedDamage(skill1.getDamage());
                    System.out.println();
                    System.out.println(player2.getName() + ": Receive Damage: " + skill1.getDamage());
                    System.out.println();
                    playerStatus();
                } else {
                    System.out.println();
                    System.out.println("Miss");
                    System.out.println();
                    playerStatus();
                }
            } else if (num1 == 2 && player1.getCurrentMp() > skill2.getMpUsage()) {
                player1.middleAttack();

                if (skill2.judgement(skill2.getMissRate())) {
                    player2.receivedDamage(skill2.getDamage());
                    System.out.println();
                    System.out.println(player2.getName() + ": Receive Damage: " + skill2.getDamage());
                    System.out.println();
                    playerStatus();
                } else {
                    System.out.println();
                    System.out.println("Miss");
                    System.out.println();
                    playerStatus();
                }
            } else if (num1 == 3 && player1.getCurrentMp() > skill3.getMpUsage()) {
                player1.bigAttack();

                if (skill3.judgement(skill3.getMissRate())) {
                    player2.receivedDamage(skill3.getDamage());
                    System.out.println();
                    System.out.println(player2.getName() + ": Receive Damage: " + skill3.getDamage());
                    System.out.println();
                    playerStatus();
                } else {
                    System.out.println();
                    System.out.println("Miss");
                    System.out.println();
                    playerStatus();
                }
            }
            if (num2 == 1) {
                player2.smallAttack();

                if (skill1.judgement(skill1.getMissRate())) {
                    player1.receivedDamage(skill1.getDamage());
                    System.out.println();
                    System.out.println(player1.getName() + ": Receive Damage: " + skill1.getDamage());
                    System.out.println();
                    playerStatus();
                } else {
                    System.out.println();
                    System.out.println("Miss");
                    System.out.println();
                    playerStatus();
                }
            } else if (num2 == 2 && player2.getCurrentMp() > skill2.getMpUsage()) {
                player2.middleAttack();

                if (skill2.judgement(skill2.getMissRate())) {
                    player1.receivedDamage(skill2.getDamage());
                    System.out.println();
                    System.out.println(player1.getName() + ": Receive Damage: " + skill2.getDamage());
                    System.out.println();
                    playerStatus();
                } else {
                    System.out.println();
                    System.out.println("Miss");
                    System.out.println();
                    playerStatus();
                }
            } else if (num2 == 3 && player2.getCurrentMp() > skill3.getMpUsage()) {
                player2.bigAttack();

                if (skill3.judgement(skill3.getMissRate())) {
                    player1.receivedDamage(skill3.getDamage());
                    System.out.println();
                    System.out.println(player1.getName() + ": Receive Damage: " + skill3.getDamage());
                    System.out.println();
                    playerStatus();
                } else {
                    System.out.println();
                    System.out.println("Miss");
                    System.out.println();
                    playerStatus();
                }
            }
            if (num1 <= 0 || num1 > 3 || num2 <= 0 || num2 > 3) {
                System.out.println();
                System.out.println("Try again!");
                System.out.println();
            }

        } while (player1.getIsAlive() && player2.getIsAlive());

        if (player1.getIsAlive()) {
            System.out.println("\nPlayer 1 win!!");
        } else {
            System.out.println("\nPlayer 2 win!!");
        }
    }

    public static void playerStatus() {
        System.out.printf("Player 1: %s, HP: %d/%d, MP: %d/%d\n", player1.getName(), player1.getCurrentHp(), player1.getMaxHp(), player1.getCurrentMp(), player1.getMaxMp());
        System.out.printf("Player 2: %s, HP: %d/%d, MP: %d/%d\n", player2.getName(), player2.getCurrentHp(), player2.getMaxHp(), player2.getCurrentMp(), player2.getMaxMp());
    }

    public static void skillsList() {
        System.out.printf("Skill 1: %s, Damage: %d, MpUsage: %d, MissRate: %.1f\n", skill1.getName(), skill1.getDamage(), skill1.getMpUsage(), skill1.getMissRate());
        System.out.printf("Skill 2: %s, Damage: %d, MpUsage: %d, MissRate: %.1f\n", skill2.getName(), skill2.getDamage(), skill2.getMpUsage(), skill2.getMissRate());
        System.out.printf("Skill 3: %s, Damage: %d, MpUsage: %d, MissRate: %.1f\n", skill3.getName(), skill3.getDamage(), skill3.getMpUsage(), skill3.getMissRate());
    }
}
