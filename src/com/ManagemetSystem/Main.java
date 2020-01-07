package com.ManagemetSystem;

import com.mongodb.MongoClient;
import com.mongodb.client.ListDatabasesIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static java.util.Collections.singletonList;

public class Main {

    public static void main(String[] args) {

        MongoClient mongoC = new MongoClient();

        ListDatabasesIterable<Document> availableDB = mongoC.listDatabases();

        MongoDatabase mongoDatabase = mongoC.getDatabase("Employees");
        //mongoDatabase.createCollection("General Info");

        MongoCollection mongoCollection = mongoDatabase.getCollection("General Info");

        Document canvas = new Document("item", "canvas")
                .append("qty", 100)
                .append("tags", singletonList("cotton"));

        Document size = new Document("h", 28)
                .append("w", 35.5)
                .append("uom", "cm");
        canvas.put("size", size);

        mongoCollection.insertOne(canvas);


        System.out.println(mongoCollection.count());

        Document myDoc = (Document) mongoCollection.find().first();
        System.out.println(myDoc.toJson());

        try (MongoCursor<Document> cursor = mongoCollection.find().iterator()) {
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        }

//        Document query = new Document();
//        query.put("item", "canvas");
//        FindIterable<Document> foundDocument =  mongoCollection.find(query);
//
//        Bson newValue = new Document("Made in", "China");
//        Bson updateOperation = new Document("$set", newValue);
//        mongoCollection.updateOne( foundDocument,updateOperation);


    }
}
