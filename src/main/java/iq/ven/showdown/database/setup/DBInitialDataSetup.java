package iq.ven.showdown.database.setup;

import iq.ven.showdown.database.ArmorEntity;
import iq.ven.showdown.database.HeroArchetypeEntity;
import iq.ven.showdown.database.WeaponEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 25.03.2017.
 */
public class DBInitialDataSetup {

    private SessionFactory sessionFactory;

    public DBInitialDataSetup(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public void createInstantialData() {

        List<HeroArchetypeEntity> heroarch = getHeroArchList();
        List<WeaponEntity> weapon = getWeaponList();
        List<ArmorEntity> armor = getArmorList();

        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction(); // begin transaction

            for (Iterator<ArmorEntity> iterator = armor.iterator(); iterator.hasNext(); ) {
                ArmorEntity next = iterator.next();
                session.save(next);
            }
            for (Iterator<WeaponEntity> iterator = weapon.iterator(); iterator.hasNext(); ) {
                WeaponEntity next = iterator.next();
                session.save(next);
            }
            for (Iterator<HeroArchetypeEntity> iterator = heroarch.iterator(); iterator.hasNext(); ) {
                HeroArchetypeEntity next = iterator.next();
                session.save(next);
            }


            session.getTransaction().commit();// commit transaction
        } finally {
            session.close(); // better use in finally block
            //System.exit(1488);
        }
    }

    private List<HeroArchetypeEntity> getHeroArchList() {
        List<HeroArchetypeEntity> heroArchList = new ArrayList<>();

        HeroArchetypeEntity heroArchPlaceholder = new HeroArchetypeEntity();
        heroArchPlaceholder.setName("The mighty placeholder hero");
        heroArchPlaceholder.setImgLink("http://i.imgur.com/CGLROZC.jpg"); //placeholder
        heroArchList.add(heroArchPlaceholder);

        HeroArchetypeEntity soldier69 = new HeroArchetypeEntity();
        soldier69.setName("Солдат 69");
        soldier69.setImgLink("http://i.imgur.com/2zEcAuR.png");
        heroArchList.add(soldier69);

        HeroArchetypeEntity tadlos96 = new HeroArchetypeEntity();
        tadlos96.setName("Тадлос 96");
        tadlos96.setImgLink("http://i.imgur.com/LeWCFhw.png");
        heroArchList.add(tadlos96);

        HeroArchetypeEntity vladislavKromberg = new HeroArchetypeEntity();
        vladislavKromberg.setName("Владислав Кромберг");
        vladislavKromberg.setImgLink("http://i.imgur.com/ktAnTx1.png");
        heroArchList.add(vladislavKromberg);

        HeroArchetypeEntity jasper = new HeroArchetypeEntity();
        jasper.setName("Джаспер");
        jasper.setImgLink("http://i.imgur.com/Q9J3Ee9.png");
        heroArchList.add(jasper);


        return heroArchList;
    }


    private List<WeaponEntity> getWeaponList() {
        List<WeaponEntity> weaponList = new ArrayList<>();

        WeaponEntity placeholderWeapon = new WeaponEntity();
        placeholderWeapon.setName("The mighty placeholder weapon");
        placeholderWeapon.setDmg(10);
        placeholderWeapon.setImgLink("http://i.imgur.com/NbzvoRd.jpg"); //placeholder
        weaponList.add(placeholderWeapon);


        WeaponEntity boardBrimHat = new WeaponEntity();
        boardBrimHat.setName("Kromberg's board-brim hat");
        boardBrimHat.setDmg(15);
        boardBrimHat.setImgLink("http://i.imgur.com/NbzvoRd.jpg"); //placeholder
        weaponList.add(boardBrimHat);

        WeaponEntity twoHandedShaurma = new WeaponEntity();
        twoHandedShaurma.setName("Two-handed shaurma");
        twoHandedShaurma.setDmg(20);
        twoHandedShaurma.setImgLink("http://i.imgur.com/NbzvoRd.jpg"); //placeholder
        weaponList.add(twoHandedShaurma);

        WeaponEntity sixtyNineFist = new WeaponEntity();
        sixtyNineFist.setName("Fist weapon 69");
        sixtyNineFist.setDmg(6 + 9);
        sixtyNineFist.setImgLink("http://i.imgur.com/NbzvoRd.jpg"); //placeholder
        weaponList.add(sixtyNineFist);

        WeaponEntity naziShuriken = new WeaponEntity();
        naziShuriken.setName("Veniq's special shuriken");
        naziShuriken.setDmg(14);
        naziShuriken.setImgLink("http://i.imgur.com/NbzvoRd.jpg"); //placeholder
        weaponList.add(naziShuriken);

        return weaponList;
    }

    private List<ArmorEntity> getArmorList() {
        List<ArmorEntity> armorList = new ArrayList<>();

        ArmorEntity placeholderArmor = new ArmorEntity();
        placeholderArmor.setName("The mighty placeholder armor");
        placeholderArmor.setArmorPercent(10);
        placeholderArmor.setHitPoints(150);
        placeholderArmor.setImgLink("http://i.imgur.com/xm2Bikw.jpg");//placeholder
        armorList.add(placeholderArmor);

        ArmorEntity suit = new ArmorEntity();
        suit.setName("Kromberg's suit");
        suit.setArmorPercent(20);
        suit.setHitPoints(130);
        suit.setImgLink("http://i.imgur.com/xm2Bikw.jpg");//placeholder
        armorList.add(suit);

        ArmorEntity adidas = new ArmorEntity();
        adidas.setName("Adidas pants");
        adidas.setArmorPercent(30);
        adidas.setHitPoints(100);
        adidas.setImgLink("http://i.imgur.com/xm2Bikw.jpg");//placeholder
        armorList.add(adidas);


        ArmorEntity puma = new ArmorEntity();
        puma.setName("Puma pants");
        puma.setArmorPercent(25);
        puma.setHitPoints(120);
        puma.setImgLink("http://i.imgur.com/xm2Bikw.jpg");//placeholder
        armorList.add(puma);

        ArmorEntity jeansAndNecklace = new ArmorEntity();
        jeansAndNecklace.setName("Jeans and $ necklace");
        jeansAndNecklace.setArmorPercent(60);
        jeansAndNecklace.setHitPoints(50);
        jeansAndNecklace.setImgLink("http://i.imgur.com/xm2Bikw.jpg");//placeholder
        armorList.add(jeansAndNecklace);


        return armorList;
    }

    ;

}
