# API Spec

## Create User

Request :
- Method : POST
- Endpoint : `/api/user/create`
- Body : 
```json
{
    "name" : "String",
    "dob" : "date",
    "gender": "String",
    "phone" : "String",
    "email" : "String",
    "address": "String"
}
```

Response : 
```json
{
  "status" : true,
  "message": "Successfully !",
  "data" : {
    "id" : "String, unique",
    "name" : "String",
    "dob" : "date",
    "gender": "String",
    "phone" : "String",
    "email" : "String",
    "address": "String",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```

## Get User

Request :
- Method : POST
- Endpoint : `/api/user/get`
- Body :
```json
{
    "id" : "String, unique"
}
```

Response :
```json
{
  "status" : true,
  "message": "Successfully !",
  "data" : {
    "id" : "String, unique",
    "name" : "String",
    "dob" : "date",
    "gender": "String",
    "phone" : "String",
    "email" : "String",
    "address": "String",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```

## Update User

Request :
- Method : POST
- Endpoint : `/api/user/update`
- Body :
```json
{
    "id" : "string, unique",
    "name" : "String",
    "dob" : "date",
    "gender": "String",
    "phone" : "String",
    "email" : "String",
    "address": "String"
}
```

Response :
```json
{
  "status" : true,
  "message": "Successfully !",
  "data" : {
    "id" : "String, unique",
    "name" : "String",
    "dob" : "date",
    "gender": "String",
    "phone" : "String",
    "email" : "String",
    "address": "String",
    "createdAt": "Date",
    "updatedAt": "Date"
  }
}
```

## List User
Request :
- Method : GET
- Endpoint : `/api/user/list`

Response :
```json
{
  "status" : true,
  "message": "Successfully !",
  "data" : [
    {
      "id" : "String, unique",
      "name" : "String",
      "dob" : "date",
      "gender": "String",
      "phone" : "String",
      "email" : "String",
      "address": "String",
      "createdAt": "Date",
      "updatedAt": "Date"
    },
    {
      "id" : "String, unique",
      "name" : "String",
      "dob" : "Date",
      "gender": "String",
      "phone" : "String",
      "email" : "String",
      "address": "String",
      "createdAt": "Date",
      "updatedAt": "Date"
    }
  ]
}
```

## Delete User

Request :
- Method : POST
- Endpoint : `/api/user/delete`
- Body :
```json
{
    "id" : "string, unique"
}
```

Response :
```json
{
  "status" : true,
  "message": "Successfully !",
  "data" : null
}
```