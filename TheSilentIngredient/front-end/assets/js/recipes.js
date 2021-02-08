function recipe1() {
  
  //Display Recipe Header Body
  function recipe(){
  
    /*var recipe1 = getData('http://localhost:8080/api/v1/recipe/1');
    console.log(recipe1);
    document.querySelector('#a1').innerHTML = 'HELLO';*/
  
    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
  
        var recipe = JSON.parse(this.responseText);
  
        //ID 1 - White Rice
        let recipe1 = recipe.find(({id}) => id == 1);
        document.getElementById("r1").innerHTML = `${recipe1.name}`;
        document.getElementById("r2").innerHTML = `${recipe1.description}`;
        document.getElementById("r3").innerHTML = `Serving: ${recipe1.serving}`;
        document.getElementById("r4").innerHTML = `Cooking Time: ${recipe1.cooktime}`;
        document.getElementById("imageBox").src="images/recipe/nodiet/NDWhiteRice1.jpg";
        document.getElementById("image1").src="images/recipe/nodiet/NDWhiteRice1.jpg";
        document.getElementById("image2").src="images/recipe/nodiet/NDWhiteRice2.jpg";
        document.getElementById("image3").src="images/recipe/nodiet/NDWhiteRice3.jpg";
        document.getElementById("image4").src="images/recipe/nodiet/NDWhiteRice4.jpg";
        document.getElementById("image5").src="images/recipe/nodiet/NDWhiteRice5.jpg";
  
      }
    };
    xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe', true);
    xmlhttp.send();
  
  }
  
  //Display Ingredients in Table
  function recipeingredients(){

    var xmlhttp = new XMLHttpRequest();
    xmlhttp.onreadystatechange = function() {
      if (this.readyState == 4 && this.status == 200) {
  
        var ingredient = JSON.parse(this.responseText);
  
        let res1 = ingredient.find(({id}) => id == 1);
        let res2 = ingredient.find(({id}) => id == 2);
        let res3 = ingredient.find(({id}) => id == 3);
  
        document.getElementById("t2").innerHTML = `${res1.name}`;
        document.getElementById("t4").innerHTML = `${res2.name}`;
        document.getElementById("t6").innerHTML = `${res3.name}`;
  
      }
    };
    xmlhttp.open("GET", 'http://localhost:8080/api/v1/ingredient', true);
    xmlhttp.send();
  }

    //Display Ingredient's Amount in Table
    function recipeamount(){

      var xmlhttp = new XMLHttpRequest();
      xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
    
          var amount = JSON.parse(this.responseText);
    
          let res1 = amount.find(({id}) => id == 1);
          let res2 = amount.find(({id}) => id == 2);
          let res3 = amount.find(({id}) => id == 3);
    
          document.getElementById("t1").innerHTML = `${res1.quantity}`;
          document.getElementById("t3").innerHTML = `${res2.quantity} ml`;
          document.getElementById("t5").innerHTML = `${res3.quantity}`;
    
        }
      };
      xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-ingredient', true);
      xmlhttp.send();
    }

    //Display Ingredients in Table
    function recipesteps(){

      var xmlhttp = new XMLHttpRequest();
      xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
    
          var step = JSON.parse(this.responseText);
    
          let res1 = step.find(({id}) => id == 1);
          let res2 = step.find(({id}) => id == 2);
          let res3 = step.find(({id}) => id == 3);
          let res4 = step.find(({id}) => id == 4);
          let res5 = step.find(({id}) => id == 5);
    
          document.getElementById("s1").innerHTML = `${res1.step}`;
          document.getElementById("s2").innerHTML = `${res2.step}`;
          document.getElementById("s3").innerHTML = `${res3.step}`;
          document.getElementById("s4").innerHTML = `${res4.step}`;
          document.getElementById("s5").innerHTML = `${res5.step}`;
          
        }
      };
      xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-step', true);
      xmlhttp.send();
    }

    //Display Ingredients in Table
    function recipenutrition(){

      var xmlhttp = new XMLHttpRequest();
      xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
    
          var nutrition = JSON.parse(this.responseText);
    
          let res1 = nutrition.find(({id}) => id == 1);
    
          document.getElementById("calories").innerHTML = `${res1.calories}`;
          document.getElementById("fat").innerHTML = `${res1.fat}`;
          document.getElementById("protein").innerHTML = `${res1.protein}`;
          document.getElementById("carbo").innerHTML = `${res1.carbohydrate}`;
          
        }
      };
      xmlhttp.open("GET", 'http://localhost:8080/api/v1/ingredient', true);
      xmlhttp.send();
    }

  //Call all methods to appear on the page
  recipe();
  recipeingredients();
  recipeamount();
  recipesteps();
  recipenutrition();
}

recipe1();