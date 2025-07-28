package day08.q02;

import day08.q01.Magic;

public class Sorcerer extends Magic {
	public Sorcerer(String name) {
		super(name);
	}

	@Override
	public void attack(int mp) {
		super.attack(mp);
		int addDamege = (int) (mp * 0.5);
		System.out.println("追加で" + addDamege + "のダメージを与えた。");

	}
	@Override
	public void attack(int mp, Monster monster) {
		super.attack(mp, monster);
		int addDamege = (int) (mp * 0.5);
		System.out.println("追加で" + addDamege + "のダメージを与えた。");
		int monsterHP = monster.getHp() - addDamege;
		monster.setHp(monsterHP);

	}

}
