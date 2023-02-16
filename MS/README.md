
To run contaiers in docker
docker create network n1
docker run -d --name cust --network=n1 -p8090:8090 custimg

To Launch Acct create Enviornment varaibles
docker run -d --name acct -p8091:8091 --network=n1 -e CUST_URL=http://cust -e CUST_PORT=8090 acctimg
