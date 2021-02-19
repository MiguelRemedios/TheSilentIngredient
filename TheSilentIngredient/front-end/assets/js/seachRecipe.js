function recipes(/*imageid*/){
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
  
        var recipes = JSON.parse(this.responseText);
        for (let index = 0; index < 24 /*recipes.length*/; index++) {
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

         //Work by ID in the backend
         var recipeMainImages = [];
         //recipeMainImages.length = imageid;
         //ID's
         recipeMainImages = [recipeimages[0].path,recipeimages[5].path,recipeimages[10].path,recipeimages[15].path,
                             recipeimages[55].path,recipeimages[50].path,recipeimages[60].path,recipeimages[20].path,
                             recipeimages[25].path,recipeimages[0].path,recipeimages[35].path,recipeimages[40].path,
                             recipeimages[1].path,recipeimages[3].path,recipeimages[3].path,recipeimages[0].path,
                             recipeimages[1].path,recipeimages[3].path,recipeimages[3].path,recipeimages[0].path,
                             recipeimages[1].path,recipeimages[3].path,recipeimages[1].path,recipeimages[3].path];
 
        
         for (let index = 0; index < recipeMainImages.length; index++) {
          $(`#rimg${index+1}`).attr("src",`${recipeMainImages[index]}`);
        }
      }
    };
    xmlhttp2.open("GET", 'http://localhost:8080/api/v1/recipe-image', true);
    xmlhttp2.send();

}

function storeID(element){
    var card = element.parentElement.parentElement;
    console.log(card.id);
    localStorage.setItem("cardID", card.id);
}

/*function toggle(){
  const argcount = arguments.length;
  for (let index = 0; index < argcount; index++) {
    document.getElementById(`${index+1}`).style.display = "none";
  }
}*/


function searchEngine(){
    var ingredientArray = JSON.parse(localStorage.getItem("ingredientArray"));
    var recipeIngredients = JSON.parse(localStorage.getItem("recipeIngredients"));
    for (const ingredient of ingredientArray) {
      for (const recipe of recipeIngredients) {
        
        if (recipe.ingredient_id == ingredient) {
          document.getElementById(recipe.recipe_id).style.display = "none";
          //document.getElementById(recipe.recipe_id).style.position = "absolute";
        }
      }

    }
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
//toggle(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24);