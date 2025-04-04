package com.joonseo.noblockdestructionbycreeper;

import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoBlockDestructionByCreeper extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("크리퍼 폭발에 의한 블럭 파괴 방지 플러그인 활성화");

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void NoDestructionByCreeperExplosion(EntityExplodeEvent e){

        if(e.getEntityType() == EntityType.CREEPER){

            e.blockList().clear();
        }
    }
}
