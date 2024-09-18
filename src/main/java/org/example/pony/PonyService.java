package org.example.pony;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

//@RequiredArgsConstructor
@Service
public class PonyService {

    RestClient restClient;

    public PonyService(RestClient.Builder builder) {
        this.restClient = RestClient.create("https://ponyapi.net");
    }

    public List<Pony> getAllPonies() {
        PonyResponse response = this.restClient.get().uri("/v1/character/all")
                .retrieve().body(PonyResponse.class);
        assert response != null;
        return response.data();
    }

    public Pony getPony(int id) {
        String uri = "/v1/character/" + id;
        PonyResponse response = this.restClient.get().uri(uri).retrieve().body(PonyResponse.class);
        assert response != null;
        return response.data().get(0);
    }

    public Episode getEpisode(int id) {
        String uri = "v1/episode/" + id;
        EpisodeResponse response = this.restClient.get().uri(uri).retrieve().body(EpisodeResponse.class);
        assert response != null;
        return response.data().getFirst();
    }

    public ComicStory getComicStory(int id){
        String uri = "v1/comics-story/"+id;
        ComicsStoryResponse response = this.restClient.get().uri(uri).retrieve().body(ComicsStoryResponse.class);
        assert response != null;
        return response.data().getFirst();
    }

}
