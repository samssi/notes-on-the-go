package fi.samssi.notesongo.service

import fi.samssi.notesongo.domain.Note
import scala.collection.mutable.Map

class MapRepository extends NoteRepository {
  val fooUser = "foo"
  val noteRepository = Map[String, Note](fooUser -> Note(fooUser, "Unfinished note..."))

  def update(note: Note) {
    noteRepository += (note.userId -> note)
  }

  def select(userId: String) = {
    noteRepository.get(userId) match {
      case Some(note) => note
      case None => Note(userId, "")
    }
  }
}
