package study.theory.lambda

interface EventListener {
    fun click()
}

class Form{
    fun clickJava(e: EventListenerJava) {}
    fun clickKotlin(e: EventListener) {}
}

class Main {
    fun main() {
        Form().clickJava { }
        Form().clickKotlin(object : EventListener {
            override fun click() {
            }
        })
    }

}

