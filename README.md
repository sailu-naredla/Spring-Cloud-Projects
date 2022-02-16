# Spring-Cloud-Projects

#Address service endpoints
http://localhost:9001/addresses/
POST
Content-Type: application/json
request:
{
    "type":"Perminent",
    "address1":"Airport Road",
    "address2":"Viman nagar",
    "city":"Pune",
    "country":"India",
    "zip":"410066"

}

Response:
{
    "addressId": 1,
    "type": "Perminent",
    "address1": "Airport Road",
    "address2": "Viman nagar",
    "city": "Pune",
    "country": "India",
    "zip": "410066"
}


http://localhost:9001/addresses/1
GET

Response:
{
    "addressId": 1,
    "type": "Perminent",
    "address1": "Airport Road",
    "address2": "Viman nagar",  Technical Lead - Product and Platform Engineering
    "city": "Pune",
    "country": "India",
    "zip": "410066"
}

#Customer service endpoints

http://localhost:9002/customers/
POST
Content-Type: application/json

request:
{
    "name":"Mydreams Media",
    "email":"support@mydereams.net",
    "addressId":"1"

}

response:
{
    "customerId": 1,
    "name": "Mydreams Media",
    "email": "support@mydereams.net",
    "addressId": 1
}

http://localhost:9002/customers/1
GET
response:
{
    "customer": {
        "customerId": 1,
        "name": "Mydreams Media",
        "email": "support@mydereams.net",
        "addressId": 1
    },
    "address": {
        "addressId": 1,
        "type": "Perminent",
        "address1": "Airport Road",
        "address2": "Viman nagar",
        "city": "Pune",
        "country": "India",
        "zip": "410066"
    }
}
