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
    if (ingredientArray === null) return ListEmpty();
    ingredientArray.sort(function(a, b){return a - b});
    var recipeIngredients = JSON.parse(localStorage.getItem("recipeIngredients"));

    var tempArray = [];
    var recipesArray = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24];

    if (!(typeof ingredientArray != "undefined" && ingredientArray != null && ingredientArray.length != null && ingredientArray.length > 0)) {
      for (const recipeID of recipesArray) {
        document.getElementById(recipeID).style.display = "block";
      }
      document.getElementById('sel3').value=0;
      return ListEmpty();
    }

    
    for (const ingredient of ingredientArray) {

      var isFirstIngredient = ingredientArray.indexOf(ingredient) == 0;
      
      if (isFirstIngredient) {
        for (const recipe of recipeIngredients) {
          if (recipe.ingredient_id == ingredient) {
            tempArray.push(recipe.recipe_id);
          }
        }
        tempArray.sort(function(a, b){return a - b});
      }
      
      //Pegar elemento do tempArray(que equivale a um recipeID)
      //Procurar com esse elemento / recipeID na lista do (recipeIngredients) se de facto o elemento do ingredientArray
      //está no ingredient_id do recipeID

      //tempArray = [3,10,11,12,14]
      //ingredientArray = [8,1,2,3]

      if (!isFirstIngredient){ // ingredientArray - guarda id's dos ingredientes
        for (const recipeID of tempArray) {
          if(recipeIngredients.find(rcp => rcp.recipe_id === recipeID && rcp.ingredient_id === ingredient)){
            // ignore
            console.log(recipeID);  
          } else {
            tempArray.splice(tempArray.indexOf(recipeID), 1);
          }
      }
    }
    console.log(tempArray);
  }

  //BLOCK of code to make the recipes toggle between hiding/showing
  if (ingredientArray !== null) {
    //hiderecipesArray - saves all recipes that need to be hidden
    var hiderecipesArray = recipesArray.filter(recipeID => !tempArray.includes(recipeID));
    for (const recipeID of hiderecipesArray) {
      document.getElementById(recipeID).style.display = "none";
    } 

    //showrecipesArray - saves all recipes that need to be shown / displayed
    var showrecipesArray = recipesArray.filter(recipeID => tempArray.includes(recipeID));
    for (const recipeID of showrecipesArray) {
      document.getElementById(recipeID).style.display = "block";
    }
  }

  document.getElementById('sel3').value=0;
  $("#healthy").prop("checked", false);
  //Set the array in the localstorage
  localStorage.setItem("recipesFilter", JSON.stringify(tempArray));
}


function searchEngine2(){
  var ingredientArray = JSON.parse(localStorage.getItem("ingredientArray"));
  if (ingredientArray === null) return ListEmpty();
  ingredientArray.sort(function(a, b){return a - b});
  var recipeIngredients = JSON.parse(localStorage.getItem("recipeIngredients"));

  var tempArray = [];
  var recipesArray = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24];
  var unfilteredArray = [];
  var filteredArray = [];
  var finalArray = [];

  if (!(typeof ingredientArray != "undefined" && ingredientArray != null && ingredientArray.length != null && ingredientArray.length > 0)) {
    for (const recipeID of recipesArray) {
      document.getElementById(recipeID).style.display = "block";
    }
    document.getElementById('sel3').value=0;
    return ListEmpty();
  }

//-------------------------------------------------------------------------------------------------------------------------------------------

  //Block of code to get the recipe id's out of the ingredients selected
  for (let index = 0; index < ingredientArray.length; index++) {

    if (ingredientArray.indexOf(ingredientArray[index]) == index) {

      for (const recipe of recipeIngredients) {

        if (recipe.ingredient_id == ingredientArray[index]) {

          removeDuplicates(tempArray);
          tempArray.push(recipe.recipe_id);
          tempArray.sort(function(a, b){return a - b});
        }
      }
    } 
  }

    unfilteredArray = removeDuplicates(tempArray);

    for(const recipe of unfilteredArray) {
      const completeRecipe = recipeIngredients.filter(rcp => rcp.recipe_id == recipe);
      console.log(completeRecipe);
      filteredArray.push({recipe_id: recipe, ingredients: []});

      console.log(filteredArray);

      const i = filteredArray.map(function(e) { return e.recipe_id; }).indexOf(recipe);

      console.log(i);
      
      for (const recipeSlice of completeRecipe) {
        filteredArray[i].ingredients.push(recipeSlice.ingredient_id);
      }
    
    }

    function containsAll(needles, haystack){ 
      for(var i = 0; i < needles.length; i++){
         if($.inArray(needles[i], haystack) == -1) return false;
      }
      return true;
    }

    for (const recipe of filteredArray) {
      if (!containsAll(ingredientArray, recipe.ingredients)){
        filteredArray.splice(filteredArray.indexOf(recipe), 1);
      }
    }
 
    for (const recipeID of filteredArray) {
      finalArray.push(recipeID.recipe_id);
    }

//-------------------------------------------------------------------------------------------------------------------------------------------

  //BLOCK of code to make the recipes toggle between hiding/showing
  if (ingredientArray !== null) {
    //hiderecipesArray - saves all recipes that need to be hidden
    var hiderecipesArray = recipesArray.filter(recipeID => !finalArray.includes(recipeID));
    for (const recipeID of hiderecipesArray) {
      document.getElementById(recipeID).style.display = "none";
    } 

    //showrecipesArray - saves all recipes that need to be shown / displayed
    var showrecipesArray = recipesArray.filter(recipeID => finalArray.includes(recipeID));
    for (const recipeID of showrecipesArray) {
      document.getElementById(recipeID).style.display = "block";
    }
  }

  //Set the array in the localstorage
  localStorage.setItem("recipesFilter", JSON.stringify(filteredArray));
}


function removeDuplicates(array){
  let unique = array.reduce(function (a,b) {
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

function ListEmpty() {
  if(!(document.getElementById('abc'))){
  var x = document.createElement("div");
  x.setAttribute("id", "abc");
  x.innerText = "List is empty, please add ingredients!";
  x.classList.add("errorHandle");
  document.getElementById("ingredients").append(x);
  }

}

function removeEmpty(){

  var myobj = document.getElementById("abc");
  if((document.getElementById('abc'))){
  myobj.remove();
  }
}

recipes();

// Scroll to top button
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
