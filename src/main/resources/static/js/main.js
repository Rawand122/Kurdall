    function toggleReadOnly() {
      var textarea = document.getElementById("translation");
      var userinput = document.getElementById("userinput");
      var button = document.getElementById("translationButton");
      var translationFrom = document.getElementById("translationFrom")
      var translationTo = document.getElementById("translationTo");

      if (button.innerHTML === "English to Kurdish") {
        button.innerHTML = "Kurdish to English";
         textarea.readOnly = !textarea.readOnly;
         userinput.readOnly = userinput.readOnly;
          button.disabled = false; // Re-enable the button
          translationFrom.value = "ckb";
          translationTo.value = "en"
      } else {
        button.innerHTML = "English to Kurdish";
         textarea.readOnly = textarea.readOnly;
         userinput.readOnly = !userinput.readOnly;
                   translationFrom.value = "en";
                   translationTo.value = "ckb"
          button.disabled = false; // Re-enable the button
      }
    }
