package org.example.pony;

public record ComicsStoryResponse(int status, List<ComicStory> data) {
}

/*
{
  "status": 200,
  "data": [
    {
      "id": 7,
      "name": "Reflections",
      "series": "My Little Pony: Friendship is Magic",
      "image": "https://vignette.wikia.nocookie.net/mlp/images/6/6f/IDW_comics_issue_18-19_combined.png/revision/latest?cb=20140219194058",
      "url": "https://mlp.fandom.com/wiki/Reflections",
      "writer": "Katie Cook\nMatt Anderson (#19 pp. 26-29)",
      "artist": "Andy Price\nKatie Cook (#17 pp. 23-24, #18 pp. 23-24, #19 pp. 23-24, #20 pp. 24-25)\nAntonio Campo (#19 pp. 26-29)",
      "colorist": "Heather Breckel\nDiego Rodriguez (#19 pp. 26-29)",
      "letterer": "Neil Uyetake\nTom B. Long (#19 pp. 26-29)",
      "editor": "Bobby Curnow",
      "issue": [
        17,
        18,
        19,
        20
      ]
    }
  ]
}
 */