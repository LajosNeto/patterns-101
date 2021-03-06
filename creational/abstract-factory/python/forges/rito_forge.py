"""
Abstract Factory design pattern implementation.
This example illustrates the usage of the abstract factory design pattern.

Implements the Rito Forge, a concrete implementation of a forge.
"""

# Author: 
# Lajos Neto <lajosneto@gmail.com>


from __future__ import annotations
from abc import ABC, abstractmethod

from .forge_factory import ForgeFactory
from equipments import Armor, Sword, Spear, Bow, Shield


class RitoForge(ForgeFactory):
    
    def forge_armor(self):
        return RitoArmor()
    
    def forge_sword(self):
        return FeatheredEdge()
    
    def forge_spear(self):
        return FeatheredSpear()
    
    def forge_bow(self):
        return FalconBow()
    
    def forge_shield(self):
        return KiteShield()

class RitoArmor(Armor):
    """
    Rito armor variant
    """
    def display_name(self):
        return "Rito Armor, 25 defense"

    def defend(self, attack):
        defense_rate = attack - 25
        return defense_rate if defense_rate > 0 else 0

class KiteShield(Shield):
    """
    Rito shield variant
    """
    def display_name(self):
        return "Kite Shield, 14 defense"

    def block(self, attack):
        block_rate = attack - 14
        return block_rate if block_rate > 0 else 0

class FeatheredEdge(Sword):
    """
    Rito sword variant
    """
    def display_name(self):
        return "Feathered Edge, 15 attack"

    def slash(self):
        return 15

class FeatheredSpear(Spear):
    """
    Rito spear variant
    """
    def display_name(self):
        return "Feathered Spear, 10 attack"

    def pierce(self):
        return 10

class FalconBow(Bow):
    """
    Rito bow variant
    """
    def display_name(self):
        return "Falcon Bow, 16 attack"

    def shoot(self):
        return 16