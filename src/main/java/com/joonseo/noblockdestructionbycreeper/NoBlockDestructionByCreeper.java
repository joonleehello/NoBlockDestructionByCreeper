package com.joonseo.noblockdestructionbycreeper;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoBlockDestructionByCreeper extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("The creeper will not destruct blocks anymore.");

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    @EventHandler
    public void NoDestructionByCreeperExplosion(EntityExplodeEvent e){

        if(e.getEntityType() == EntityType.CREEPER){

            e.blockList().clear();
        }
    }
}
