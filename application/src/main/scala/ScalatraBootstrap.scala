import com.google.inject.{Guice, Injector}
import fi.samssi.notesongo.di.MemoryRepositoryModule
import fi.samssi.notesongo.servlet.NoteServlet
import javax.servlet.ServletContext
import org.scalatra.LifeCycle

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) = {
    val injector = createInjector()
    context.mount(injector.getInstance(classOf[NoteServlet]), "/note")
  }

  private def createInjector(): Injector = {
    Guice.createInjector(new MemoryRepositoryModule())
  }
}
