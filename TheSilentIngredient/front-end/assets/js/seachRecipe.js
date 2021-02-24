function recipes(){
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
  
        var recipes = JSON.parse(this.responseText);
        for (let index = 0; index < recipes.length ; index++) {
          document.getElementById(`rname${index+1}`).innerHTML = `${recipes[index].name}`;
          document.getElementById(`rdesc${index+1}`).innerHTML = `${recipes[index].description}`;
        }
      }
    };
    xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe', true);
    xmlhttp.send();

    var xmlhttp2 = new XMLHttpRequest();
    xmlhttp2.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
        var recipeimages = JSON.parse(this.responseText);
        var recipeMainImages = [];
        recipeMainImages = [recipeimages[0].path,recipeimages[5].path,recipeimages[10].path,recipeimages[15].path,
                            recipeimages[80].path,recipeimages[75].path,recipeimages[85].path,recipeimages[20].path,
                            recipeimages[25].path,recipeimages[30].path,recipeimages[35].path,recipeimages[40].path,
                            recipeimages[45].path,recipeimages[50].path,recipeimages[55].path,recipeimages[60].path,
                            recipeimages[65].path,recipeimages[70].path,recipeimages[105].path,recipeimages[110].path,
                            recipeimages[115].path,recipeimages[90].path,recipeimages[95].path,recipeimages[100].path];
 
        for (let index = 0; index < recipeMainImages.length; index++) {
          $(`#rimg${index+1}`).attr("src",`${recipeMainImages[index]}`);
        }
      }
    };
    xmlhttp2.open("GET", 'http://localhost:8080/api/v1/recipe-image', true);
    xmlhttp2.send();

    var recipesArray = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24]
    localStorage.setItem("recipesFilter", JSON.stringify(recipesArray));
}

function storeID(element){
    var card = element.parentElement.parentElement.parentElement.parentElement;
    console.log(card.id);
    localStorage.setItem("cardID", card.id);
}

function searchEngine(){
    var ingredientArray = JSON.parse(localStorage.getItem("ingredientArray"));
    //ingredientArray.sort(function(a, b){return a - b});
    var recipeIngredients = JSON.parse(localStorage.getItem("recipeIngredients"));
  
    var tempArray = [];
    var recipesArray = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24]

    for (const ingredient of ingredientArray) {
      if (ingredientArray.indexOf(ingredient) == 0) {
        for (const recipe of recipeIngredients) {
          if (recipe.ingredient_id == ingredient) {
            tempArray.push(recipe.recipe_id);
          }
        }
      }

      for (const recipeID of tempArray) {
        if (!recipeIngredients.find(recipe => recipe.ingredient_id == ingredient)){
          tempArray.splice(tempArray.indexOf(recipeID), 1);
        }
      }
    }

    var recipesArray = recipesArray.filter(recipeID => !tempArray.includes(recipeID));
    for (const recipeID of recipesArray) {
      document.getElementById(recipeID).style.display = "none";
    }
    localStorage.setItem("recipesFilter", JSON.stringify(tempArray));
    //console.log(tempArray);
    //console.log(recipesArray);
}


function searchEngine2(){
  var ingredientArray = JSON.parse(localStorage.getItem("ingredientArray"));
  var recipeIngredients = JSON.parse(localStorage.getItem("recipeIngredients"));
  if (ingredientArray === null) return console.log("Please enter some ingredients first!");
  if (!(typeof ingredientArray != "undefined" && ingredientArray != null && ingredientArray.length != null && ingredientArray.length > 0)) {
    return alert("Ingredient List is empty! Please add a ingredient!");
}

  var tempArray = [];
  var recipesArray = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24];

//-------------------------------------------------------------------------------------------------------------------------------------------

  //Block of code to get the recipe id's out of the ingredients selected
  for (let index = 0; index < ingredientArray.length; index++) {

    if (ingredientArray.indexOf(ingredientArray[index]) == index) {

      for (const recipe of recipeIngredients) {

        //ERRO TA AQUI VIADO, LÊ ESSA PORRA QUANDO ACORDAR
        if (recipe.ingredient_id == ingredientArray[index]) {

          removeDuplicates(tempArray);
          tempArray.push(recipe.recipe_id);
          tempArray.sort(function(a, b){return a - b});
        }
      }
    } 

    var array = removeDuplicates(tempArray);
    //console.log(array);
    /*
    for (const recipeID of array) {
      if (!recipeIngredients.find(recipe => recipe.ingredient_id == ingredientArray[index])){
        array.splice(array.indexOf(recipeID), 1);
      }
    }*/
    
    var displayRecipes = [];
    //Block of code in charge of checking if recipeID's really include both ingredients in IngredientArray
    for (const recipeID of array) {
      if (recipeIngredients.find(recipe => recipe.ingredient_id == ingredientArray[index])){

        displayRecipes.push(recipeID);
      }
    }

    
  }
//-------------------------------------------------------------------------------------------------------------------------------------------

  //BLOCK of code to make the recipes toggle between hiding/showing
  if (ingredientArray !== null) {
    //hiderecipesArray - saves all recipes that need to be hidden
    var hiderecipesArray = recipesArray.filter(recipeID => !array.includes(recipeID));
    for (const recipeID of hiderecipesArray) {
      document.getElementById(recipeID).style.display = "none";
    }

    //showrecipesArray - saves all recipes that need to be shown / displayed
    var showrecipesArray = recipesArray.filter(recipeID => array.includes(recipeID));
    for (const recipeID of showrecipesArray) {
      document.getElementById(recipeID).style.display = "block";
    }
  }

  //CONSOLE LOGS HANDLING
  console.log("%cRecipes to hide:\n" + hiderecipesArray.length + ") "  + hiderecipesArray, 'color: #FF8484');
  console.log("%cRecipes to display:\n" + showrecipesArray.length + ") "  + showrecipesArray, 'color: #9CFF67');

  //Set the array in the localstorage
  localStorage.setItem("recipesFilter", JSON.stringify(array));
}

function removeDuplicates(data){
  let unique = data.reduce(function (a,b) {
    if (a.indexOf(b) < 0) a.push(b);
    return a;
  }, []);
  return unique;

}

fetch("http://localhost:8080/api/v1/recipe-ingredient")
  .then((data) => data.json())
  .then((data) => {
    var recipeIngs = [];
    for (var i = 0; i < data.length; i++) {
      recipeIngs.push(data[i]);
    }
    localStorage.setItem("recipeIngredients", JSON.stringify(recipeIngs));
});


recipes();