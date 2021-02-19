  window.onload = function(){
      caricaDati()

  $("#bottone").click(function(){
      inserisci($("#numero").val()) 
      window.location.reload();
    });
}
  function caricaDati() {
      $.ajax({
          url: "http://localhost:80/all",
          method: 'GET',
          dataType : "json",
          success: function(resp){ $("#corpo").html(parsaDati(resp)) },
          error: function(err){console.log(err)},
      });

  }

  function parsaDati(dati) {
      let datiHtml = ""
      for (let n of dati) {
          datiHtml += `<tr>
      <td>${n.indice}</td>
      <td>${n.valore}</td></tr>`;
      }
      return datiHtml;
  }

  function inserisci(n) {
      $.ajax({
          url: `http://localhost:80/${n}`,
          method: 'POST',
          success: function() {
            console.log(`Numero inserito: ${n}`)
            },
          error: function(err){console.error(err)},
      });
  }