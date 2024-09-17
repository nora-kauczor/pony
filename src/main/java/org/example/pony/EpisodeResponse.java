package org.example.pony;

public record EpisodeResponse(int id, String name, String image, int season, int episode, List<Song> song) {
}
