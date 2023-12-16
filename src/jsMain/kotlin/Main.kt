import org.w3c.fetch.Request;
import org.w3c.fetch.Response;
import org.w3c.fetch.ResponseInit;

fun fetch(req: Request): Response {
    val headers: dynamic = object {}

    headers["Content-Type"] = "text/plain"

    val body = "hi, kotlin/js?"

    return Response(body, ResponseInit(headers = headers))
}

fun main() {
    val addEventListener = js("addEventListener");

    addEventListener("fetch") { e ->
        e.respondWith(fetch(e.request as Request))
    }
}
