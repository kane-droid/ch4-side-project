package spring.game.Items;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;


public class Item {


    private String name;
    private String description;
    private long healthModifier;
    private long attackModifier;
    private long defenseModifier;

    public Item() {
    }

    public Item(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getHealthModifier() {
        return healthModifier;
    }

    public void setHealthModifier(long healthModifier) {
        this.healthModifier = healthModifier;
    }

    public long getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(long attackModifier) {
        this.attackModifier = attackModifier;
    }

    public long getDefenseModifier() {
        return defenseModifier;
    }

    public void setDefenseModifier(long defenseModifier) {
        this.defenseModifier = defenseModifier;
    }

}
