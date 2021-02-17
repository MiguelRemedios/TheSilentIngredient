//<-------------------------------------------------- RECIPE'S SCRIPT -------------------------------------------------->

//Display Recipe Name and Info
function recipeInfo(recipeid){
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {

      var recipes = JSON.parse(this.responseText);
      let recipe = recipes.find(({id}) => id == recipeid);
      
      //Recipe Page
      document.getElementById("title").innerHTML = `TheSilentIngredient - ${recipe.name}`;
      document.getElementById("r1").innerHTML = `${recipe.name}`;
      document.getElementById("r2").innerHTML = `${recipe.description}`;
      document.getElementById("r3").innerHTML = `Serving: ${recipe.serving}`;
      document.getElementById("r4").innerHTML = `Cooking Time: ${recipe.cooktime}`;
    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe', true);
  xmlhttp.send();
}

//Display Recipe Images 
function recipeImages(image1, image2, image3, image4, image5){
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {

      var recipeimage = JSON.parse(this.responseText);
      let img1 = recipeimage.find(({id}) => id == image1);
      let img2 = recipeimage.find(({id}) => id == image2);
      let img3 = recipeimage.find(({id}) => id == image3);
      let img4 = recipeimage.find(({id}) => id == image4);
      let img5 = recipeimage.find(({id}) => id == image5);

      $("#imageBox").attr("src",`${img1.path}`);
      $("#image1").attr("src",`${img1.path}`);
      $("#image2").attr("src",`${img2.path}`);
      $("#image3").attr("src",`${img3.path}`);
      $("#image4").attr("src",`${img4.path}`);
      $("#image5").attr("src",`${img5.path}`);
    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipeimage', true);
  xmlhttp.send();
}

//Display Recipe Steps
function recipesteps(){
  var xmlhttp = new XMLHttpRequest();
  const argcount = arguments.length;
  const myArgs = arguments;
  xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {

      var steps = JSON.parse(this.responseText);

      for (let index = 0; index < argcount; index++) {
        let step = steps.find(({id}) => id == myArgs[index]);
        document.getElementById(`s${index+1}`).innerHTML = `${index+1}) ${step.step}`;
      }
    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-step', true);
  xmlhttp.send();
}

//Display Nutrition
function recipenutrition(){
  var xmlhttp = new XMLHttpRequest();
  const argcount = arguments.length;
  const myArgs = arguments;
  xmlhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
  
        var nutritions = JSON.parse(this.responseText);

        var totalcalories, totalprotein, totalcarbo, totalfat;
        totalcalories = totalprotein = totalcarbo = totalfat = 0;
        var totalenergy, energyprotein, energycarbo, energyfat;
        totalenergy = energyprotein = energycarbo = energyfat = 0;

        for (let index = 0; index < argcount; index++) {
          let nutrition = nutritions.find(({id}) => id == myArgs[index].id);

          const calories = JSON.parse(`${nutrition.calories}`);
          const protein = JSON.parse(`${nutrition.protein}`);
          const carbo = JSON.parse(`${nutrition.carbohydrate}`);
          const fat = JSON.parse(`${nutrition.fat}`);

          totalcalories += calories * myArgs[index].amount;
          totalprotein += protein * myArgs[index].amount;
          totalcarbo += carbo * myArgs[index].amount;
          totalfat += fat * myArgs[index].amount;
        }

        energyprotein = ((totalprotein * 4) * 4.184);
        energycarbo = ((totalcarbo * 4) * 4.184);
        energyfat = ((totalfat * 9) * 4.184);
        totalenergy = Math.round(energyprotein + energycarbo + energyfat);
        totalcalories = Math.round(totalcalories);

        $("#energy").html(totalenergy + " kJ");
        $("#calories").html(totalcalories + " kcal");
        $("#protein").html(Number(totalprotein.toFixed(1))  + " g");
        $("#carbo").html(Number(totalcarbo.toFixed(1)) + " g");
        $("#fat").html(Number(totalfat.toFixed(1)) + " g");

        drawChart(totalfat,totalprotein,totalcarbo);
      }
    };
    xmlhttp.open("GET", 'http://localhost:8080/api/v1/ingredient', true);
    xmlhttp.send();
  } 


  function recipeingredients(recipeid) {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
      if (this.readyState == 4 && this.status == 200) {
        var ingredients = JSON.parse(this.responseText);
        for (let i = 0; i < ingredients.length; i++) {
          var obj = ingredients[i];
          ingredientName(obj.ingredient_id, i);
          ingredientNutrition(obj.ingredient_id, i, obj.quantity);
          console.log(obj.quantity)
          document.getElementById(`a${i + 1}`).innerHTML = `${obj.quantity}` + ` ${obj.measurement}`;
        }
      }
    };
    xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-ingredient/' + recipeid, true);
    xmlhttp.send();
  }
  
  function ingredientNutrition(id, i, quantity){
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
      if (this.readyState == 4 && this.status == 200) {
        var ingredient = JSON.parse(this.responseText);
        console.log((quantity/100)*ingredient.calories)
  
    xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-ingredient/' + recipeid, true);
    xmlhttp.send();
    }
  }
}
  
  function ingredientName(id, i) {
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function () {
      if (this.readyState == 4 && this.status == 200) {
        var ingredient = JSON.parse(this.responseText);
        document.getElementById(`i${i + 1}`).innerHTML = `${ingredient.name}`;
      }
    }
  
    xmlhttp.open("GET", 'http://localhost:8080/api/v1/ingredient/' + id, true);
    xmlhttp.send();
  }


  
//<-------------------------------------------------- RECIPE'S FILTER -------------------------------------------------->

var card = localStorage.getItem("cardID");
console.log(card);

if (card == 1) {recipe1();}
if (card == 2) {recipe2();}
if (card == 3) {recipe3();}
if (card == 4) {recipe4();}
if (card == 5) {recipe5();}
if (card == 6) {recipe6();}
if (card == 7) {recipe7();}
if (card == 8) {recipe8();}
if (card == 9) {recipe9();}
if (card == 10) {recipe10();}
if (card == 11) {recipe11();}
if (card == 12) {recipe12();}
if (card == 13) {recipe13();}
if (card == 14) {recipe14();}
if (card == 15) {recipe15();}
if (card == 16) {recipe16();}
if (card == 17) {recipe17();}
if (card == 18) {recipe18();}
if (card == 19) {recipe19();}
if (card == 20) {recipe20();}
if (card == 21) {recipe21();}
if (card == 22) {recipe22();}
if (card == 23) {recipe23();}
if (card == 24) {recipe24();}

//<----------------------------------------------------- RECIPES ------------------------------------------------------>

function recipe1(){
  //All parameters are ID's from everyone's table, make sure you check them and add it correctly.
  //Recipe ID
  recipeInfo(1);
  //Images ID
  recipeImages(1,2,3,4,5);
  //Ingredients ID
  recipeingredients(1);
  //Step ID
  recipesteps(1,2,3,4);
  //Ingredients ID (same as above)
  //(GRAMS) amount = QUANTITY / 100 (e.g 555g of rice = 5.55)
  //(MILILITERS) Since g = ml 100g = 100ml, same logic. Amount for liquids =  QUANTITY / 100 (e.g 750ml of water = 7.5)

  //1 tbsp of salt = 17g / amount = 17 / 100 = 0.17
  recipenutrition({"id":3,"amount":5.55},{"id":2,"amount":7.5},{"id":83,"amount":0.17});
}

function recipe2(){
  recipeInfo(2);
  recipeImages(6,7,8,9,10);
  recipeingredients(81,5,6,7,62);
  recipeingredientsamount(4,5,6,7,8);
  recipesteps(5,6,7,8,9,10);
  //81) 1 tbsp olive oil = 13.3g / amount: 0.133
  //62) 1 onion = 110g / amount: 1.1
  recipenutrition({"id":81,"amount":0.133}, {"id":5,"amount":4.535}, {"id":6,"amount":3.4}, {"id":7,"amount":3.4}, {"id":62,"amount":1.1});
}

function recipe3(){
  recipeInfo(3);
  recipeImages(11,12,13,14,15);
  recipeingredients(8,9,10,11,12);
  recipeingredientsamount(9,10,11,12,13);
  recipesteps(11,12,13,14,15,16,17,18,19,20);

  //8) 1 5oz (mid term) chicken breast = 142 g
  //10) 1 tomato = 123 g
  //11) 1 lettuce leaf = 8 g
  //12) 1 tbsp light mayo = 15g
  recipenutrition({"id":8,"amount":1.42}, {"id":9,"amount":1.05}, {"id":10,"amount":3.69}, {"id":11,"amount":0.16}, {"id":12,"amount":0.15});
}

function recipe4(){
  recipeInfo(4);
  recipeImages(16,17,18,19,20);
  recipeingredients(77,83,13,5,14);
  recipeingredientsamount(14,15,16,17,18);
  recipesteps(21,22,23,24,25,26);

}