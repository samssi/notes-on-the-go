package fi.samssi.notesongo.service

import fi.samssi.notesongo.domain.Note

trait NoteRepository {
  def update(note: Note)
  def select(userId: String): Note
}
