package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {
  def main(): Unit = {
      jQuery(setupUI _)

    //println("Hello world!")
    jQuery("body").append("<p>Hello my friend</p>")
  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }

  def setupUI(): Unit = {
    jQuery("""<button type="button">Click me!</button>""").click(addClickedMessage _).appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello World</p>")
  }

}