import java.util.Scanner;

public class HW3_111403538 {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        // 要求使用者輸入參數
        System.out.print("輸入角色類型(1.戰士 2.法師) : ");
        int type = scn.nextInt();

        System.out.print("輸入角色等級 : ");
        int level = scn.nextInt();

        System.out.print("輸入怪物血量 : ");
        int health = scn.nextInt();

        // 如果型態為 1 代表選擇 "戰士"，反之為 2 則選擇 "法師"
        if (type == 1) {
            Warrior character = new Warrior(level);
            Monster monster = new Monster(health);
            character.attack(monster);
        } else if (type == 2) {
            Mage character = new Mage(level);
            Monster monster = new Monster(health);
            character.attack(monster);
        }

        scn.close();
    }
}

class Monster {
    private int health;

    // 在建構式傳入 "生命值參數"
    public Monster(int health) {
        this.health = health;
    }

    // 減少生命值並判斷是否被擊敗或輸出剩餘血量
    public void beAttacked(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println("怪物被擊敗了！");
        } else {
            System.out.println("怪物剩餘血量 : " + this.health);
        }
    }
}

class Character {

    // 使用封裝的方式讓參數不能從外部修改
    private String name;
    private int level;
    private int attackMultiplier;
    private String skill;

    // 輸出傷害訊息並呼叫攻擊怪物函式
    public void attack(Monster monster) {
        int damage = level * attackMultiplier;
        System.out.println(this.name + " 使用了「" + this.skill + "」" + "，造成 " + damage + " 點傷害");
        monster.beAttacked(damage);
    }

    // 以下為封裝後設定參數用函式
    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAttackMultiplier(int attackMultiplier) {
        this.attackMultiplier = attackMultiplier;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

class Warrior extends Character {
    // 在建構式傳入 "等級" 參數，其餘使用設定參數函式
    public Warrior(int level) {
        this.setName("戰士");
        this.setLevel(level);
        this.setAttackMultiplier(2);
        this.setSkill("猛擊");
    }
}

class Mage extends Character {
    // 在建構式傳入 "等級" 參數，其餘使用設定參數函式
    public Mage(int level) {
        this.setName("法師");
        this.setLevel(level);
        this.setAttackMultiplier(3);
        this.setSkill("火球術");
    }
}
