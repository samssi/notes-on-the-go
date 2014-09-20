package fi.samssi.notesongo.servlet

import org.scalatra.{Ok, ScalatraServlet}
import com.google.inject.Inject
import fi.samssi.notesongo.service.NoteService

class NoteServlet @Inject()(noteService: NoteService) extends ScalatraServlet {
  get("/:userId") {
    Ok(noteService.findNoteFor(params("userId")))

  }
}
