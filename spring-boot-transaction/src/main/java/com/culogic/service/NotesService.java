package com.culogic.service;
import java.util.List;
import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.culogic.modal.NoteBase;
import com.culogic.modal.Notes;
import com.culogic.modal.User;

@Service
public interface NotesService {
	public String addNote(Notes note) throws Exception;
}