package fhj.swengb.avatarix


import javafx.geometry.Insets
import javafx.scene.effect.DropShadow
import javafx.scene.input.MouseEvent
import javafx.event.EventHandler
import java.net.URL
import java.util.ResourceBundle
import javafx.application.Application
import javafx.fxml.{FXML, FXMLLoader, Initializable}
import javafx.scene.image.{Image, ImageView}
import javafx.scene.layout.{AnchorPane, GridPane, HBox, BorderPane}
import javafx.scene.shape.Line
import javafx.scene.text.Text
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

import fhj.swengb.{Students, Speakers}

import scala.collection.mutable.Map
import scala.util.control.NonFatal

object Avatarix {
  def main(args: Array[String]) {
    Application.launch(classOf[Avatarix], args: _*)

    /*
    Zugriff auf Parser

      ** List[Student]erzeugen - wird für beide Funktionen als Übergabeparameter benötigt
      *  .studentsX liefert List[Student] der jeweiligen Gruppe

      ParserFunctions.students
      ParserFunctions.students1
      ParserFunctions.students2
      ParserFunctions.students3

      ** getData -> Parsed erste Infos
      * Übergabeparameter List[Students]

      ParserFunctions.getData(students)

      ** getStudentData -> parsed zusätzliche Infos
      * Übergabeparameter List[Students] und x[String] = githubusername

      ParserFunctions.getStudentData(students,x)

    */

  }
}

class Avatarix extends javafx.application.Application {


  val Fxml = "/fhj/swengb/avatarix/Gruppe2AvatarixGUI.fxml"
  val Css = "fhj/swengb/avatarix/Gruppe2Avatarix.css"

  val loader = new FXMLLoader(getClass.getResource(Fxml))

  override def start(stage: Stage): Unit =
    try {
      stage.setTitle("Avatarix")
      loader.load[Parent]() // side effect
      val scene = new Scene(loader.getRoot[Parent])
      stage.setScene(scene)
      stage.getScene.getStylesheets.add(Css)
      stage.show()
    } catch {
      case NonFatal(e) => e.printStackTrace()
    }

}


class AvatarixController extends Initializable {
  @FXML var border_pane: BorderPane = _
  @FXML var main_pane : AnchorPane = _
  @FXML var grid_pane : GridPane = _
  @FXML var gitHubUser : Text = _
  @FXML var githublink : Text = _
  @FXML var vorname : Text = _
  @FXML var nachname : Text = _
  @FXML var follower : Text = _
  @FXML var following : Text = _
  @FXML var small_image_view: ImageView = _

  val dropShadow = new DropShadow()


  override def initialize(location: URL, resources: ResourceBundle): Unit = {
    grid_pane.setPadding(new Insets(-25,-20,-25,-20))
    pictureLoader()
  }


  val effect: EventHandler[_ >: MouseEvent] = new EventHandler[MouseEvent] {
    override def handle(event: MouseEvent): Unit = {
      event.getSource match {
        case hoover: ImageView if hoover.getEffect == null => hoover.setEffect(dropShadow)
        case exit: ImageView if exit.getEffect != null => exit.setEffect(null)
        case _ => assert(false)
      }
    }
  }


  val mouseEventHandler: EventHandler[_ >: MouseEvent] = new EventHandler[MouseEvent] {

    override def handle(event: MouseEvent): Unit = {
      event.getSource match {
        case onClick: ImageView => {

          gitHubUser.setText(onClick.getId())

          for (student <- loadData) {
            if (student._1 == onClick.getId()) {
              vorname.setText(student._2(0))
              nachname.setText(student._2(1))
              githublink.setText(student._2(4))
              follower.setText(student._2(7))
              following.setText(student._2(5))
              small_image_view.setImage(new Image(student._2(3)))
            }
          }
        }

        case _ => assert(false)
      }
    }
  }

  // load the data (map) of the group into a variable to increase performance and to not parse every time
  // change here the ending ".students<groupNumber>" to get another group loaded
  var loadData: Map[String,List[String]] = ParserFunctions.getData(ParserFunctions.students2)


  def pictureLoader(): Unit = {
    var gridRow = 0
    var gridColumn = 0
    for (i <- loadData) {
      val iv: ImageView = new ImageView()
      iv.setImage(new Image(i._2(3)))
      //sets the size of every ImageView
      iv.setFitHeight(120)
      iv.setFitWidth(120)

      grid_pane.add(iv, gridColumn, gridRow)

      if (gridColumn == 3) {
        gridRow += 1
        gridColumn = 0
      }
      else gridColumn += 1

      //sets the Id for every picture to the GitHubUserName
      iv.setId(i._1)
      //caches the images to improve the performance
      iv.setCache(true)

      //for every image --> call the mouseEventHandler
      iv.setOnMouseClicked(mouseEventHandler)
      //for every image --> call and set effects while hoovering and exiting
      iv.setOnMouseEntered(effect)
      iv.setOnMouseExited(effect)
    }

  }

}
