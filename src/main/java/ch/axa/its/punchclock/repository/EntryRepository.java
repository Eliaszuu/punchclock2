package ch.axa.its.punchclock.repository;

import org.springframework.data.repository.CrudRepository;

import ch.axa.its.punchclock.domain.Entry;

public interface EntryRepository extends CrudRepository<Entry, String> {
}