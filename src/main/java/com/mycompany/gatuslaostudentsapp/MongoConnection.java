/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gatuslaostudentsapp;

/**
 *
 * @author Maraudger
 */
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import org.bson.Document;
import java.util.List;
import org.bson.types.ObjectId;
public class MongoConnection {
     //database vars
     private static final String ZOOKEEPER_SERVERS = "localhost:2181";
     private static final String ZNODE_PATH = "/mongo_servers";
     private static final String DATABASE_NAME ="online_school";
     private static final String COLLECTION_NAME ="student_information";
     private static MongoDatabase database;
     private static MongoCollection<Document> collection;
     private static MongoClient mongoClient;
     
     public static void connect(){
         try {
             mongoClient = MongoClients.create("mongodb://localhost:27017,localhost:27018,localhost:27019/?replicaSet=rs0");
             database = mongoClient.getDatabase(DATABASE_NAME);
             collection = database.getCollection(COLLECTION_NAME);
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }
     public static void closeConnection(){
         try {
             mongoClient.close();
         } catch (Exception e) {
            System.out.println("on closing connection : "+e.getMessage()); 
         }
     }
     public static void saveStudentInfo(Document stDoc){
         
          try {
             collection.insertOne(stDoc);
         } catch (Exception e) {
            System.out.println("on insertion : "+e.getMessage()); 
         }
     }
     public static boolean updateStudentInfo(Document stDoc, ObjectId id){
         
         try {
             Document query = new Document("_id", id);

            // Create the update operation
            Document update = new Document("$set", stDoc);

            // Perform the update
             UpdateResult result = collection.updateOne(query, update);

            // Check if the update was successful
            if (result.getMatchedCount() > 0) {
                return true;
            } else {
                return false;
            }             
         } catch (Exception e) {
            System.out.println("on insertion : "+e.getMessage()); 
            return false;
         }
         
     }
     public static void deleteById(String id) {
         try {
            Document query = new Document("_id", new ObjectId(id));
            collection.deleteOne(query);
            System.out.println("Document with _id: " + id + " has been deleted.");
         } catch (Exception e) {
               System.out.println("on deletion : "+e.getMessage()); 
         }
    }
     
    public static  FindIterable<Document> findById(String id) {
        Document query = new Document("_id", new ObjectId(id));

        FindIterable<Document> result = collection.find(query);

//        Document doc = result.first();
        return result;
    }
     public static MongoCollection<Document> getCollection(){
         
        return collection;
     }
}
