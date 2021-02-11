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
        document.getElementById(`s${index+1}`).innerHTML = `${step.step}`;
      }
    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-step', true);
  xmlhttp.send();
}

//Display Nutrition
function recipenutrition(ing1, ing2 = 0, ing3 = 0 , ing4 = 0, ing5 = 0, ing6 = 0, ing7 = 0, ing8 = 0, ing9 = 0, ing10 = 0){
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
  
        var nutrition = JSON.parse(this.responseText);
  
        let ingredient1 = nutrition.find(({id}) => id == ing1);
        let ingredient2 = nutrition.find(({id}) => id == ing2);
        let ingredient3 = nutrition.find(({id}) => id == ing3);
        let ingredient4 = nutrition.find(({id}) => id == ing4);
        let ingredient5 = nutrition.find(({id}) => id == ing5);
        let ingredient6 = nutrition.find(({id}) => id == ing6);
        let ingredient7 = nutrition.find(({id}) => id == ing7);
        let ingredient8 = nutrition.find(({id}) => id == ing8);
        let ingredient9 = nutrition.find(({id}) => id == ing9);
        let ingredient10 = nutrition.find(({id}) => id == ing10);

        $("#calories").html(ingredient1.calories);
        $("#fat").html(ingredient2.fat);
        $("#protein").html(ingredient2.protein);
        $("#carbo").html(ingredient3.carbohydrate);
      }
    };
    xmlhttp.open("GET", 'http://localhost:8080/api/v1/ingredient', true);
    xmlhttp.send();
  } 


//<-------------------------------------------------- RECIPE'S FILTER -------------------------------------------------->

var card = localStorage.getItem("cardID");
console.log(card);

/*if (card == 1) {recipe1();}
if (card == 2) {recipe2();}
if (card == 3) {recipe3();}
if (card == 4) {recipe4();}*/

/*if (card) {
  `recipe${card}`();
}*/


//<----------------------------------------------------- RECIPES ------------------------------------------------------>

function recipe1(){
  recipeInfo(1);
  recipeImages(1,2,3,4,5);
  recipeingredients(1,22,54,76,21);
  recipeingredientsamount(1,2,3,4,5);
  recipesteps(1,1,1,1,1,1);
  recipenutrition(1,2,2);
}

function recipe2(){
  recipeInfo(2);
  recipeImages(1,2,3,4,5);
  recipeingredients(1,2);
  recipeingredientsamount(1,2);
  recipesteps(4,2,3,1);
  recipenutrition(1,2,2);
}

function recipe3(){
  recipeInfo(3);
  recipeImages(1,2,3,4,5);
  recipeingredients(1,2);
  recipeingredientsamount(1,2);
  recipesteps(4,2,3,1);
  recipenutrition(1,2,2);
}

function recipe4(){
  recipeInfo(4);
  recipeImages(1,2,3,4,5);
  recipeingredients(1,2);
  recipeingredientsamount(1,2);
  recipesteps(4,2,3,1);
  recipenutrition(1,2,2);
}

