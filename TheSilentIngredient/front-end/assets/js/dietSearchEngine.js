function dietEngine() {

    var recipeFilter = JSON.parse(localStorage.getItem("recipesFilter"));

    var showRecipesArray = [];
    var hideRecipesArray = [];

    var GeneralDiet = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24];
    //var healthyRecipes = [1, 9, 10, 11, 15, 17, 18, 20, 21];
    var VeganDiet = [1, 5, 6, 7, 9, 10, 15, 17, 19, 21];
    var VegetarianDiet = [8, 9, 10, 1, 24, 5, 6, 7, 15, 16, 17, 18, 19, 20, 21, 22];
    var HalalDiet = [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19, 20, 21, 22];
    var LactoseFreeDiet = [1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 21, 23];
    var GlutenfreeDiet = [1, 5, 6, 16, 18, 20, 21, 22];

    //OPTION 0
    if (document.getElementById('sel3').value == "0") {
        $("#healthy").prop("checked", false);
        //This will get the non common elements of both arrays.
        hideRecipesArray = recipeFilter.filter(recipeID => !GeneralDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => GeneralDiet.includes(recipeID));
    }

    /*//OPTION 01
    if (document.getElementById('sel3').value == "01") {
        $("#healthy").prop("checked", false);
        //This will get the non common elements of both arrays.
        hideRecipesArray = recipeFilter.filter(recipeID => !healthyRecipes.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => healthyRecipes.includes(recipeID));
    }*/

   //OPTION 1
    if (document.getElementById('sel3').value == "1") {
        $("#healthy").prop("checked", false);
        //This will get the non common elements of both arrays.
        hideRecipesArray = recipeFilter.filter(recipeID => !VeganDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => VeganDiet.includes(recipeID));
    }

    //OPTION 2
    if (document.getElementById('sel3').value == "2") {
        $("#healthy").prop("checked", false);
        hideRecipesArray = recipeFilter.filter(recipeID => !VegetarianDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => VegetarianDiet.includes(recipeID));
    }

   //OPTION 3
    if (document.getElementById('sel3').value == "3") {
        $("#healthy").prop("checked", false);
        hideRecipesArray = recipeFilter.filter(recipeID => !HalalDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => HalalDiet.includes(recipeID));
    }

   //OPTION 4
    if (document.getElementById('sel3').value == "4") {
        $("#healthy").prop("checked", false);
        hideRecipesArray = recipeFilter.filter(recipeID => !LactoseFreeDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => LactoseFreeDiet.includes(recipeID));
    }

    //OPTION 5
    if (document.getElementById('sel3').value == "5") {
        $("#healthy").prop("checked", false);
        hideRecipesArray = recipeFilter.filter(recipeID => !GlutenfreeDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => GlutenfreeDiet.includes(recipeID));

    }

    for (const recipeID of hideRecipesArray) {
        var rID = document.getElementById(recipeID);
        if (rID.style.display != "none") {
            rID.style.display = "none";  
        }
    }

    for (const recipeID of showRecipesArray) {
        document.getElementById(recipeID).style.display = "block";
    }

    localStorage.setItem("dietFilter", JSON.stringify(showRecipesArray));
}

function checkBox(checkbox){
    var recipeFilter = JSON.parse(localStorage.getItem("recipesFilter"));
    var dietFilter = JSON.parse(localStorage.getItem("dietFilter"));

    var healthyRecipes = [1, 9, 10, 11, 15, 17, 18, 20, 21];
    var showRecipesArray = [];
    var hideRecipesArray = [];

    const opt1 = document.getElementById("option1").selected;
    const opt2 = document.getElementById("option2").selected;
    const opt3 = document.getElementById("option3").selected;
    const opt4 = document.getElementById("option4").selected;
    const opt5 = document.getElementById("option5").selected;

    if (opt1 || opt2 || opt3 || opt4 || opt5) { //USE DIETFILTER ARRAY FROM LOCALSTORAGE
        if(checkbox.checked){
            hideRecipesArray = dietFilter.filter(recipeID => !healthyRecipes.includes(recipeID));
            showRecipesArray = dietFilter.filter(recipeID => healthyRecipes.includes(recipeID));

            for (const recipeID of hideRecipesArray) {
                var rID = document.getElementById(recipeID);
                if (rID.style.display != "none") {
                    rID.style.display = "none";  
                }
            }
        
            for (const recipeID of showRecipesArray) {
                document.getElementById(recipeID).style.display = "block";
            }
        }
        else{
            hideRecipesArray = dietFilter.filter(recipeID => !healthyRecipes.includes(recipeID));

            for (const recipeID of hideRecipesArray) {
                var rID = document.getElementById(recipeID);
                if (rID.style.display != "none") {
                    rID.style.display = "none";  
                }
            }
            for (const recipeID of dietFilter) {
                document.getElementById(recipeID).style.display = "block";
            }

        }
    }
    else{ //USE RECIPEFILTER ARRAY FROM LOCALSTORAGE
        if(checkbox.checked){
            hideRecipesArray = recipeFilter.filter(recipeID => !healthyRecipes.includes(recipeID));
            showRecipesArray = recipeFilter.filter(recipeID => healthyRecipes.includes(recipeID));

            for (const recipeID of hideRecipesArray) {
                var rID = document.getElementById(recipeID);
                if (rID.style.display != "none") {
                    rID.style.display = "none";  
                }
            }
        
            for (const recipeID of showRecipesArray) {
                document.getElementById(recipeID).style.display = "block";
            }
        }
        else{
            hideRecipesArray = recipeFilter.filter(recipeID => !healthyRecipes.includes(recipeID));

            for (const recipeID of hideRecipesArray) {
                var rID = document.getElementById(recipeID);
                if (rID.style.display != "none") {
                    rID.style.display = "none";  
                }
            }
            for (const recipeID of recipeFilter) {
                document.getElementById(recipeID).style.display = "block";
            }
        }
    }
}


function clearAll(){
    var ingredientArray = JSON.parse(localStorage.getItem("ingredientArray"));
    var recipesArray = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24];

    if (!(ingredientArray.length < 0 || ingredientArray === null)) {
        for (let index = 0; index < ingredientArray.length; index++) {
            $('#diva').remove(); 
        }
        for (const recipeID of recipesArray) {
            document.getElementById(recipeID).style.display = "block";
        }
        document.getElementById('sel3').value=0;
        ingredientArray = [];
        localStorage.setItem("dietFilter", JSON.stringify(recipesArray));
        localStorage.setItem("recipesFilter", JSON.stringify(recipesArray));
        localStorage.setItem("ingredientArray", JSON.stringify(ingredientArray));
    }
}