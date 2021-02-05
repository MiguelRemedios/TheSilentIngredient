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