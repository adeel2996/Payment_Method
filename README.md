Endpoints

POST http://localhost:8080/api/v1.0/configuration/payment-methods
Sample Request
{
    "name": "payment method",
    "displayName": "display",
    "paymentType": "payment type",
    "paymentPlans": [
        {
            "netAmount": 2.25,
            "taxAmount": 2.69,
            "grossAmount": 5.25,
            "currency": "DOLLAR",
            "duration": "week"
        }
    ]
}

PUT http://localhost:8080/api/v1.0/configuration/payment-methods?id=1
Sample Request
{
    "name": "payment method",
    "displayName": "display name updated 1",
    "paymentType": "payment type",
    "paymentPlans": [
        {
            "id":4,
            "netAmount": 2.25,
            "taxAmount": 2.69,
            "grossAmount": 5.25,
            "currency": "DOLLAR updated 1",
            "duration": "week"
        }
    ]
}

GET http://localhost:8080/api/v1.0/configuration/payment-methods
with optional query parameters id and name.

This application is a Spring Boot application which uses H2 in-memory database.
