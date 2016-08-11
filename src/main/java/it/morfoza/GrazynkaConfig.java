package it.morfoza;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class GrazynkaConfig {

    @Bean(name="grazynka")
    public PaniZBiuraPodrozy grazynka() {
        ArrayList<Destination> allDestinations = new ArrayList<>();
        allDestinations.add(new Destination("Tajlandia", 215, 6500));
        allDestinations.add(new Destination("Białoruś", 59, 800));
        allDestinations.add(new Destination("Kanary", 249, 2800));
        return new Grazynka(allDestinations);
    }
}
