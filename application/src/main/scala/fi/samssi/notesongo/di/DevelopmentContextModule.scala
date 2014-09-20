package fi.samssi.notesongo.di

import com.google.inject.AbstractModule
import fi.samssi.notesongo.service.{MockedNoteService, NoteService}

class DevelopmentContextModule extends AbstractModule {
  def configure() = {
    bind(classOf[NoteService]).to(classOf[MockedNoteService])
  }
}
