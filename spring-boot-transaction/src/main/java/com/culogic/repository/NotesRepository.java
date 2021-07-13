package com.culogic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.culogic.modal.Notes;
@Repository
public interface NotesRepository extends CrudRepository<Notes, Long>{
}