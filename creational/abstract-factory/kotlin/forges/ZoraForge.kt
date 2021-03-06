package creational.abstractFactory.forges

import creational.abstractFactory.equipments.Armor
import creational.abstractFactory.equipments.Bow
import creational.abstractFactory.equipments.Spear
import creational.abstractFactory.equipments.Sword
import creational.abstractFactory.equipments.Shield


class ZoraForge : EquipmentForge {
    override fun forgeArmor(): Armor {
        return ZoraArmor()
    }

    override fun forgeSword(): Sword {
        return SilverLongSword()
    }

    override fun forgeSpear(): Spear {
        return SilverScaleSpear()
    }

    override fun forgeBow(): Bow {
        return SilverBow()
    }

    override fun forgeShield(): Shield {
        return SilverShield()
    }
}

class ZoraArmor : Armor {
    override fun displayName() = "Zora Armor, 25 defense"
    override fun defend(attackValue: Int): Int {
        val takenDamage = attackValue - 25
        return if (takenDamage > 0) takenDamage else 0
    }
}

class SilverShield : Shield {
    override fun displayName() = "Silver Shield, 20 defense"
    override fun block(attackValue: Int): Int {
        val takenDamage = attackValue - 20
        return if (takenDamage > 0) takenDamage else 0
    }
}

class SilverLongSword : Sword {
    override fun displayName() = "Silver Long Sword, 22 attack"
    override fun slash(): Int {
        return 22
    }
}

class SilverScaleSpear : Spear {
    override fun displayName() = "Silver Scale Spear, 12 attack"
    override fun spear(): Int {
        return 12
    }
}

class SilverBow : Bow {
    override fun displayName() = "Silver Bow, 15 attack"
    override fun shoot(): Int {
        return 15
    }
}