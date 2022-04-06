package com.nelson131.itemplus;

import com.nelson131.itemplus.items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ItemPlus extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Enabled ItemPlus");
        ItemManager.init();
    }

    @Override
    public void onDisable() {
        System.out.println("Disabled ItemPlus");

    }
}
