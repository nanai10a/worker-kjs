import org.w3c.fetch.Request;
import org.w3c.fetch.Response;
import org.w3c.fetch.ResponseInit;

@OptIn(ExperimentalJsExport::class)
@JsExport
fun fetch(req: Request): Response {
    val headers: dynamic = object {}

    headers["Content-Type"] = "text/plain"

    val body = "hi, kotlin/js?"

    return Response(body, ResponseInit(headers = headers))
}
