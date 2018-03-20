package id.wiryawan.restapi.repository;

import id.wiryawan.restapi.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
