const getBtn = document.getElementById('get-btn');
const postBtn = document.getElementById('post-btn');

const getData = () => {
  axios.get('http://localhost:8080/api/v1/recipe').then(response => {
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

getBtn.addEventListener('click', getData);
postBtn.addEventListener('click', sendData);
