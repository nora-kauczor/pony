package org.example.pony;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@RequiredArgsConstructor
@Service
public class PonyService {

    RestClient restClient;

    public PonyService(RestClient.Builder builder) {
        this.restClient = builder.baseUrl("http://ponyapi.net").build();
    }

    public PonyList getAllPonies() {
        PonyList response = this.restClient.get().uri("/v1/character/all").retrieve().body(PonyList.class);
        assert response != null;
        return response;
    }

    public Pony getPony(int id) {
        String uri = "v1/character/" + id;
        Pony response = this.restClient.get().uri(uri).retrieve().body(Pony.class);
        assert response != null;
        return response;
    }

    public Episode getEpisode(int id) {
        String uri = "v1/episode/" + id;
        Episode response = this.restClient.get().uri(uri).retrieve().body(Episode.class);
        assert response != null;
        return response;
    }

    public EpisodeList getSeasonsEpisodes(int season) {
        String uri = "v1/episode/" + season;
        EpisodeList response = this.restClient.get().uri(uri).retrieve().body(EpisodeList.class);
        assert response != null;
        return response;
    }
}
