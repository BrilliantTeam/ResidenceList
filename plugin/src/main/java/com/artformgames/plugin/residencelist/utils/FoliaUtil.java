package com.artformgames.plugin.residencelist.utils;

import org.bukkit.entity.Entity;
import org.bukkit.plugin.Plugin;

public class FoliaUtil {
    public static boolean isFolia;
    static {
        try {
            Class.forName("io.papermc.paper.threadedregions.RegionizedServer");
            isFolia = true;
        } catch (ClassNotFoundException e) {
            isFolia = false;
        }
    }

    private static Plugin plugin;
    public static void init(Plugin plugin) {
        FoliaUtil.plugin = plugin;
    }

    public static void runEntity(Entity entity, Runnable runnable) {
        entity.getScheduler().run(plugin, (ignored) -> runnable.run(), null);
    }
}
