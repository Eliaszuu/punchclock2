package ch.axa.its.punchclock.repositories;

import ch.axa.its.punchclock.domain.Tag;
import org.springframework.data.repository.CrudRepository;

import ch.axa.its.punchclock.domain.Category;

public interface TagRepository extends CrudRepository<Tag, String> {
}