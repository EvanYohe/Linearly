package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteinputmatrixGenerated {
	public static final String JTE_NAME = "input-matrix.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,6,6,6,8,8,10,10,12,12,13,13,13,0,1,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.linearly.model.Matrix matrix, int rows, int cols) {
		jteOutput.writeContent("\r\n\r\n<table id=\"input-matrix-A\" class=\"m-2 table table-bordered border-secondary mx-auto border border-3 border-primary text-center\">\r\n    ");
		for (int i = 0; i < rows; i++) {
			jteOutput.writeContent("\r\n        <tr>\r\n            ");
			for (int j = 0; j < cols; j++) {
				jteOutput.writeContent("\r\n                <td><input type=\"text\" class=\"form-control\"></td>\r\n            ");
			}
			jteOutput.writeContent("\r\n        </tr>\r\n    ");
		}
		jteOutput.writeContent("\r\n</table>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.linearly.model.Matrix matrix = (com.linearly.model.Matrix)params.get("matrix");
		int rows = (int)params.get("rows");
		int cols = (int)params.get("cols");
		render(jteOutput, jteHtmlInterceptor, matrix, rows, cols);
	}
}
