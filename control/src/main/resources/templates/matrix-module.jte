<!-- Header of Module -->
<h2 class="text-center">Matrix Calculator</h2>
<!-- Row Wrapper for double matricies -->
<div class="row m-2">
    <!-- Input matrix -->
    <div class="col-6">
        <table id="input-matrix" class="m-2 table table-bordered border-secondary mx-auto border border-3 border-primary text-center">
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
        <!-- Add/Remove matrix rows or columns button group -->
        <div class="row m-1">
            <div class="input-group p-0" id="matrix-input">
                <input type="text" class="form-control" placeholder="Rows">
                <input type="text" class="form-control" placeholder="Columns">
                <span class="input-group-btn">
                    <button class="btn btn-primary">Submit</button>
                </span>
            </div>
        </div>
    </div>
    <!-- Output matrix -->
    <div class="col-6">
        <table id="input-matrix" class="m-2 table table-bordered border-secondary mx-auto border border-3 border-primary text-center">
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
        <!-- Add/Remove matrix rows or columns button group -->
        <div class="row m-1">
            <div class="input-group p-0" id="matrix-input">
                <input type="text" class="form-control" placeholder="Rows">
                <input type="text" class="form-control" placeholder="Columns">
                <span class="input-group-btn">
                    <button class="btn btn-primary">Submit</button>
                </span>
            </div>
        </div>
    </div>
    <!-- Button group for matrix operations -->
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
</div>