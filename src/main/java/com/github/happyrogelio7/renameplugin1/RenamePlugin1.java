package com.github.happyrogelio7.renameplugin1;

import org.bukkit.plugin.java.JavaPlugin;

public final class RenamePlugin1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("renameplugin1").setExecutor(new RenamePlugin1CMD(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
