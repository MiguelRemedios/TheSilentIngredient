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
