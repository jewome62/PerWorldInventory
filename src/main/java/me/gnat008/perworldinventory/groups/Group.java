/*
 * Copyright (C) 2014-2015  Gnat008
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.gnat008.perworldinventory.groups;

import org.bukkit.GameMode;

import java.util.List;

public class Group {

    private String name;
    private List<String> worlds;
    private GameMode gameMode;

    public Group(String name, List<String> worlds, GameMode gameMode) {
        this.name = name;
        this.worlds = worlds;
        this.gameMode = gameMode;
    }

    public GameMode getGameMode() {
        return this.gameMode;
    }

    public List<String> getWorlds() {
        return this.worlds;
    }

    public String getName() {
        return this.name;
    }

    public boolean containsWorld(String world) {
        return this.worlds.contains(world);
    }

    public void addWorlds(List<String> worlds) {
        for (String world : worlds)
            if (!this.worlds.contains(world))
                this.worlds.add(world);
    }

    public void addWorld(String world) {
        this.worlds.add(world);
    }
}
