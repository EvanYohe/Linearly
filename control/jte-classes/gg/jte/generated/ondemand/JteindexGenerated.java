package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {32,32,32,32,32,32,32,57,68,68,68,68,68,68};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("<!doctype html>\r\n<html lang=\"en\">\r\n\r\n<head th:fragment=\"head\">\r\n    <meta charset=\"utf-8\" />\r\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n    <title>Demo</title>\r\n    <meta name=\"description\" content=\"\" />\r\n    <meta name=\"viewport\" content=\"width=device-width\" />\r\n    <base href=\"/\" />\r\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"/webjars/bootstrap/dist/css/bootstrap.min.css\" />\r\n    <script type=\"importmap\">\r\n        {\r\n            \"imports\": {\r\n                \"bootstrap\": \"/npm/bootstrap\",\r\n                \"@popperjs/core\": \"/npm/@popperjs/core\",\r\n                \"htmx\": \"/webjars/htmx.org/1.6.0/dist/htmx.js\"\r\n            }\r\n        }\r\n    </script>\r\n    <script type=\"module\">\r\n        import 'bootstrap';\r\n        import '@popperjs/core';\r\n        import 'htmx';\r\n    </script>\r\n    <script src=\"/webjars/htmx.org/1.6.0/dist/htmx.js\"></script>\r\n</head>\r\n<body>\r\n\t<header th:fragment=\"header\" class=\"m-2\">\r\n        <h1 class=\"text-center\">Linear Algebra Calulator Test</h1>\r\n    </header>\r\n\t<main>\r\n        ");
		jteOutput.writeContent("\r\n        <div class=\"container-flex m-2\">\r\n            <div class=\"row d-flex flex-column justify-content-center align-items-center text-center m-2\">\r\n                <div class=\"col btn-group\">\r\n                    <a class=\"btn btn-primary\"\r\n                        hx-post=\"/matrix-module\"\r\n                        hx-trigger=\"click\"\r\n                        hx-target=\"#module-container\"\r\n                        hx-swap=\"innterHTML\"\r\n                    >Matrix Calculator</a>\r\n                    <a class=\"btn btn-primary\"\r\n                        hx-post=\"/elimination-module\"\r\n                        hx-trigger=\"click\"\r\n                        hx-target=\"#module-container\"\r\n                        hx-swap=\"innterHTML\"\r\n                    >Elimination Calculator</a>\r\n                    <a class=\"btn btn-primary\"\r\n                        hx-post=\"/vectorspace-module\"\r\n                        hx-trigger=\"click\"\r\n                        hx-target=\"#module-container\"\r\n                        hx-swap=\"innterHTML\"\r\n                    >Vectorspace(s) Calculator</a>\r\n                </div>\r\n            </div>\r\n        </div>\r\n        ");
		jteOutput.writeContent("\r\n        <div class=\"container mx-auto border border-primary border-3 justify-content-center align-items-center\" id=\"module-container\"> \r\n            <div class=\"container text-center\">\r\n                <p class=\"m-5 fs-4\">\r\n                    Click a button above.\r\n                </p>\r\n                <h2 class=\"text-center\">Select a module to begin</h2>\r\n            </div>\r\n        </div>\r\n\t</main>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
