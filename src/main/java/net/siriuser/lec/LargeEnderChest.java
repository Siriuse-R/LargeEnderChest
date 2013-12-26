package net.siriuser.lec;

import net.syamn.utils.LogUtil;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class LargeEnderChest extends JavaPlugin {
    
    private static LargeEnderChest instance;
    
    @Override
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        
        PluginDescriptionFile pdfFile = this.getDescription();
        LogUtil.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!");
    }
    
    @Override
    public void onDisable() {
        getServer().getScheduler().cancelTasks(this);
        
        PluginDescriptionFile pdfFile = this.getDescription();
        LogUtil.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is disabled!");
    }
    
    public static LargeEnderChest getInstance() {
        return instance;
    }
}
