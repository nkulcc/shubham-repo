package com.culogic.impl;
import java.util.List;

import javax.validation.Valid;

import com.culogic.modal.NoteBase;
import com.culogic.modal.Notes;
import com.culogic.modal.User;
import com.culogic.repository.NotesRepository;
import com.culogic.repository.UserRepository;
import com.culogic.service.NotesService;
import com.culogic.util.ApplicationConstants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesServiceImpl implements NotesService {
	private static final Logger log = LogManager.getLogger(NotesServiceImpl.class);

	@Autowired
	private NotesRepository noteRepository;

	@Override
	public String addNote(Notes note){
		log.info("Inside add note service");
		noteRepository.save(note);
		log.info("Successfully added new Note.");
		return ApplicationConstants.ADDED_NOTE_DESC;
	}
}
