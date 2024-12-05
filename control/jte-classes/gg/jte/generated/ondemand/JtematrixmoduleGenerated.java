package gg.jte.generated.ondemand;
import com.linearly.model.Matrix;
@SuppressWarnings("unchecked")
public final class JtematrixmoduleGenerated {
	public static final String JTE_NAME = "matrix-module.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,2,14,14,14,23,26,33,33,42,45,90,90,90,2,3,4,6,7,8,8,8,8};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Matrix matrixA, int rowsMatrixA, int colsMatrixA, Matrix matrixB, int rowsMatrixB, int colsMatrixB) {
		jteOutput.writeContent("\r\n<h2 class=\"text-center\">Matrix Calculator</h2>\r\n<div class=\"row m-2\">\r\n    <div class=\"col-6\">\r\n        <div class=\"container\" id=\"matrix-A\">\r\n             ");
		gg.jte.generated.ondemand.JteinputmatrixAGenerated.render(jteOutput, jteHtmlInterceptor, matrixA, rowsMatrixA, colsMatrixA);
		jteOutput.writeContent("\r\n        </div>\r\n        <div class=\"row m-1\">\r\n            <form \r\n                hx-get=\"/submit-matrix-A\"\r\n                hx-target=\"#matrix-A\"\r\n                hx-swap=\"innerHTML\">\r\n                <input\r\n                    type=\"text\"\r\n                    name=\"rowsMatrixA\">");
		jteOutput.writeContent("\r\n                <input\r\n                    type=\"text\"\r\n                    name=\"colsMatrixA\">");
		jteOutput.writeContent("\r\n                <button type=\"submit\">Submit</button>\r\n            </form>\r\n        </div>\r\n    </div>\r\n    <div class=\"col-6\">\r\n        <div class=\"container\" id=\"matrix-B\">\r\n             ");
		gg.jte.generated.ondemand.JteinputmatrixBGenerated.render(jteOutput, jteHtmlInterceptor, matrixB, rowsMatrixB, colsMatrixB);
		jteOutput.writeContent("\r\n        </div>\r\n        <div class=\"row m-1\">\r\n            <form \r\n                hx-get=\"/submit-matrix-B\"\r\n                hx-target=\"#matrix-B\"\r\n                hx-swap=\"innerHTML\">\r\n                <input\r\n                    type=\"text\"\r\n                    name=\"rowsMatrixB\">");
		jteOutput.writeContent("\r\n                <input\r\n                    type=\"text\"\r\n                    name=\"colsMatrixB\">");
		jteOutput.writeContent("\r\n                <button type=\"submit\">Submit</button>\r\n            </form>\r\n        </div>\r\n    </div>\r\n    <div class=\"container m-1\">\r\n        <div class=\"row m-1 justify-content-center align-items-center text-center\">\r\n            <div class=\"col-4 d-grid gap-2 mx-auto\"><button type=\"button\" class=\"btn btn-secondary\">Add</button></div>\r\n            <div class=\"col-4 d-grid gap-2 mx-auto\"><button type=\"button\" class=\"btn btn-secondary\">Subtract</button></div>\r\n            <div class=\"col-4 d-grid gap-2 mx-auto\"><button type=\"button\" class=\"btn btn-secondary\">Multiply</button></div>\r\n        </div>\r\n        <div class=\"row m-1 justify-content-center align-items-center text-center\">\r\n            <div class=\"col-4 d-grid gap-2 mx-auto\"><button type=\"button\" class=\"btn btn-secondary\">Inverse</button></div>\r\n            <div class=\"col-4 d-grid gap-2 mx-auto\"><button type=\"button\" class=\"btn btn-secondary\">Transpose</button></div>\r\n            <div class=\"col-4 d-grid gap-2 mx-auto\"><button type=\"button\" class=\"btn btn-secondary\">Determinant</button></div>\r\n        </div>\r\n    </div>\r\n\r\n    <div class=\"container border border-top border-primary\">\r\n        <div class=\"row m-2\">\r\n            <div class=\"col-8\">\r\n                <table id=\"output-matrix\" class=\"m-2 table table-bordered border-secondary mx-auto border border-3 border-primary text-center\">\r\n                <tr>\r\n                    <td><input type=\"text\" class=\"form-control\"></td>\r\n                    <td><input type=\"text\" class=\"form-control\"></td>\r\n                    <td><input type=\"text\" class=\"form-control\"></td>\r\n                </tr>\r\n                <tr>\r\n                    <td><input type=\"text\" class=\"form-control\"></td>\r\n                    <td><input type=\"text\" class=\"form-control\"></td>\r\n                    <td><input type=\"text\" class=\"form-control\"></td>\r\n                </tr>\r\n                <tr>\r\n                    <td><input type=\"text\" class=\"form-control\"></td>\r\n                    <td><input type=\"text\" class=\"form-control\"></td>\r\n                    <td><input type=\"text\" class=\"form-control\"></td>\r\n                </tr>\r\n            </table>\r\n            </div>\r\n            <div class=\"col-4\">\r\n                <h2>Operation</h2>\r\n                <p>This paragraph will describe the output based on the operation</p>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Matrix matrixA = (Matrix)params.get("matrixA");
		int rowsMatrixA = (int)params.getOrDefault("rowsMatrixA", 3);
		int colsMatrixA = (int)params.getOrDefault("colsMatrixA", 3);
		Matrix matrixB = (Matrix)params.get("matrixB");
		int rowsMatrixB = (int)params.getOrDefault("rowsMatrixB", 3);
		int colsMatrixB = (int)params.getOrDefault("colsMatrixB", 3);
		render(jteOutput, jteHtmlInterceptor, matrixA, rowsMatrixA, colsMatrixA, matrixB, rowsMatrixB, colsMatrixB);
	}
}
