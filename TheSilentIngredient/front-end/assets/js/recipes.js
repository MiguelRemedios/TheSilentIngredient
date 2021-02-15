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

function recipeingredients(){
  var xmlhttp = new XMLHttpRequest();
  const argcount = arguments.length;
  const myArgs = arguments;
  xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {

      var ingredients = JSON.parse(this.responseText);

      for (let index = 0; index < argcount; index++) {
        let ingredient = ingredients.find(({id}) => id == myArgs[index]);
        document.getElementById(`i${index+1}`).innerHTML = `${ingredient.name}`;
      }
    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/ingredient', true);
  xmlhttp.send();
}

//Display Ingredient's Amount
function recipeingredientsamount(){
  var xmlhttp = new XMLHttpRequest();
  const argcount = arguments.length;
  const myArgs = arguments;
  xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {

      var amounts = JSON.parse(this.responseText);
    
      for (let index = 0; index < argcount; index++) {
        let amount = amounts.find(({id}) => id == myArgs[index]);
        document.getElementById(`a${index+1}`).innerHTML = `${amount.quantity}` + ` ${amount.measurement}`;
      }
    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-ingredient', true);
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

        $("#energy").html(totalenergy + " kJ");
        $("#calories").html(totalcalories + " kcal");
        $("#protein").html(totalprotein  + " g");
        $("#carbo").html(totalcarbo + " g");
        $("#fat").html(totalfat + " g");

        drawChart(totalfat,totalprotein,totalcarbo);
      }
    };
    xmlhttp.open("GET", 'http://localhost:8080/api/v1/ingredient', true);
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
  recipeingredients(3,2,83);
  //Ingredient Amount ID
  recipeingredientsamount(1,2,3);
  //Step ID
  recipesteps(1,2,3,4);
  //Ingredients ID (same as above)
  recipenutrition({"id":3,"amount":1},{"id":2,"amount":100},{"id":83,"amount":1});
}

function recipe2(){
  recipeInfo(2);
  recipeImages(6,7,8,9,10);
  recipeingredients(81,5,6,7,62);
  recipeingredientsamount(4,5,6,7,8);
  recipesteps(5,6,7,8,9,10);
  recipenutrition(81,5,6,7,62);
}

function recipe3(){
  recipeInfo(3);
  recipeImages(11,12,13,14,15);
  recipeingredients(1,2);
  recipeingredientsamount(1,2);
  recipesteps(4,2,3,1);
  recipenutrition(1,2,2);
}

function recipe4(){
  recipeInfo(4);
  recipeImages(16,17,18,19,20);
  recipeingredients(1,2);
  recipeingredientsamount(1,2);
  recipesteps(4,2,3,1);
  recipenutrition(1,2,2);
}

