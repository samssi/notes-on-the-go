package fi.samssi.notesongo.servlet

import org.scalatra.Ok
import com.google.inject.Inject
import fi.samssi.notesongo.service.NoteService
import fi.samssi.notesongo.domain.{Note, Result}

class NoteServlet @Inject()(noteService: NoteService) extends MasterServlet {
  get("/:userId") {
    Ok(noteService.findNoteFor(params("userId")))
  }

  put("/") {
    val note = parsedBody.extract[Note]
    noteService.updateNote(note)
    Ok(Result("Success"))
  }
}
