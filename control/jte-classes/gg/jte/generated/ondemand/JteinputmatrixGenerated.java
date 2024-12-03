package gg.jte.generated.ondemand;
@SuppressWarnings("unchecked")
public final class JteinputmatrixGenerated {
	public static final String JTE_NAME = "input-matrix.jte";
	public static final int[] JTE_LINE_INFO = {0,0,0,0,0,3,3,3,5,5,7,7,9,9,10,10,10,0,0,0,0};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, com.linearly.model.Matrix inputMatrix) {
		jteOutput.writeContent("\r\n<table id=\"input-matrix-A\" class=\"m-2 table table-bordered border-secondary mx-auto border border-3 border-primary text-center\">\r\n    ");
		for (int i = 0; i < inputMatrix.getRowDimension(); i++) {
			jteOutput.writeContent("\r\n        <tr>\r\n            ");
			for (int j = 0; j < inputMatrix.getColDimension(); j++) {
				jteOutput.writeContent("\r\n                <td><input type=\"text\" class=\"form-control\"></td>\r\n            ");
			}
			jteOutput.writeContent("\r\n        </tr>\r\n    ");
		}
		jteOutput.writeContent("\r\n</table>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		com.linearly.model.Matrix inputMatrix = (com.linearly.model.Matrix)params.get("inputMatrix");
		render(jteOutput, jteHtmlInterceptor, inputMatrix);
	}
}
