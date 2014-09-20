package fi.samssi.notesongo.service

import fi.samssi.notesongo.domain.Note

class MockedNoteService extends NoteService {
  def findNoteFor(userId: String) = Note(userId, "Unfinished note...")

  def updateNote(note: Note) = {println(s"Updated note with $note")}
}
