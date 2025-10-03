package com.artformgames.plugin.residencelist.utils;

import com.bekvon.bukkit.residence.Residence;
import com.bekvon.bukkit.residence.protection.ClaimedResidence;

import java.util.UUID;

public class ResidenceUtils {
    private static final UUID TEMP_UUID = UUID.fromString("ffffffff-ffff-ffff-ffff-ffffffffffff");

    public static boolean isServerLand(ClaimedResidence residence) {
        return residence.getOwnerUUID() == null
                || TEMP_UUID.equals(residence.getOwnerUUID())
                || Residence.getInstance().getServerUUID().equals(residence.getOwnerUUID());
    }

}