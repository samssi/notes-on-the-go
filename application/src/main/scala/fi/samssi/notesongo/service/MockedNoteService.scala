package fi.samssi.notesongo.service

import fi.samssi.notesongo.domain.Note

class MockedNoteService extends NoteService {
  val note = Note("foo@bar.com", "My mocked note", "Unfinished note...")

  def findNoteFor(userId: String) = note
}
