package helloworld

class MainController {

    def index() {
        render view:"../index", model:[myData:"some data"]
    }
}
