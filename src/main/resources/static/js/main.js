    function toggleReadOnly() {
      var textarea = document.getElementById("translation");
      var userinput = document.getElementById("userinput");
      var button = document.getElementById("translationButton");
      var translationFrom = document.getElementById("translationFrom")
      var translationTo = document.getElementById("translationTo");

      if (button.innerHTML === "English to Kurdish") {
        button.innerHTML = "Kurdish to English";
          translationFrom.value = "ckb";
          translationTo.value = "en"
      } else {
        button.innerHTML = "English to Kurdish";
                   translationFrom.value = "en";
                   translationTo.value = "ckb"
      }
    }

function populateTable(data) {
    var tableBody = document.querySelector('#data-table tbody');
    tableBody.innerHTML = '';

    data.forEach(function(item) {
        var row = document.createElement('tr');
        row.innerHTML = '<td>' + item.id + '</td>' +
                        '<td>' + item.name + '</td>' +
                        '<td>' + item.age + '</td>';
        // Add more cells based on your data structure

        tableBody.appendChild(row);
    });
}

// Access the data attribute passed by the Controller
var tableData = JSON.parse('{{translationsList | json}}');
populateTable(tableData);