package org.example.pony;

import java.util.List;

public record SongResponse(List<Song> data) {
}
/*
"data": [
  {
    "id": 21,
    "name": "Find A Pet Song",
    "video": "https://youtube.com/watch?v=eutPvpczpLY",
    "length": "00:03:40",
    "url": "https://mlp.fandom.com/wiki/Find_A_Pet_Song",
    "episode": "May the Best Pet Win!",
    "musicby": "Daniel Ingram\nSteffan Andrews (orchestration)",
    "lyricsby": "Charlotte Fullerton\nKevin Rubio",
    "keysignature": "D-flat major\nB major"
  }
]

 */