package org.example.pony;

import java.util.List;

public record Episode(int id, String name, String image,
                      int season, int episode,
                      List<Song> song) {
}
