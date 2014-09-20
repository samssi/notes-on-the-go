package fi.samssi.notesongo.service

import fi.samssi.notesongo.domain.Note
import com.google.inject.Inject

class RepositoryNoteService @Inject()(noteRepository: NoteRepository) extends NoteService {

  def findNoteFor(userId: String) = noteRepository.select(userId)

  def updateNote(note: Note) = noteRepository.update(note)
}
