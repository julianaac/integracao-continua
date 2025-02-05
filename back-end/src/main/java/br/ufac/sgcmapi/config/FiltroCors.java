package br.ufac.sgcmapi.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class FiltroCors {

    @Bean
    public CorsFilter corsFilter() {

        CorsConfiguration corsConfig = new CorsConfiguration();
        corsConfig.setAllowCredentials(true);
        corsConfig.setAllowedOrigins(
            Arrays.asList(
                "http://127.0.0.1:5500",
                "https://localhost:4200", 
                "https://sgcm-julianaabreu.up.railway.app",
                "https://sgcm-julianaabreu-front2-production.up.railway.app",
                "https://sgcm-julianaabreu-front-production.up.railway.app",
                "https://sgcmapp-juliana.netlify.app")
        );
        corsConfig.setAllowedMethods(Arrays.asList("*"));
        corsConfig.setAllowedHeaders(Arrays.asList("*"));

        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", corsConfig);

        return new CorsFilter(configSource);


    }
    
}
