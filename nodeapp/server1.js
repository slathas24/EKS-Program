var http = require('http');
const fs = require('fs');
var os=require('os')
var username="";
fs.readFile("/app/input/users.json", function(err, data) {
      if (err) throw err;
   username = JSON.parse(data).user;
});
var server = http.createServer(function(request, response) {

fs.appendFile("/app/output/user.log",os.hostname()+"-"+ username+":"+new Date()+"\r\n", err => {
    if (err) throw err; 
});
response.statusCode = 200;
response.setHeader('Content-Type', 'text/plain');
response.end('Welcome to the World !'+username);
});
server.listen(3000,function() {
console.log('Server running on port 3000');
});

