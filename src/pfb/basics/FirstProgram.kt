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
        val shades = Array<Array<Int>>(3) {
            Array<Int>(3) {0}
        }
        shades[0][0] = 255
        shades[0][1] = 255
        shades[0][2] = 0
        shades[1][0] = 255
        shades[1][1] = 0
        shades[1][2] = 0
        shades[2][0] = 0
        shades[2][1] = 0
        shades[2][2] = 0

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