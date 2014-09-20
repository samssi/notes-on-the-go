package fi.samssi.notesongo.service

import fi.samssi.notesongo.domain.Note

class MockedNoteService extends NoteService {
  def findNoteFor(userId: String) = Note(userId, "My mocked note", "Unfinished note...")
}
