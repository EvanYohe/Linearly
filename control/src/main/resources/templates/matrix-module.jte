@import com.linearly.model.Matrix

@param Matrix matrixA

<h2 class="text-center">Matrix Calculator</h2>
<div class="row m-2">
    <!-- matrix A -->
    <div class="col-6">
        <div class="container" id="matrix-A">
            @template.input-matrix(matrixA)
        </div>
        <div class="row m-1">
            <form 
                hx-post="/submit-input-A"
                hx-target="#matrix-A"
                hx-swap="outerHTML">
                <input
                    type="text"
                    name="rows">
                <input
                    type="text"
                    name="cols">
                <button type="submit">Submit</button>
            </form>
        </div>
    </div>
    <div class="container m-1">
        <div class="row m-1 justify-content-center align-items-center text-center">
            <div class="col-4 d-grid gap-2 mx-auto"><button type="button" class="btn btn-secondary">Add</button></div>
            <div class="col-4 d-grid gap-2 mx-auto"><button type="button" class="btn btn-secondary">Subtract</button></div>
            <div class="col-4 d-grid gap-2 mx-auto"><button type="button" class="btn btn-secondary">Multiply</button></div>
        </div>
        <div class="row m-1 justify-content-center align-items-center text-center">
            <div class="col-4 d-grid gap-2 mx-auto"><button type="button" class="btn btn-secondary">Inverse</button></div>
            <div class="col-4 d-grid gap-2 mx-auto"><button type="button" class="btn btn-secondary">Transpose</button></div>
            <div class="col-4 d-grid gap-2 mx-auto"><button type="button" class="btn btn-secondary">Determinant</button></div>
        </div>
    </div>

    <div class="container border border-top border-primary">
        <div class="row m-2">
            <div class="col-8">
                <table id="output-matrix" class="m-2 table table-bordered border-secondary mx-auto border border-3 border-primary text-center">
                <tr>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                </tr>
                <tr>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                </tr>
            </table>
            </div>
            <div class="col-4">
                <h2>Operation</h2>
                <p>This paragraph will describe the output based on the operation</p>
            </div>
        </div>
    </div>
</div>