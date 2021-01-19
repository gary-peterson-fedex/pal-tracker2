package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

public class TimeEntryController{
    private TimeEntryRepository repository;

    public TimeEntryController(TimeEntryRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity create(TimeEntry timeEntry){
        return null;
    }

    public ResponseEntity update(long id, TimeEntry timeEntry){
        
        return null;
    }

    public ResponseEntity list(){
        return null;
    }

    public ResponseEntity read(long id){
        return null;
    }

    public ResponseEntity delete(long id){
        return null;
    }
}