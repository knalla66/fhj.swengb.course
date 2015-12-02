package fhj.swengb.lectures.l06

import java.io.File
import java.net.URL
import java.util.ResourceBundle
import javafx.application.Application
import javafx.fxml.{FXML, FXMLLoader, Initializable}
import javafx.scene.control.{Label, ListView}
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

import fhj.swengb.SwengbJfxUtil

import scala.util.control.NonFatal

/**
  * An example for the usage of the listview class.
  */
object ListViewExample {
  def main(args: Array[String]) {
    Application.launch(classOf[ListViewExample], args: _*)
  }
}

/**
  * Load the controller using fxml.
  */
class ListViewExample extends javafx.application.Application {

  val Fxml = "/fhj/swengb/lectures/l06/ListViewExample.fxml"

  val loader = new FXMLLoader(getClass.getResource(Fxml))

  override def start(stage: Stage): Unit =
    try {
      stage.setTitle("ListViewExample")
      loader.load[Parent]()
      val scene = new Scene(loader.getRoot[Parent])
      stage.setScene(scene)
      stage.show()
    } catch {
      case NonFatal(e) => e.printStackTrace()
    }

}


class ListViewExampleController extends Initializable {

  @FXML var listView: ListView[File] = _
  @FXML var fileSizeLabel: Label = _

  // converts connection classes?
  val observableFiles = SwengbJfxUtil.mkObservableList(
    new File(".").listFiles()
  )

  def selectFile(oldFile: File, newFile: File): Unit = {
    fileSizeLabel.setText(newFile.length().toString)
  }

  override def initialize(location: URL, resources: ResourceBundle): Unit = {
    // listView darf nicht leer sein --> Kontrollfunktion wenn der GUI planer den namen geändert hat
    //assert(listView != null)
    listView.setItems(observableFiles)
    listView.getSelectionModel.selectedItemProperty.addListener(SwengbJfxUtil.onChange(selectFile))
    listView.setCellFactory(SwengbJfxUtil.mkListCellFactory(SwengbJfxUtil.show {
      case f if f.isDirectory => "[DIR] " + f.getName
      case f => f.getName
    }))
  }

}
// AddListener - if a new alement is clicked this function will be fired
// the swengbJfxUtil.show () Takes a file and returns a string
// How to convert the Product (DBTool) in a String