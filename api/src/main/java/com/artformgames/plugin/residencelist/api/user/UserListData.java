package com.artformgames.plugin.residencelist.api.user;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

import java.util.List;

public interface UserListData {

    @Unmodifiable
    @NotNull List<String> getPinned();

    void setPin(@NotNull String residence, int index);

    default void removePin(@NotNull String residence) {
        setPin(residence, -1);
    }

}
