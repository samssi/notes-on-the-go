package fi.samssi.notesongo.servlet

import org.scalatra.{Ok, ScalatraServlet}

class NoteServlet extends ScalatraServlet {
  get("/") {
    Ok("foo")
  }
}
