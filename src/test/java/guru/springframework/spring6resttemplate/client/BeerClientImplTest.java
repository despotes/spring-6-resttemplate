package guru.springframework.spring6resttemplate.client;

import guru.springframework.spring6resttemplate.model.BeerStyle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;


@SpringBootTest
class BeerClientImplTest {

    @Autowired
    BeerClientImpl beerClient;

    @Test
    void listBeersWithBeerStyle() {
        beerClient.listBeers("ALE", null, null, null, null);
    }

    @Test
    void listBeersNotBeerName() {
        beerClient.listBeers();
    }
}