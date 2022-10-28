package com.example.quickstart.news;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/news")
public class NewsController {

    @GetMapping("/")
    public NewsResponse listOfNews() {
        return new NewsResponse(
                1,
                Arrays.asList(
                        new News(
                                0,
                                "en",
                                "en",
                                "Cristiano Ronaldo dropped for Manchester United's trip to Chelsea after leaving Tottenham game",
                                "Ronaldo walked down the Old Trafford touchline and up the tunnel before full-time whistle vs Spurs; he is now expected to train away from the first-team squad; watch Chelsea vs Man Utd live on Saturday Night Football from 5pm on Sky Sports Premier League; kick-off 5.30pm",
                                "22 October 2022"),
                        new News(
                                1,
                                "es",
                                "es",
                                "Karim Benzema: Real Madrid striker wins men's Ballon d'Or for first time",
                                "Benzema scored 44 goals in 46 matches last season for Real Madrid, who won LaLiga and the Champions League; Sadio Mane finished in second place while Kevin De Bruyne was third; Barcelona midfielder Gavi was given the Kopa Trophy as the best young player of the year\n" +
                                        "\n",
                                "22 October 2022"),
                        new News(
                                2,
                                "en",
                                "en",
                                "Arsenal: Do Mikel Arteta's Gunners have enough strength in depth to challenge for the Premier League title?",
                                        "Mikel Arteta's Arsenal are top of the table after nine wins from 10 matches; the Gunners play four more league games before the season breaks for the World Cup",
                                "21 October 2022"),
                        new News(
                                3,
                                "fr",
                                "fr",
                                "Neymar moves PSG clear at the top of Ligue 1",
                                "Neymar gives PSG the lead just before half-time\n" +
                                        "\n" +
                                        "PSG started with a blistering pace. First it was Lionel Messi who could have put the home side ahead with a double chance. Later, Achraf Hakimi had the chance. Kylian Mbappe put in an excellent cross from the left flank that left the winger alone in front of Pau Lopez, but the Spanish goalkeeper prevented the goal.",
                                "20 October 2022"),

                        new News(
                                4,
                                "it",
                                "it",
                                "AC Milan are interested in signing Armando Broja from Chelsea but he wasn’t the only player spoken about in a recent meeting with an intermediary, it is claimed.",
                                "Calciomercato.com reported yesterday that there have been several contacts between sporting director Ricky Massara and Broja’s entourage in recent weeks, while Milan also talked about striker with Chelsea, who consider him a €35m player even if they have not yet thought about a sale.",
                                "18 October 2022")
                )
        );
    }
}
