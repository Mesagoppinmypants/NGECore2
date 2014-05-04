/*******************************************************************************
 * Copyright (c) 2013 <Project SWG>
 * 
 * This File is part of NGECore2.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Using NGEngine to work with NGECore2 is making a combined work based on NGEngine. 
 * Therefore all terms and conditions of the GNU Lesser General Public License cover the combination.
 ******************************************************************************/
package services.spawn;

import java.util.Vector;

import resources.datatables.Options;
import resources.datatables.PvpStatus;

public class MobileTemplate {
	
	private Vector<String> templates;
	private int optionBitmask = Options.ATTACKABLE;
	private int pvpBitmask = PvpStatus.Attackable;
	private short level;
	private short minLevel;
	private short maxLevel;
	private Vector<String> attacks;
	private String defaultAttack;
	private int minDamage = 0;
	private int maxDamage = 0;
	private float attackSpeed = 0;
	private int weaponType = 0;
	private int difficulty = 0;
	private int health, action;
	private String creatureName;
	private float scale = 1;
	// this is a custom attack Range setting to use for large mobs like krayts
	private int attackRange;
	private Vector<String> weaponTemplates = new Vector<String>();
	private Vector<WeaponTemplate> weaponTemplateVector = new Vector<WeaponTemplate>();
	private int minSpawnDistance = 0;
	private int maxSpawnDistance = 0;
	private boolean deathblow = false;
	private String socialGroup; // see prima guide 
	private int assistRange; // use prima guide for ranges
	private boolean isStalker = false;
	
	public Vector<String> getTemplates() {
		return templates;
	}

	public void setTemplates(Vector<String> templates) {
		this.templates = templates;
	}

	public int getOptionBitmask() {
		return optionBitmask;
	}

	public void setOptionBitmask(int optionBitmask) {
		this.optionBitmask = optionBitmask;
	}

	public int getPvpBitmask() {
		return pvpBitmask;
	}

	public void setPvpBitmask(int pvpBitmask) {
		this.pvpBitmask = pvpBitmask;
	}

	public short getLevel() {
		return level;
	}

	public void setLevel(short level) {
		this.level = level;
	}

	public Vector<String> getAttacks() {
		return attacks;
	}

	public void setAttacks(Vector<String> attacks) {
		this.attacks = attacks;
	}

	public int getMinDamage() {
		return minDamage;
	}

	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public String getDefaultAttack() {
		return defaultAttack;
	}

	public void setDefaultAttack(String defaultAttack) {
		this.defaultAttack = defaultAttack;
	}

	public String getCreatureName() {
		return creatureName;
	}

	public void setCreatureName(String creatureName) {
		this.creatureName = creatureName;
	}

	public float getScale() {
		return scale;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}
	
	public Vector<String> getWeaponTemplates() {
		return weaponTemplates;
	}

	public void setWeaponTemplates(Vector<String> weaponTemplates) {
		this.weaponTemplates = weaponTemplates;
	}

	public float getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(float attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public int getWeaponType() {
		return weaponType;
	}

	public void setWeaponType(int weaponType) {
		this.weaponType = weaponType;
	}

	public Vector<WeaponTemplate> getWeaponTemplateVector() {
		return weaponTemplateVector;
	}

	public void setWeaponTemplateVector(Vector<WeaponTemplate> weaponTemplateVector) {
		this.weaponTemplateVector = weaponTemplateVector;
	}

	public int getMinSpawnDistance() {
		return minSpawnDistance;
	}

	public void setMinSpawnDistance(int minSpawnDistance) {
		this.minSpawnDistance = minSpawnDistance;
	}

	public int getMaxSpawnDistance() {
		return maxSpawnDistance;
	}

	public void setMaxSpawnDistance(int maxSpawnDistance) {
		this.maxSpawnDistance = maxSpawnDistance;
	}

	public short getMinLevel() {
		return minLevel;
	}

	public void setMinLevel(short minLevel) {
		this.minLevel = minLevel;
	}

	public short getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(short maxLevel) {
		this.maxLevel = maxLevel;
	}

	public boolean isDeathblow() {
		return deathblow;
	}

	public void setDeathblow(boolean deathblow) {
		this.deathblow = deathblow;
	}

	public String getSocialGroup() {
		return socialGroup;
	}

	public void setSocialGroup(String socialGroup) {
		this.socialGroup = socialGroup;
	}

	public int getAssistRange() {
		return assistRange;
	}

	public void setAssistRange(int assistRange) {
		this.assistRange = assistRange;
	}

	public boolean isStalker() {
		return isStalker;
	}

	public void setStalker(boolean isStalker) {
		this.isStalker = isStalker;
	}
}
