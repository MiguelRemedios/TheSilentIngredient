function dietEngine() {

    var recipeFilter = JSON.parse(localStorage.getItem("recipesFilter"));

    var showRecipesArray = [];
    var hideRecipesArray = [];

    var GeneralDiet = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24];
    var VeganDiet = [1, 5, 6, 7, 9, 10, 15, 17, 19, 21];
    var VegetarianDiet = [8, 9, 10, 1, 24, 5, 6, 7, 15, 16, 17, 18, 19, 20, 21, 22];
    var HalalDiet = [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 18, 19, 20, 21, 22];
    var LactoseFreeDiet = [1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 21, 23];
    var GlutenfreeDiet = [1, 5, 6, 16, 18, 20, 21, 22];

    //OPTION 0
    if (document.getElementById('sel3').value == "0") {
        //This will get the non common elements of both arrays.
        hideRecipesArray = recipeFilter.filter(recipeID => !GeneralDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => GeneralDiet.includes(recipeID));
        var x = document.getElementById("option0").textContent;
        console.log(x);
    }

   //OPTION 1
    if (document.getElementById('sel3').value == "1") {
        //This will get the non common elements of both arrays.
        hideRecipesArray = recipeFilter.filter(recipeID => !VeganDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => VeganDiet.includes(recipeID));
        var x = document.getElementById("option1").textContent;
        console.log(x);
    }

    //OPTION 2
    if (document.getElementById('sel3').value == "2") {
        hideRecipesArray = recipeFilter.filter(recipeID => !VegetarianDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => VegetarianDiet.includes(recipeID));
        var x = document.getElementById("option2").textContent;
        console.log(x);
    }

   //OPTION 3
    if (document.getElementById('sel3').value == "3") {
        hideRecipesArray = recipeFilter.filter(recipeID => !HalalDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => HalalDiet.includes(recipeID));
        var x = document.getElementById("option3").textContent;
        console.log(x);
    }

   //OPTION 4
    if (document.getElementById('sel3').value == "4") {
        hideRecipesArray = recipeFilter.filter(recipeID => !LactoseFreeDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => LactoseFreeDiet.includes(recipeID));
        var x = document.getElementById("option4").textContent;
        console.log(x);
    }

    //OPTION 5
    if (document.getElementById('sel3').value == "5") {
        hideRecipesArray = recipeFilter.filter(recipeID => !GlutenfreeDiet.includes(recipeID));
        //This will get the common elements of both arrays.
        showRecipesArray = recipeFilter.filter(recipeID => GlutenfreeDiet.includes(recipeID));
        var x = document.getElementById("option5").textContent;
        console.log(x);
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



    console.log('%cAll recipes:\n' + recipeFilter.length + ') ' + recipeFilter, 'color: #B9F5FF');
    console.log("%cRecipes to hide:\n" + hideRecipesArray.length + ") "  + hideRecipesArray, 'color: #FF8484');
    console.log("%cRecipes to display:\n" + showRecipesArray.length + ") "  + showRecipesArray, 'color: #9CFF67');
}