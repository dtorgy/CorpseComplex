/*
 * Copyright (c) 2017. C4, MIT License
 */

package c4.corpsecomplex.common.helpers;

import net.minecraftforge.common.config.Property;

public class ConfigHelper {

    public static int getInt(String name, String category, int defaultInt, int min, int max, String comment, boolean requiresRestart) {
        Property prop = ModuleHelper.cfg.get(category, name, defaultInt, comment, min, max);
        prop.setRequiresMcRestart(requiresRestart);
        return prop.getInt(defaultInt);
    }

    public static double getDouble(String name, String category, double defaultDouble, float min, float max, String comment, boolean requiresRestart) {
        Property prop = ModuleHelper.cfg.get(category, name, defaultDouble, comment, min, max);
        prop.setRequiresMcRestart(requiresRestart);
        return prop.getDouble(defaultDouble);
    }

    public static boolean getBool(String name, String category, boolean defaultBool, String comment, boolean requiresRestart) {
        Property prop = ModuleHelper.cfg.get(category, name, defaultBool, comment);
        prop.setRequiresMcRestart(requiresRestart);
        return prop.getBoolean(defaultBool);
    }

    public static String getString(String name, String category, String defaultString, String comment, String[] validValues, boolean requiresRestart) {
        Property prop = ModuleHelper.cfg.get(category, name, defaultString, comment, validValues);
        prop.setRequiresMcRestart(requiresRestart);
        return prop.getString();
    }

    public static String[] getStringList(String name, String category, String[] defaultStringList, String comment, boolean requiresRestart) {
        Property prop = ModuleHelper.cfg.get(category, name, defaultStringList, comment);
        prop.setRequiresMcRestart(requiresRestart);
        return prop.getStringList();
    }
}