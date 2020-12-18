package my.job.example.function

import java.util.function.Supplier
import org.springframework.stereotype.Component

// TODO: Comment to break this application
@Component
class Second : Supplier<String> {

    override fun get(): String =
        "This function is necessary to avoid an exception loop at start"

}
