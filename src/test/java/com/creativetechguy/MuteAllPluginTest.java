package com.creativetechguy;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MuteAllPluginTest {
    public static void main(String[] args) throws Exception {
        ExternalPluginManager.loadBuiltin(MuteAllPlugin.class);
        RuneLite.main(args);
    }
}