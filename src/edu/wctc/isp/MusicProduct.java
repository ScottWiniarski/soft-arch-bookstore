package edu.wctc.isp;

import java.time.Duration;

public interface MusicProduct extends UniversalProduct {
    String getArtist();
    Duration getPlayingTime();
}
