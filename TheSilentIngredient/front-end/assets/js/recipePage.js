mybutton = document.getElementById("myBtn");


window.onscroll = function () { scrollFunction() };

function scrollFunction() {
    if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        mybutton.style.display = "block";
    } else {
        mybutton.style.display = "none";
    }
}


function topFunction() {
    document.body.scrollTop = 0; // For Safari
    document.documentElement.scrollTop = 0;

}

google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart(e1,e2,e3) {

  if (e1 == 0 && e2 == 0 && e3 == 0) {
    e1 = 1;
    e2 = 1;
    e3 = 1;
  }
  
  var data = google.visualization.arrayToDataTable([
    ['Nutrition ', 'Percentage Breakdown'],
    ['Fat', e1],
    ['Protein', e2],
    ['Carbohydrates', e3],
  ]);

  var options = {
    title: 'Nutrition Percentage Breakdown'
  };

  var chart = new google.visualization.PieChart(document.getElementById('piechart'));

  chart.draw(data, options);
}

/*var $table = $('#mytable');
var thead = $table[0].tHead, tbody = $table[0].tBodies[0];
var colsLen = tbody.rows[0].cells.length, rowsLen = tbody.rows.length;
var hideNode = function(node) { if (node) node.style.display = "none"; };
for (var j = 0; j < colsLen; ++j) {
    var counter = 0;
    for (var i = 0; i < rowsLen; ++i) {
        if (tbody.rows[i].cells[j].childNodes.length == 0) ++counter;
    }
    if (counter == rowsLen) {
        for (var i = 0; i < rowsLen; ++i) {
            hideNode(tbody.rows[i].cells[j]);
        }
        hideNode(thead.rows[0].cells[j]);
    }
}*/