//<-------------------------------------------------- RECIPE'S SCRIPT -------------------------------------------------->

//Display Recipe Name and Info
function recipeInfo(recipeid) {
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {

      var recipes = JSON.parse(this.responseText);
      document.getElementById("title").innerHTML = `TheSilentIngredient - ${recipes.name}`;
      document.getElementById("r1").innerHTML = `${recipes.name}`;
      document.getElementById("r2").innerHTML = `${recipes.description}`;
      document.getElementById("r3").innerHTML = `Serving: ${recipes.serving}`;
      document.getElementById("r4").innerHTML = `Cooking Time: ${recipes.cooktime}`;

      recipeImages(recipeid);
      recipeingredients(recipeid);
      recipesteps(recipeid);

      ingredientNutrition(recipeid);

    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe/' + recipeid, true);
  xmlhttp.send();
}

function recipeImages(id) {
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      var recipeimages = JSON.parse(this.responseText);
      for (let i = 0; i < recipeimages.length; i++) {
        $("#imageBox").attr("src", `${recipeimages[0].path}`);
        $(`#image${i + 1}`).attr("src", `${recipeimages[i].path}`);
      }
    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-image/nr/' + id, true);
  xmlhttp.send();
}

function recipesteps(id) {
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      var steps = JSON.parse(this.responseText);
      for (let i = 0; i < steps.length; i++) {
        $(`#s${i + 1}`).html(`${i + 1}) ${steps[i].step}`);
        document.getElementById(`s${i + 1}`).parentElement.style.display = "block";
      }
    }    
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-step/nr/' + id, true);
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
        document.getElementById(`a${i + 1}`).innerHTML = `${obj.quantity}` + ` ${obj.measurement}`;
        document.getElementById(`a${i + 1}`).parentElement.style.display = "block";
      }
    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-ingredient/' + recipeid, true);
  xmlhttp.send();
}

function ingredientName(id, i) {
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      var ingredient = JSON.parse(this.responseText);
      document.getElementById(`i${i + 1}`).innerHTML = `${ingredient.name}`;
      document.getElementById(`i${i + 1}`).parentElement.style.display = "";
    }
  }
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/ingredient/' + id, true);
  xmlhttp.send();
}

function ingredientNutrition(id) {
  var xmlhttp = new XMLHttpRequest();
  var ingID = 0;
  var amount = 0;
  xmlhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {

      var nutrition = JSON.parse(this.responseText);
      var array = [];

      for (let index = 0; index < nutrition.length; index++) {

        ingID = nutrition[index].ingredient_id;
        amount = nutrition[index].quantity;
        var object = { "id": ingID, "amount": amount }
        array.push(object);
      }

      //var arrayToString = JSON.stringify(Object.assign({}, array));  // convert array to string
      //var stringToJsonObject = JSON.parse(arrayToString);  // convert string to json object
      //console.log(stringToJsonObject);
      //JSON.stringify(array);
      console.log(array);
      return array;
    }
  }
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-ingredient/' + id, true);
  xmlhttp.send();
}

/*function ingredientNutrition(id, i, quantity){
  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      var ingredient = JSON.parse(this.responseText);
      console.log((quantity/100)*ingredient.calories)
    }
  }
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe-ingredient/' + recipeid, true);
  xmlhttp.send(); 
}*/

//Display Nutrition
function recipenutrition() {
  var xmlhttp = new XMLHttpRequest();
  const argcount = arguments.length;
  const myArgs = arguments;
  xmlhttp.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {

      var nutritions = JSON.parse(this.responseText);

      var totalcalories, totalprotein, totalcarbo, totalfat;
      totalcalories = totalprotein = totalcarbo = totalfat = 0;
      var totalenergy, energyprotein, energycarbo, energyfat;
      totalenergy = energyprotein = energycarbo = energyfat = 0;

      for (let index = 0; index < argcount; index++) {
        let nutrition = nutritions.find(({ id }) => id == myArgs[index].id);

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
      $("#protein").html(Number(totalprotein.toFixed(1)) + " g");
      $("#carbo").html(Number(totalcarbo.toFixed(1)) + " g");
      $("#fat").html(Number(totalfat.toFixed(1)) + " g");

      drawChart(totalfat, totalprotein, totalcarbo);
    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/ingredient', true);
  xmlhttp.send();
}





//<-------------------------------------------------- RECIPE'S FILTER -------------------------------------------------->

var card = localStorage.getItem("cardID");
console.log(card);

if (card == 1) { recipe1(); }
if (card == 2) { recipe2(); }
if (card == 3) { recipe3(); }
if (card == 4) { recipe4(); }
if (card == 5) { recipe5(); }
if (card == 6) { recipe6(); }
if (card == 7) { recipe7(); }
if (card == 8) { recipe8(); }
if (card == 9) { recipe9(); }
if (card == 10) { recipe10(); }
if (card == 11) { recipe11(); }
if (card == 12) { recipe12(); }
if (card == 13) { recipe13(); }
if (card == 14) { recipe14(); }
if (card == 15) { recipe15(); }
if (card == 16) { recipe16(); }
if (card == 17) { recipe17(); }
if (card == 18) { recipe18(); }
if (card == 19) { recipe19(); }
if (card == 20) { recipe20(); }
if (card == 21) { recipe21(); }
if (card == 22) { recipe22(); }
if (card == 23) { recipe23(); }
if (card == 24) { recipe24(); }

//<----------------------------------------------------- RECIPES ------------------------------------------------------>

function recipe1() {
  recipeInfo(1);
  //Ingredients ID (same as above)
  //(GRAMS) amount = QUANTITY / 100 (e.g 555g of rice = 5.55)
  //(MILILITERS) Since g = ml 100g = 100ml, same logic. Amount for liquids =  QUANTITY / 100 (e.g 750ml of water = 7.5)
  //1 tbsp of salt = 17g / amount = 17 / 100 = 0.17
  recipenutrition({"id":3,"amount":5.55},{"id":2,"amount":7.5},{"id":78,"amount":0.17});
}

function recipe2() {
  recipeInfo(2);
  recipenutrition({"id":4,"amount":0.133}, {"id":5,"amount":4.535}, {"id":6,"amount":3.4}, {"id":7,"amount":5.62}, {"id":58,"amount":1.1});
}

function recipe3() {
  recipeInfo(3);
  //8) 1 5oz (mid term) chicken breast = 142 g
  //10) 1 tomato = 123 g
  //11) 1 lettuce leaf = 8 g
  //12) 1 tbsp light mayo = 15g
  recipenutrition({"id":8,"amount":1.42}, {"id":9,"amount":1.05}, {"id":111,"amount":0.765}, {"id":11,"amount":0.16}, {"id":12,"amount":0.15});
}

function recipe4() {
  recipeInfo(4);
  //77) 1 egg = 50 g
  //83) 1 tbsp of salt = 17g
  //13) 1 tbsp of b pepper = 7g
  recipenutrition({"id":73,"amount":0.5}, {"id":78,"amount":0.085}, {"id":13,"amount":0.035}, {"id":5,"amount":4.5}, {"id":14,"amount":0.6}, {"id":47,"amount":0.56});
}

function recipe5() {
  recipeInfo(5);

  //  6 pickling cucumbers
  //  2 shallots
  //  2 teaspoons mustard seeds
  //  ½ teaspoon ground turmeric
  //  2 star anise
  //  75 g caster sugar
  //  150 ml vinegar

  recipenutrition();
}

function recipe6() {
  recipeInfo(6);

  // 2 medium onions
  // 1 x 400 g tin chickpeas
  //  1-2 fresh green chillies
  //  2 tablespoons sunflower oil
  //  1 teaspoon mustard seeds
  // ½ teaspoon asafoetida
  //  1-2 teaspoon sugar , optional
  //  ½ x 400 g tin of tomatoes
  //  1 teaspoon fresh ginger paste
  //  1 teaspoon garlic paste
  //  1 teaspoon green chilli paste
  //  1 teaspoon red chilli powder
  //  1 teaspoon turmeric
  //  1 teaspoon dhana jeera powder
  //  1-2 teaspoon sugar , optional
  //  a few sprigs of fresh coriander
  //  ½ teaspoon garam masala




  recipenutrition();
}

function recipe7() {
  recipeInfo(7)

  //75 ml sunflower oil , plus extra for greasing
  //6 tbsp ground flaxseed
  //1 x 400g tin of aduki beans
  //200 g soft light brown sugar
  //55 g cocoa powder
  //55 g ground almonds
  //1 tsp gluten-free baking powder
  //1 tsp vanilla extract
  //100 g dark dairy-free chocolate
  //200 ml coconut cream
  //3 tbsp icing sugar
  //1/2 tsp vanilla extract



  recipenutrition();
}

function recipe13() {
  recipeInfo(13);

  //2 leg/breast piece,   8  - 91
  //3 potatoes,           48 - 92
  //2 slices of bread,    47 - 93
  //1 tbsp of salt,       78 - 14
  //350ml of oil          4  - 95
  recipenutrition({ "id": 8, "amount": 3.44 }, { "id": 48, "amount": 4 }, { "id": 47, "amount": 0.8 }, { "id": 78, "amount": 0.17 }, { "id": 4, "amount": 3.2 });
}

function recipe14() {
  recipeInfo(14);

  //1 leg/breast piece,    8   - 96
  //2 eggs,                73  - 97
  //2 flatbread,           49  - 98
  //1 tbsp of salt,        78  - 99
  //2 tbsp of chili sauce, 113 - 100
  //15ml oil               61  - 101
  recipenutrition({ "id": 8, "amount": 1.7 }, { "id": 73, "amount": 1.2 }, { "id": 49, "amount": 0.7 }, { "id": 78, "amount": 0.17 }, { "id": 113, "amount": 0.34 }, { "id": 61, "amount": 0.15 });
}

function recipe15() {
  recipeInfo(15);

  //200g chestnut mushrooms   27 - 102
  //3 garlic cloves           15 - 104
  //2 fresh rosemary sprigs   16 - 105
  //3 leeks                   17 - 106
  //125ml dry white wine      18 - 107
  //90ml soya cream           19 - 108
  //350g pasta                20 - 109
  //parsley                   31 - 110

  recipenutrition({ "id": 27, "amount": 2 }, { "id": 15, "amount": 0.15 }, { "id": 16, "amount": 0.026 }, { "id": 17, "amount": 2.7 }, { "id": 18, "amount": 1.25 }, { "id": 19, "amount": 0.9 }, { "id": 20, "amount": 3.5 }, { "id": 31, "amount": 0.55 });
}

function recipe16() {
    recipeInfo(16);

    //1 tbsp olive oil            4 
    //2 red onions, chopped       38
    //1 red chilli                22
    //1 garlic clove, sliced      15
    //coriander                   69 
    //2 cans cherry tomatoes      25
    //1 tsp caster sugar          60
    //4 eggs                      77


    recipenutrition({ "id": 4, "amount": 0.0532 }, { "id": 38, "amount": 2.2 }, { "id": 22, "amount": 1.1 }, { "id": 15, "amount": 0.055 }, 
		    { "id": 69, "amount": 1.25 }, { "id": 25, "amount": 4.0 }, { "id": 60, "amount": 0.13 }, { "id": 77, "amount": 2.0 });

}


function recipe17() {
    recipeInfo(17);

    //3 cups canned white beans, drained and washed
    //8 oz package of tempeh, cubed into ½-inch pieces
    //1 tbsp extra virgin olive oil
    //1 medium onion, diced
    //2 medium carrots, sliced
    //2 stalks of celery, diced
    //5 cloves garlic, finely minced
    //15 mushrooms sliced
    //2 tomatoes diced
    //1 tbsp chopped sage
    //1 tbsp chopped thyme
    //2 bay leaves
    //2 tbsp parsley, chopped
    //½ cup red wine, optional
    //Salt and ground black pepper to taste
    recipenutrition({ "id": 23, "amount": 5.10 }, { "id": 24, "amount": 2.27 }, { "id": 4, "amount": 0.13 }, { "id": 58, "amount": 1.10 }, 
		    { "id": 25, "amount": 1.56 }, { "id": 26, "amount": 1.06 }, { "id": 15, "amount": 0.30 }, { "id": 27, "amount": 2.34}, 
		    { "id": 111, "amount": 2.46 }, { "id": 28, "amount": 0.02 }, { "id": 29, "amount": 0.03 }, { "id": 30, "amount": 0.025 },
		    { "id": 31, "amount": 0.0324 }, { "id": 32, "amount": 1.25 }, { "id": 78, "amount": 0.0036 }, { "id": 13, "amount": 0.0005 });
}

function recipe18(){
  recipeInfo(18);

  //1 cup all-purpose flour         33 - 133
  //1 tablespoon white sugar        62 - 134
  //2 teaspoons baking powder       34 - 135
  //¼ teaspoon salt                 78 - 136
  //1 egg, beaten                   73 - 137
  //1 cup plant based milk          35 - 138
  //2 tablespoons vegetable oil     36 - 139
  //2 ripe bananas, mashed          1  - 140

  recipenutrition({"id":33,"amount":1.25},{"id":62,"amount":0.12},{"id":34,"amount":0.008},{"id":78,"amount":0.001},{"id":73,"amount":0.57}, 
		  {"id":35,"amount":2.4}, {"id":36,"amount":0.26}, {"id":1,"amount":2.4});
}
function recipe19() {
  recipeInfo(19);

  // red onion 1, chopped                      id=37/110g
  // garlic 2 cloves, chopped                  id=15/14g 
  // olive oil                                 id=4 /28g
  // ground cumin ½ tsp                        id=38/3.04g   
  // ground coriander ½ tsp                    id=65/2.53g     
  // ground cinnamon ½ tsp                     id=39/3.95g 
  // red pepper 1, seeded and chopped          id=40/119g       
  // courgette 1, chopped                      id=41/196g 
  // aubergine 1, chopped                      id=42/300g   
  // vine tomatoes 4, chopped                  id=10/480g     
  // chickpeas 400g tin, rinsed and drained    id=43/400g 
  // vegetable stock 250ml                     id=95/128g 
  // harissa 2 tbsp                            id=44/28g 
  // prunes 4, pitted and sliced               id=45/38g 
  // flat-leaf parsley chopped to serve        id=31/56g 
  // steamed couscous to serve (optional)      id=46/250g

  recipenutrition({ "id": 37, "amount": 1.1 }, { "id": 15, "amount": 0.14 },
    { "id": 4, "amount": 0.1 }, { "id": 38, "amount": 0.0304 },
    { "id": 65, "amount": 0.0253 }, { "id": 39, "amount": 0.9 },
    { "id": 109, "amount": 0.0395 }, { "id": 40, "amount": 1.19 },
    { "id": 41, "amount": 1.96 }, { "id": 42, "amount": 3 },
    { "id": 10, "amount": 4.8 }, { "id": 43, "amount": 4 },
    { "id": 95, "amount": 1.28 }, { "id": 44, "amount": 0.28 },
    { "id": 45, "amount": 0.38 }, { "id": 31, "amount": 0.56 },
    { "id": 46, "amount": 2.5 });
}
function recipe20() {
  recipeInfo(20);

  // 125g gluten-free plain flour    id=74/125g
  // 1 egg                           id=73/50g         
  // 250ml milk                      id=75/255.72g       
  // cooking oil                     id=61/56g
  // Sugar 50g                       id=62/50g             

  recipenutrition({ "id": 74, "amount": 1.25 }, { "id": 74, "amount": 0.5 }, { "id": 75, "amount": 2.5572 },
    { "id": 61, "amount": 0.56 }, { "id": 62, "amount": 0.5 });
}
function recipe21() {
  recipeInfo(21);

  // 400g can chickpeas               id=59/400g
  // 100ml lemon juice                id=76/97.2g 
  // 150ml olive oil                  id=4/135g
  // 125g tahini                      id=87/125g
  // 1.5tbs ground coriander          id=54/2.7g
  // 5 cardamon pods                  id=77/1g

  recipenutrition({ "id": 59, "amount": 4 }, { "id": 76, "amount": 0.972 }, { "id": 4, "amount": 1.35 }, 
                  { "id": 106, "amount": 0.027 }, { "id": 54, "amount": 0.027 }, { "id": 77, "amount": 0.01 });
}
function recipe22() {
	//Gluten free bread
	recipeInfo(22);
	/*
	 * id:74 gluten-free plain flour 400.0g
	 * id:78 salt 1 tsp -> 5.9g
	 * id:79 dried yeast 7.0g
	 * id:80 buttermilk 284ml
	 * id:73 egg 2unit -> 100g
	 * id:4 olive oil 2tbsp -> 8.88g
	 */
	recipenutrition({ "id": 74, "amount": 4.00 }, { "id": 78, "amount": 0.059 }, { "id": 79, "amount": 0.07 }, { "id": 80, "amount": 2.84 }, { "id": 73, "amount": 1.00 }, { "id": 4, "amount": 0.088 });
}

function recipe23() {
	//Candied Bacon
	recipeInfo(23);
	/*
	 * id:67 brown sugar 110g
	 * id:107 bacon 225g
	 */
	recipenutrition({ "id": 67, "amount": 1.1 }, { "id": 107, "amount": 2.25 });
}

function recipe24() {
	//Root Beer Milkshake
	recipeInfo(24);
	/*
	 * id:108 vanilla ice cream 75g
	 * id:75 milk 250ml
	 * id:109 root beer 120ml
	 */ 
	recipenutrition({ "id": 108, "amount": 0.75 }, { "id": 75, "amount": 2.5 }, { "id": 109, "amount": 1.2 });
}

