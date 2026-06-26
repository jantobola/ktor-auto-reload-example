package one.bitby.example

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    routing {
        get("/") {
            call.respondHtml {
                head {
                    title("Auto Reload Example")
                }
                body {
                    h1 { +"Hello page." }
                }
            }
        }
    }
}

