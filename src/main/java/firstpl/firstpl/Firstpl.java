package firstpl.firstpl;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Firstpl extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World!");

        Bukkit.getPluginManager().registerEvents(new decoxp(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Goodbye World!");
    }
}
