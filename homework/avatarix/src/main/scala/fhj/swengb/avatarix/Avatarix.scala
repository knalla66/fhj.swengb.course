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
import scala.xml

<<<<<<< HEAD
import fhj.swengb.{Students, Speakers}
=======

import fhj.swengb.{Student, Speakers, Students}
>>>>>>> 911b0ecfb4e60884556b3d174a69c8138f3a0ff8

import scala.util.control.NonFatal

object Avatarix {
  def main(args: Array[String]) {
    Application.launch(classOf[Avatarix], args: _*)

<<<<<<< HEAD
    val x = Students.dkandlhofer.gitHubUser
    println("Login: " + x.login)
    println("Avatar_Url: " + x.avatarUrl.toString)
    println("HTML_Url: " + x.html.toString)
    println("Followers: " + x.foll)
    println("Following: " + x.fing)
    println("Followers URL: " + x.foll_url)
    println("Following URL: " + x.fing_url)
    println("created at: " + x.create)

    val login = x.login
    val foll = x.foll
    val fing = x.fing
    val create = x.create
    val dictionary = Map(login -> List(foll,fing,create))

    println(dictionary)
=======
    /*
    gibt uns eine Map von Studenten mit den Parametern: Key = UserID, Value = List(Firstname,Secondname, Githubusername, AvatarUrl)
    zur Auflistung aller Students als Overview
     */
    def getData(students:List[Student]):Map[String,List[String]] = {
      val data = Map[String,List[String]]()
      for(value <- students) {
        data += value.userId -> List(value.firstName,
          value.secondName,
          value.githubUsername,
          value.gitHubUser.avatarUrl.toString
          )
      }
      data
    }

      ** getData -> Parsed erste Infos
      * Übergabeparameter List[Students]

    /*
    gibt Detaildaten von ausgewählten Students in einer Liste zurück
    für Detailansicht
     */
    def getStudentData(students:List[Student],x:String):List[String] = {
      val res = Nil
      for(value <- students if(value.githubUsername == x)) {
          res ++ List(value.gitHubUser.html.toString,
            value.gitHubUser.fing.toString,
            value.gitHubUser.fing_url.toString,
            value.gitHubUser.foll.toString,
            value.gitHubUser.foll_url.toString,
            value.gitHubUser.create.toString)
      }
      res
    }

      ** getStudentData -> parsed zusätzliche Infos
      * Übergabeparameter List[Students] und x[String] = githubusername

      ParserFunctions.getStudentData(students,x)

    */

    val test1 = Map("fgraf" -> List("Felix", "Graf", "Graf-Carello", """https://avatars.githubusercontent.com/u/15038288?v=3"""),
      "ekarimova" -> List("Elza", "Karimova", "elsakarimova", """https://avatars.githubusercontent.com/u/15157578?v=3"""),
      "pkoerner" -> List("Paul", "Körner", "McKorleone", """https://avatars.githubusercontent.com/u/14877839?v=3"""),
      "thasenbichler" -> List("Timo", "Hasenbichler", "timoooo", """https://avatars.githubusercontent.com/u/15030831?v=3"""),
      "mfuchs" -> List("Michael", "Fuchs", "deKilla", """https://avatars.githubusercontent.com/u/4746687?v=3"""),
      "aschneider" -> List("Andreas", "Schneider", "Zerberuss", """https://avatars.githubusercontent.com/u/15108282?v=3"""),
      "jblazevic" -> List("Josip", "Blazevic", "jbtastic", """https://avatars.githubusercontent.com/u/15108227?v=3"""),
      "alichtenegger" -> List("Alexander", "Lichtenegger", "AlexanderLichtenegger", """https://avatars.githubusercontent.com/u/15108218?v=3"""),
      "cfuerbahs" -> List("Christoph", "Fürbahs", "furchr", """https://avatars.githubusercontent.com/u/12102333?v=3"""),
      "cherzog" -> List("Carina", "Herzog", "carinaher", """https://avatars.githubusercontent.com/u/15108186?v=3"""))
    //val test2 = Map()

    //println(students1)
    println(students2)
    println(students3)
    println(test1)

>>>>>>> 911b0ecfb4e60884556b3d174a69c8138f3a0ff8
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
<<<<<<< HEAD
<<<<<<< HEAD
    //val url: String = Speakers.rladstaetter.gitHubUser.avatarUrl.toString
    val url = Students.mknaller.gitHubUser.avatarUrl.toString
    seppl77.setCenter(new ImageView(new Image(url)))
=======
    val url: String = Students.dkandlhofer.gitHubUser.avatarUrl.toString
    //val url = Students.mfuchs.gitHubUser.avatarUrl.toString

    borderPane.setCenter(new ImageView(new Image(url)))
>>>>>>> fb8ff0a00dbecc8881e670186a7ea6d063e81342
=======
    //val url: String = Speakers.rladstaetter.gitHubUser.avatarUrl.toString
    //val url = Students.sleitner.gitHubUser.avatarUrl.toString
    //seppl77.setCenter(new ImageView(new Image(url)))
>>>>>>> 911b0ecfb4e60884556b3d174a69c8138f3a0ff8
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
