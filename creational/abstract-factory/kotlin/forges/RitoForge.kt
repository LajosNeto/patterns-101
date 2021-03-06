package creational.abstractFactory.forges

import creational.abstractFactory.equipments.Armor
import creational.abstractFactory.equipments.Bow
import creational.abstractFactory.equipments.Spear
import creational.abstractFactory.equipments.Sword
import creational.abstractFactory.equipments.Shield


class RitoForge : EquipmentForge {
    override fun forgeArmor(): Armor {
        return RitoArmor()
    }

    override fun forgeSword(): Sword {
        return FeatheredEdge()
    }

    override fun forgeSpear(): Spear {
        return FeatheredSpear()
    }

    override fun forgeBow(): Bow {
        return FalconBow()
    }

    override fun forgeShield(): Shield {
        return KiteShield()
    }
}

class RitoArmor : Armor {
    override fun displayName() = "Rito Armor, 25 defense"
    override fun defend(attackValue: Int): Int {
        val takenDamage = attackValue - 25
        return if (takenDamage > 0) takenDamage else 0
    }
}

class KiteShield : Shield {
    override fun displayName() = "Kite Shield, 20 defense"
    override fun block(attackValue: Int): Int {
        val takenDamage = attackValue - 20
        return if (takenDamage > 0) takenDamage else 0
    }
}

class FeatheredEdge : Sword {
    override fun displayName() = "Feathered Edge, 22 attack"
    override fun slash(): Int {
        return 22
    }
}

class FeatheredSpear : Spear {
    override fun displayName() = "Feathered Spear, 12 attack"
    override fun spear(): Int {
        return 12
    }
}

class FalconBow : Bow {
    override fun displayName() = "Falcon Bow, 15 attack"
    override fun shoot(): Int {
        return 15
    }
}