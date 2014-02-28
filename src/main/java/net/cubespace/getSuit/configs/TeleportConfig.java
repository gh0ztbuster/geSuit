package net.cubespace.getSuit.configs;

import net.cubespace.getSuit.BungeeSuite;
import net.cubespace.Yamler.Config.Config;

import java.io.File;

public class TeleportConfig extends Config {
    public TeleportConfig() {
        CONFIG_FILE = new File(BungeeSuite.instance.getDataFolder(), "teleport.yml");
    }

    public Integer TeleportRequestExpireTime = 10;
}