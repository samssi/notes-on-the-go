package fi.samssi.notesongo.servlet

import org.scalatra.{CorsSupport, Ok}
import com.google.inject.Inject
import fi.samssi.notesongo.service.NoteService
import fi.samssi.notesongo.domain.{Note, Result}

class NoteServlet @Inject()(noteService: NoteService) extends MasterServlet with CorsSupport {
  get("/:userId") {
    Ok(noteService.findNoteFor(params("userId")))
  }

  put("/") {
    val note = parsedBody.extract[Note]
    noteService.updateNote(note)
    Ok(Result("Success"))
  }
}
