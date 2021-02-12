function recipes(/*imageid*/){
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
  
        var recipes = JSON.parse(this.responseText);
        for (let index = 0; index < 22 /*recipes.length*/; index++) {
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
         recipeMainImages = [recipeimages[0].path,recipeimages[5].path,recipeimages[3].path,recipeimages[4].path,
                             recipeimages[0].path,recipeimages[1].path,recipeimages[3].path,recipeimages[4].path,
                             recipeimages[1].path,recipeimages[3].path,recipeimages[3].path,recipeimages[0].path,
                             recipeimages[1].path,recipeimages[3].path,recipeimages[3].path,recipeimages[0].path,
                             recipeimages[1].path,recipeimages[3].path,recipeimages[3].path,recipeimages[0].path,
                             recipeimages[1].path,recipeimages[3].path];
 
        
         for (let index = 0; index < recipeMainImages.length; index++) {
          $(`#rimg${index+1}`).attr("src",`${recipeMainImages[index]}`);
        }
      }
    };
    xmlhttp2.open("GET", 'http://localhost:8080/api/v1/recipeimage', true);
    xmlhttp2.send();

}

function storeID(element){
    var card = element.parentElement.parentElement;
    console.log(card.id);
    localStorage.setItem("cardID", card.id);
}

recipes();