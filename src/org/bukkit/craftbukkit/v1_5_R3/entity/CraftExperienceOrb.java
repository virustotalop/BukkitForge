package org.bukkit.craftbukkit.v1_5_R3.entity;

import net.minecraft.entity.item.EntityXPOrb;

import org.bukkit.craftbukkit.v1_5_R3.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ExperienceOrb;
//import org.bukkit.craftbukkit.v1_5_R3.CraftServer;

public class CraftExperienceOrb extends CraftEntity implements ExperienceOrb {
    public CraftExperienceOrb(CraftServer server, EntityXPOrb entity) {
        super(server, entity);
    }

    public int getExperience() {
        return getHandle().getXpValue();
    }

    public void setExperience(int value) {
        getHandle().xpValue = value;
    }

    @Override
    public EntityXPOrb getHandle() {
        return (EntityXPOrb) entity;
    }

    @Override
    public String toString() {
        return "CraftExperienceOrb";
    }

    public EntityType getType() {
        return EntityType.EXPERIENCE_ORB;
    }
}
