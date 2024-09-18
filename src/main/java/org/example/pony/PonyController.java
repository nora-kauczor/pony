package org.example.pony;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/pony")
public class PonyController {

    private final PonyService ponyService;

    @GetMapping
    public List<Pony> getAllPonies() {
        return ponyService.getAllPonies();
    }

    @GetMapping("/{id}")
    public Pony getPony(@PathVariable int id) {
        return ponyService.getPony(id);
    }

    @GetMapping("/episode/{id}")
    public Episode getEpisode(@PathVariable int id) {
        return ponyService.getEpisode(id);
    }




}
