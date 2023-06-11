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
