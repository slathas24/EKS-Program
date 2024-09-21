const express=require('express');
const app=express();

const port=3000;

app.get('/user/:username',(req,res) => {
  const username = req.params.username;
  const response = {
      message: `Hello, ${username}!`,
      username: username
    };
  res.json(response);
});

app.listen(port,() => {
    console.log(`server running at http://localhost:${port}`);
});
