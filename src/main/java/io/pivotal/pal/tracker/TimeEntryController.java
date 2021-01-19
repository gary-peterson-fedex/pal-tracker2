package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

public class TimeEntryController{
    private TimeEntryRepository repository;

    public TimeEntryController(TimeEntryRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<TimeEntry> create(@RequestBody TimeEntry timeEntryToCreate) {
        return created(null)
                .body(repository.create(timeEntryToCreate));
    }

    public ResponseEntity<TimeEntry> update(@PathVariable long id, @RequestBody TimeEntry timeEntry) {
        var timeEntryUpdated = repository.update(id, timeEntry);

        return timeEntryUpdated == null ?
                notFound().build() :
                ok(timeEntryUpdated);
    }

    public ResponseEntity<List<TimeEntry>> list() {
        return ok(repository.list());
    }

    public ResponseEntity<TimeEntry> read(@PathVariable long id) {
        var timeEntryFound = repository.find(id);

        return timeEntryFound == null ?
                notFound().build() :
                ok(timeEntryFound);
    }

    public ResponseEntity<Void> delete(@PathVariable long id) {
        repository.delete(id);

        return noContent().build();
    }
}