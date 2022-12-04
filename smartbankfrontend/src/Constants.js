let protocol="http://"
let ip= process.env.REACT_APP_API_IP || "localhost"
let port = process.env.REACT_APP_API_PORT || "3000";
export const API_URL = protocol+ip+":"+port;
//export const API_URL = "http://localhost:8080/";
