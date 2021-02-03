//<------------------------------------------TESTING CRUD HTTP REQUEST METHODS---------------------------------------------------------->
//<----------------------------------------------{GET, POST, DELETE, PUT}--------------------------------------------------------------->
const getAllData = () => {
  axios.get('http://localhost:8080/api/v1/recipe').then(response => {
    console.log(response);
    });
  };

const getData = (url) => {
  axios.get(url).then(response => {
    console.log(response);
    });
};

const sendData = () => {
  axios
    .post(
      'http://localhost:8080/api/v1/recipe',
      {
        name: 'BigMac',
        description: 'Bread with meat'
      },
      {
        // headers: {
        //   'Content-Type': 'application/json'
        // }
      }
    )
    .then(response => {
      console.log(response);
    })
    .catch(err => {
      console.log(err, err.response);
    });
};

const deleteData = () => {
  axios.delete('http://localhost:8080/api/v1/recipe/4').then(response => {
    console.log(response);
  });
};

const updateData = () => {
  axios
    .put(
      'http://localhost:8080/api/v1/recipe/3?recipeName=Sardines&recipeDesc=Seafood&serving=10&cooktime=30min',
      {
        // headers: {
        //   'Content-Type': 'application/json'
        // }
      }
    )
    .then(response => {
      console.log(response);
    })
    .catch(err => {
      console.log(err, err.response);
    });
};

//<---------------------------------------------------------------------------------------------------------->

function recipe1(){
  
  /*var recipe1 = getData('http://localhost:8080/api/v1/recipe/1');
  console.log(recipe1);
  document.querySelector('#a1').innerHTML = 'HELLO';*/

  var xmlhttp = new XMLHttpRequest();
  xmlhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {

      var recipe = JSON.parse(this.responseText);
      document.getElementById("r1").innerHTML = `${recipe.name}`;
      document.getElementById("r2").innerHTML = `${recipe.description}`;
      document.getElementById("r3").innerHTML = `Serving: ${recipe.serving}`;
      document.getElementById("r4").innerHTML = `Cooking Time: ${recipe.cooktime}`;
      document.getElementById("imageBox").src="images/chickenmasala.jpg";
      document.getElementById("image1").src="images/chickenmasala.jpg";
      document.getElementById("image2").src="images/chickenmasala.jpg";
      document.getElementById("image3").src="images/chickenmasala.jpg";
      document.getElementById("image4").src="images/chickenmasala.jpg";
      document.getElementById("image5").src="images/chickenmasala.jpg";

    }
  };
  xmlhttp.open("GET", 'http://localhost:8080/api/v1/recipe/1', true);
  xmlhttp.send();

}

recipe1();