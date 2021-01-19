package io.pivotal.pal.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class PalTrackerApplication {

    @Autowired
    private TimeEntryController timeEntryController;

    @Bean
    public TimeEntryController getTimeEntryController() {

        return timeEntryController;
    }

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }
}