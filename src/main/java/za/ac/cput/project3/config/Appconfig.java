package za.ac.cput.project3.config;

import org.apache.felix.ipojo.configuration.Configuration;
import org.springframework.context.annotation.Bean;
import za.ac.cput.project3.CollectionImpl;
import za.ac.cput.project3.CollectionInterface;

/**
 * Created by tmoshasha on 04/27/2017.
 */
@Configuration
public class Appconfig {

    @Bean(name = "col")
    public CollectionInterface getCollectionInterface(){return new CollectionImpl();}
}
