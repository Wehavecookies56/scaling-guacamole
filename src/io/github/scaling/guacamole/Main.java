package io.github.scaling.guacamole;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Toby on 19/05/2016.
 */


public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        public static String VERSION;
        public static String MOD_NAME;
        public static String[] AUTHORS;

        AUTHORS[0] = "Toby Wishart"; //Sorry for spelling! - L
        AUTHORS[1] = "Lloyd Walker";

        if (!Bukkit.getPluginManager().isPluginEnabled("scaling-guacamole")) {
            getLogger().severe("*** scaling-guacamole is not installed or not enabled. ***");
            getLogger().severe("*** This plugin will be disabled. ***");
            this.setEnabled(false);
            return;

        }

    }

    @Override
    public void onDisable() {

    }


}
