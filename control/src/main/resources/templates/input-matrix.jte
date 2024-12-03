@param com.linearly.model.Matrix inputMatrix

<table id="input-matrix-A" class="m-2 table table-bordered border-secondary mx-auto border border-3 border-primary text-center">
    @for (int i = 0; i < inputMatrix.getRowDimension(); i++)
        <tr>
            @for (int j = 0; j < inputMatrix.getColDimension(); j++)
                <td><input type="text" class="form-control"></td>
            @endfor
        </tr>
    @endfor
</table>