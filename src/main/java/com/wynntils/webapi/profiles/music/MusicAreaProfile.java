/*
 *  * Copyright © Wynntils - 2020.
 */

package com.wynntils.webapi.profiles.music;

import com.wynntils.core.utils.objects.SquareRegion;

public class MusicAreaProfile {

    String id;
    String trackName;
    boolean ignoreTerritory;

    SquareRegion region;

    public MusicAreaProfile(String id, String trackName, boolean ignoreTerritory, SquareRegion region) {
        this.id = id;
        this.trackName = trackName;
        this.ignoreTerritory = ignoreTerritory;
        this.region = region;
    }

    public SquareRegion getRegion() {
        return region;
    }

    public String getId() {
        return id;
    }

    public String getTrackName() {
        return trackName;
    }

    public boolean isIgnoreTerritory() {
        return ignoreTerritory;
    }

}
