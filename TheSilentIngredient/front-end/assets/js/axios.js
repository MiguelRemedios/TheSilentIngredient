//FUNCTION FOR THE HTTP GET REQUEST
const getData = () => {
  axios.get('http://localhost:8080/api/v1/recipe').then(response => {
    console.log(response);
  });
};

//FUNCTION FOR THE HTTP PUT REQUEST
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

//FUNCTION FOR THE HTTP DELETE REQUEST
const deleteData = () => {
  axios.delete('http://localhost:8080/api/v1/recipe/4').then(response => {
    console.log(response);
  });
};

//FUNCTION FOR THE HTTP POST REQUEST
const updateData = () => {
  axios
    .put(
      'http://localhost:8080/api/v1/recipe/4?recipeName=Sardines&recipeDesc=Seafood',
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

getData();