package fi.samssi.notesongo.service

import fi.samssi.notesongo.domain.Note

trait NoteService {
  def findNoteFor(userId: String): Note
}
