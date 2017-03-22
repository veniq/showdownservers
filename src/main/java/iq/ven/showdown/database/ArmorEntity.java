package iq.ven.showdown.database;

import iq.ven.showdown.fighting.model.Armor;

import javax.persistence.*;

/**
 * Created by User on 21.03.2017.
 */
@Entity(name = "armor")
public class ArmorEntity implements Armor {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "hp", nullable = false)
    private int hitPoints;
    @Column(name = "dodge", nullable = false)
    private int dodgePercent;
    @Column(name = "armor", nullable = false)
    private int armorPercent;


    public ArmorEntity() {
    }

    public ArmorEntity(String name, int hitPoints, int dodgePercent, int armorPercent) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.dodgePercent = dodgePercent;
        this.armorPercent = armorPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDodgePercent() {
        return dodgePercent;
    }

    public void setDodgePercent(int dodgePercent) {
        this.dodgePercent = dodgePercent;
    }

    public int getArmorPercent() {
        return armorPercent;
    }

    public void setArmorPercent(int armorPercent) {
        this.armorPercent = armorPercent;
    }
}
