function generateReport() {
    const table = document.querySelector('table');
    const output = document.getElementById('output');
    
    const checkboxes = table.querySelectorAll('thead th input[type="checkbox"]');
    const selectedColumns = [];
    
    for(let i = 0; i < checkboxes.length; i++){
        if(checkboxes[i].checked){
            selectedColumns.push({
                name:checkboxes[i].name,
                index:i
            });
        }
    }

    const data = [];
    const rows = table.querySelectorAll('tbody tr');

    for(let row of rows){
        const rowData = {};
        for(let col of selectedColumns){
            rowData[col.name] = row.cells[col.index].textContent;
        }
        data.push(rowData);
    }

    output.value = JSON.stringify(data,null,2);
}