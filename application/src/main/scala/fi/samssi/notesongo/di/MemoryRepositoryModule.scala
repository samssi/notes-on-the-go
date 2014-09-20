package fi.samssi.notesongo.di

import com.google.inject.AbstractModule
import fi.samssi.notesongo.service.{MapRepository, NoteRepository, RepositoryNoteService, NoteService}

class MemoryRepositoryModule extends AbstractModule {
  def configure() = {
    bind(classOf[NoteService]).to(classOf[RepositoryNoteService])
    bind(classOf[NoteRepository]).to(classOf[MapRepository])
  }
}
