# generic-searchms

This is a generic Search microservice which uses Messaging Queue(kafka) and ElasticSearch.
The application will consume the event published to MQ, parse it and persist the same in ElasticSearch.
Once the data is persisted in ES, you can query the data by calling get API

# Exposed APIs
1. /getAll - To get all data persisted in ES
   
    curl --location 'http://localhost:8080/getAll' \
    --data ''
   
2. /get - To query specific documents from ES

    curl --location --request GET 'http://localhost:8080/get' \
    --header 'Content-Type: application/json' \
    --data '{
        "searchField": "address.street",
        "searchValue": "Boylston St"
    }'

# Prerequisites
Kafka
ElasticSearch
Java
Maven
Conduktor(Optional)

# How to run the application

1. Clone the repository
2. Run mvn clean install
3. Start Kafka and ElasticSearch
4. Run the application
5. Publish message from kafka
6. Query ES using given APIs
   
