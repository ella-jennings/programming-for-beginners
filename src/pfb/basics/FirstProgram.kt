package pfb.basics

import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.image.Image
import javafx.stage.Stage
import java.io.FileInputStream

fun main(args: Array<String>) {
    FirstProgram().doLaunch(args)
}
class FirstProgram : Application() {

    fun tileColors() :  Array<Array<Int>> {
        val shades = Array<Array<Int>>(8) {
            Array<Int>(8) {0}
        }

        for (row in 0..7) {
            for (col in 0..7) {
                if(col == 0 || col == 2 || row == 0 || row == 2) {
                    shades[row][col] = 0
                } else {
                    shades[row][col] = 255
                }
            }
        }
        return shades
    }

    override fun start(primaryStage: Stage) {
        val tiler = Tiler(tileColors())
        val canvas = tiler.setUpPicture()
        val root = Group(canvas)
        val scene = Scene(root)
        primaryStage.scene = scene
        primaryStage.show()
        val icon = Image(FileInputStream("./src/pfb/basics/icon.png"))
        primaryStage.icons.add(icon)
        primaryStage.title = "Basics"
    }

    fun doLaunch(args: Array<String>) {
        Application.launch(*args)
    }

    override fun init() {

        super.init()
    }
}