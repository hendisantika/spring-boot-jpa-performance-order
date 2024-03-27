# spring-boot-jpa-performance-order

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-jpa-performance-order.git`
2. Navigate to the folder: `cd spring-boot-jpa-performance-order`
3. Run the application: `mvn clean spring-boot:run`
4. Open your favorite browser: 

### Get All Orders

GET http://localhost:8080/api/v1/orders

```shell
[
  {
    "orderId": 1,
    "name": "Song Hye Kyo",
    "orderDate": "2024-03-27T07:30:55.583438",
    "items": [
      {
        "itemName": "Jay Book",
        "itemPrice": 10000,
        "itemCount": 1,
        "orderPrice": 10000
      },
      {
        "itemName": "Su Book",
        "itemPrice": 20000,
        "itemCount": 1,
        "orderPrice": 20000
      }
    ],
    "totalPrice": 30000,
    "orderStatus": "ORDERED",
    "address": {
      "city": "Seoul",
      "street": "Gangnam",
      "zipcode": "12345"
    }
  },
  {
    "orderId": 2,
    "name": "Rain",
    "orderDate": "2024-03-27T07:30:55.584482",
    "items": [
      {
        "itemName": "Su Book",
        "itemPrice": 20000,
        "itemCount": 1,
        "orderPrice": 20000
      }
    ],
    "totalPrice": 20000,
    "orderStatus": "ORDERED",
    "address": {
      "city": "Seoul",
      "street": "Gangnam",
      "zipcode": "12345"
    }
  },
  {
    "orderId": 3,
    "name": "Song Hye Kyo",
    "orderDate": "2024-03-27T07:30:55.584888",
    "items": [
      {
        "itemName": "Jay Book",
        "itemPrice": 10000,
        "itemCount": 1,
        "orderPrice": 10000
      }
    ],
    "totalPrice": 10000,
    "orderStatus": "ORDERED",
    "address": {
      "city": "Seoul",
      "street": "Gangnam",
      "zipcode": "12345"
    }
  }
]
```

### Get All Orders V2

GET http://localhost:8080/api/v2/orders

```shell
[
  {
    "orderId": 1,
    "name": "Song Hye Kyo",
    "orderDate": "2024-03-27T07:30:55.583438",
    "items": [
      {
        "itemName": "Jay Book",
        "itemPrice": 10000,
        "itemCount": 1,
        "orderPrice": 10000
      },
      {
        "itemName": "Su Book",
        "itemPrice": 20000,
        "itemCount": 1,
        "orderPrice": 20000
      }
    ],
    "totalPrice": 30000,
    "orderStatus": "ORDERED",
    "address": {
      "city": "Seoul",
      "street": "Gangnam",
      "zipcode": "12345"
    }
  },
  {
    "orderId": 2,
    "name": "Rain",
    "orderDate": "2024-03-27T07:30:55.584482",
    "items": [
      {
        "itemName": "Su Book",
        "itemPrice": 20000,
        "itemCount": 1,
        "orderPrice": 20000
      }
    ],
    "totalPrice": 20000,
    "orderStatus": "ORDERED",
    "address": {
      "city": "Seoul",
      "street": "Gangnam",
      "zipcode": "12345"
    }
  },
  {
    "orderId": 3,
    "name": "Song Hye Kyo",
    "orderDate": "2024-03-27T07:30:55.584888",
    "items": [
      {
        "itemName": "Jay Book",
        "itemPrice": 10000,
        "itemCount": 1,
        "orderPrice": 10000
      }
    ],
    "totalPrice": 10000,
    "orderStatus": "ORDERED",
    "address": {
      "city": "Seoul",
      "street": "Gangnam",
      "zipcode": "12345"
    }
  }
]
```

### Get All Orders V3

GET http://localhost:8080/api/v3/orders

```shell
[
  {
    "orderId": 1,
    "name": "Song Hye Kyo",
    "orderDate": "2024-03-27T07:30:55.583438",
    "items": [
      {
        "itemName": "Jay Book",
        "itemPrice": 10000,
        "itemCount": 1,
        "orderPrice": 10000
      },
      {
        "itemName": "Su Book",
        "itemPrice": 20000,
        "itemCount": 1,
        "orderPrice": 20000
      }
    ],
    "totalPrice": 30000,
    "orderStatus": "ORDERED",
    "address": {
      "city": "Seoul",
      "street": "Gangnam",
      "zipcode": "12345"
    }
  },
  {
    "orderId": 2,
    "name": "Rain",
    "orderDate": "2024-03-27T07:30:55.584482",
    "items": [
      {
        "itemName": "Su Book",
        "itemPrice": 20000,
        "itemCount": 1,
        "orderPrice": 20000
      }
    ],
    "totalPrice": 20000,
    "orderStatus": "ORDERED",
    "address": {
      "city": "Seoul",
      "street": "Gangnam",
      "zipcode": "12345"
    }
  },
  {
    "orderId": 3,
    "name": "Song Hye Kyo",
    "orderDate": "2024-03-27T07:30:55.584888",
    "items": [
      {
        "itemName": "Jay Book",
        "itemPrice": 10000,
        "itemCount": 1,
        "orderPrice": 10000
      }
    ],
    "totalPrice": 10000,
    "orderStatus": "ORDERED",
    "address": {
      "city": "Seoul",
      "street": "Gangnam",
      "zipcode": "12345"
    }
  }
]
```
