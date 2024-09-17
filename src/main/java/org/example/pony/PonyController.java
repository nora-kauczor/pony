package org.example.pony;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/pony")
public class PonyController {

    PonyService ponyService;

    @GetMapping
    public PonyList getAllPonies() {
        return ponyService.getAllPonies();
    }

    @GetMapping("/{id}")
    public Pony getPony(@RequestParam int id) {
        return ponyService.getPony(id);
    }

    @GetMapping("/episodes/{season}")
    public EpisodeList getSeasonsEpisodes(@PathVariable int season) {
        return ponyService.getSeasonsEpisodes(season);
    }


}
