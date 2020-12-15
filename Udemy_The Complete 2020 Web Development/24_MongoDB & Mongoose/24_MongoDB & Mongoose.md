
## mongoDB shortcut

-> https://medium.com/@LondonAppBrewery/how-to-download-install-mongodb-on-windows-4ee4b3493514 (G부터~)



- mongoDB 실행

- hyper에 "mongo" 입력

- use "데이터베이스명"  (use shopDB)

- db."테이블명".insertOne() (db.products.insertOne({ _id: 1, name: "pen" })

- show collections (= 테이블명 나옴)

-----

## MongoDB CRUD Operations in the Shell: Reading & Queries

```
db.products.find( {price: {$gt:1.0} })

// $gt란 greater than으로, 1.0보다 큰 것을 찾는다는 말
```

```
db.employee.find({status : "C"}) 

// SELECT * FROM employee WHERE status = 'C'
```

```
db.employee.find({status : "C"}, {ename : 1}) 

//SELECT ename FROM employee WHERE status = 'C'
```

```
db.employee.find({status : "C"}, {_id: 0, ename : 1}) 

//불필요한 field의경우 _id 값처럼 0값으로 지정.
```

-----

## Introduction to Mongoose

mongoose: mongoDB의 라이브러리 (자바스크립트와 jQuery 관계와 비슷)

-----

## Working with The Native MongoDB Driver

mongoDB node.js Driver 참조URL: 

https://mongodb.github.io/node-mongodb-native/3.6/quick-start/quick-start/

-----

## Mongoose Query

_[mongoDB create]_
```
// Connection url
const url = 'mongodb://localhost:27017';
 const MongoClient = require('mongodb').MongoClient;
 const assert = require('assert');
 
// Connection url
const url = 'mongodb://localhost:27017';
// Database Name
const dbName = 'fruitsDB';
 
// Create a new MongoClient
const client = new MongoClient(url,{ useUnifiedTopology: true });
 
// Connect using MongoClient
client.connect(function(err){
  assert.equal(null,err);
  console.log("Connected successfully to server");
 
  const db = client.db(dbName);
 
insertDocuments(db,function(){ // insert됨
    client.close();
});
findDocuments(db,function(){ // find(select)
    client.close();
});
});
```
==

_[mongoose create]_

```
const mongoose = require('mongoose');
 
mongoose.connect("mongodb://localhost:27017/fruitsDB");
```
* * *
_[mongoDB Insert]_
```
const insertDocuments = function(db, callback) {
  // Get the documents collection
  const collection = db.collection('fruits');
  // Insert some documents
  collection.insertMany([
    {name :"Apple",
    score: 7,
    review: "great fruit"},
    {name :"Orange",
    score: 6,
    review: "kinda sour"},
    {name :"Banana",
    score: 7,
    review: "Greate stuff"}
  ], function(err, result) {
    assert.equal(err, null);
    assert.equal(3, result.result.n);
    assert.equal(3, result.ops.length);
    console.log("Inserted 3 documents into the collection");
    callback(result);
  });
}
```
==

_[mongoose Insert]_

```
const fruitSchema = new mongoose.Schema ({
  name: String,
  rating: Number,
  review: String
}); // foundation
 
const Fruit = mongoose.model("Fruit", fruitSchema); // Fruit 객체?로 간소화
 
const apple= new Fruit({
  name: "apple",
  rating: 5,
  review: "Pretty good"
});
 
apple.save(); // insert One
```

* * *

_[mongoDB Find]_
```
const findDocuments = function(db, callback) {
  // Get the documents collection
  const collection = db.collection('fruits');
  // Find some documents
  collection.find({}).toArray(function(err, fruits) {
    assert.equal(err, null);
    console.log("Found the following records");
    console.log(fruits);
    callback(fruits);
  });
}
```
==

_[mongoose Find]_
```
Fruit.find(function(err, fruits){
  if(err){
    console.log(err);
  }else{
    console.log(fruits);
  }
});
```

