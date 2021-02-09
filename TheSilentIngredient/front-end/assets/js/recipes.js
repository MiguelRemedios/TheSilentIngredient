//<-------------------------------------------------- RECIPES SCRIPT -------------------------------------------------->

//Display Recipe Name and Info
function recipeInfo(recipeid){
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {

      var recipe = JSON.parse(this.responseText);
      let recipe1 = recipe.find(({id}) => id == recipeid);
      document.getElementById("r1").innerHTML = `${recipe1.name}`;
      document.getElementById("r2").innerHTML = `${recipe1.description}`;
      document.getElementById("r3").innerHTML = `Serving: ${recipe1.serving}`;
      document.getElementById("r4").innerHTML = `Cooking Time: ${recipe1.cooktime}`;
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

//Display Ingredients
function recipeingredients(ing1, ing2 = 0, ing3 = 0 , ing4 = 0, ing5 = 0, ing6 = 0, ing7 = 0, ing8 = 0, ing9 = 0, ing10 = 0){
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {

      var ingredients = JSON.parse(this.responseText);

      let ingredient1 = ingredients.find(({id}) => id == ing1);
      let ingredient2 = ingredients.find(({id}) => id == ing2);
      let ingredient3 = ingredients.find(({id}) => id == ing3);
      let ingredient4 = ingredients.find(({id}) => id == ing4);
      let ingredient5 = ingredients.find(({id}) => id == ing5);
      let ingredient6 = ingredients.find(({id}) => id == ing6);
      let ingredient7 = ingredients.find(({id}) => id == ing7);
      let ingredient8 = ingredients.find(({id}) => id == ing8);
      let ingredient9 = ingredients.find(({id}) => id == ing9);
      let ingredient10 = ingredients.find(({id}) => id == ing10);

      document.getElementById("t2").innerHTML = `${ingredient1.name}`;
      document.getElementById("t4").innerHTML = `${ingredient2.name}`;
      document.getElementById("t6").innerHTML = `${ingredient3.name}`;
      document.getElementById("t8").innerHTML = `${ingredient4.name}`;
      document.getElementById("t10").innerHTML = `${ingredient5.name}`;
      document.getElementById("t12").innerHTML = `${ingredient6.name}`;
      document.getElementById("t14").innerHTML = `${ingredient7.name}`;
      document.getElementById("t16").innerHTML = `${ingredient8.name}`;
      document.getElementById("t18").innerHTML = `${ingredient9.name}`;
      document.getElementById("t20").innerHTML = `${ingredient10.name}`;
      }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/ingredient', true);
  xmlhttp.send();
}

//Display Ingredient's Amount in Table
function recipeingredientsamount(amount1, amount2 = 0, amount3 = 0, amount4 = 0, amount5 = 0, amount6 = 0, amount7 = 0, amount8 = 0, amount9 = 0, amount10 = 0){
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
    
          var amount = JSON.parse(this.responseText);
    
          let amt1 = amount.find(({id}) => id == amount1);
          let amt2 = amount.find(({id}) => id == amount2);
          let amt3 = amount.find(({id}) => id == amount3);
          let amt4 = amount.find(({id}) => id == amount4);
          let amt5 = amount.find(({id}) => id == amount5);
          let amt6 = amount.find(({id}) => id == amount6);
          let amt7 = amount.find(({id}) => id == amount7);
          let amt8 = amount.find(({id}) => id == amount8);
          let amt9 = amount.find(({id}) => id == amount9);
          let amt10 = amount.find(({id}) => id == amount10);
    
          document.getElementById("t1").innerHTML = `${amt1.quantity}`;
          document.getElementById("t3").innerHTML = `${amt2.quantity}`;
          document.getElementById("t5").innerHTML = `${amt3.quantity}`;
          document.getElementById("t7").innerHTML = `${amt4.quantity}`;
          document.getElementById("t9").innerHTML = `${amt5.quantity}`;
          document.getElementById("t11").innerHTML = `${amt6.quantity}`;
          document.getElementById("t13").innerHTML = `${amt7.quantity}`;
          document.getElementById("t15").innerHTML = `${amt8.quantity}`;
          document.getElementById("t17").innerHTML = `${amt9.quantity}`;
          document.getElementById("t19").innerHTML = `${amt10.quantity}`;
      }
      };
      xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-ingredient', true);
      xmlhttp.send();
    }
//<-------------------------------------------------- RECIPES SCRIPT -------------------------------------------------->

//<----------------------------------------------------- RECIPES ------------------------------------------------------>

function recipe1(){
  recipeInfo(1);
  recipeImages(1,2,3,4,5);
  recipeingredients(1);
  recipeingredientsamount(1);
}

recipe1();