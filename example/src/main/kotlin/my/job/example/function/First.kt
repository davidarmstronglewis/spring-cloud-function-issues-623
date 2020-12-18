package my.job.example.function

import java.util.function.Supplier
import org.springframework.stereotype.Component

@Component
class First : Supplier<String> {

    override fun get() =
        "This is the function we'd actually want to run"

}
