package kotl.oop.abstract_classes

class Sportsmen {
    fun callVodonos(vodonos: Vodonos){
        vodonos.prinestiVodu()
    }

    inline fun callVodonos(prinestiVodu: () -> Unit){
        prinestiVodu()
    }
}