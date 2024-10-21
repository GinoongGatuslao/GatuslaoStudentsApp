/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gatuslaostudentsapp;

/**
 *
 * @author Roger Gatuslao
 */
import java.io.IOException;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
public class ZookeeperConnection {
    
    
    private ZooKeeper zooKeeper;
    private static final String ZOOKEEPER_HOST ="localhost:2181";
    private static final int SESSION_TIMEOUT = 3000;
    private final CountDownLatch connectedSignal = new CountDownLatch(1);
    
        public ZookeeperConnection() throws IOException {
            zooKeeper = new ZooKeeper(ZOOKEEPER_HOST, SESSION_TIMEOUT, new Watcher() {
                @Override
                public void process(WatchedEvent event) {
                    System.out.println("Zookeeper event triggered: " + event.getType());
                }
            });
        }
        
        public ZooKeeper getZookeeper(){
            return zooKeeper;
        }
     
        public boolean connect(String host) throws Exception {
           
            zooKeeper = new ZooKeeper(host, SESSION_TIMEOUT, event -> {
                if (event.getState() == Watcher.Event.KeeperState.SyncConnected) {
                    System.out.println("ZooKeeper connection established!");
                }
            });
         return true;
        }
        public ZooKeeper connectToServer(String host) throws Exception {
           
            zooKeeper = new ZooKeeper(host, SESSION_TIMEOUT, event -> {
                if (event.getState() == Watcher.Event.KeeperState.SyncConnected) {
                    System.out.println("ZooKeeper connection established!");
                }
            });
          return zooKeeper;
        }
    
    public String createZNode(String path, String data) {
        try {
            // Use OPEN_ACL_UNSAFE for unrestricted access control
            String createdPath = zooKeeper.create(path, data.getBytes(),
                    ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
            return "ZNode created: " + createdPath;
        }catch (KeeperException e) {
            if (null == e.code()) {
                ExMessageHandler.showErrorDialog("Failed to create znode: " + e.getMessage());
            } else switch (e.code()) {
                case NODEEXISTS:
                    return "ZNode already exists: " + path;
                    
                case NONODE:
                    return "Parent znode does not exist: " + path;
                    
                default:
                    return "Failed to create znode: " + e.getMessage();
                    
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "Zookeeper operation was interrupted: " + e.getMessage();
        } catch (Exception e) {
            return "An unexpected error occurred: " + e.getMessage();
        }
        return "";
    }
    public void deleteZNode(String path) {
            try {
                zooKeeper.delete(path, -1);
                ExMessageHandler.showInfoDialog("ZNode deleted: " + path);
            } catch (KeeperException e) {
                if (e.code() == KeeperException.Code.NONODE) {
                   ExMessageHandler.showErrorDialog("ZNode does not exist: " + path);
                } else {
                    ExMessageHandler.showErrorDialog("Failed to delete znode: " + e.getMessage());
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                ExMessageHandler.showErrorDialog("Zookeeper operation was interrupted: " + e.getMessage());
            } catch (Exception e) {
                ExMessageHandler.showErrorDialog("An unexpected error occurred: " + e.getMessage());
            }
    }

    public List<String> displayZNodes(String path) {
          List<String> children = new ArrayList<>();
        try {
            children = zooKeeper.getChildren(path, false);
//            System.out.println("Children of znode '" + path + "':");
//            for (String child : children) {
//                System.out.println(" - " + child);
//            }
        } catch (KeeperException | InterruptedException e) {
            ExMessageHandler.showErrorDialog("Error retrieving children: " + e.getMessage());
            e.printStackTrace();
        }
        return children;
    }


    public boolean close() throws InterruptedException {
        zooKeeper.close();
        return true;
    }
    // Main method to run the program
//    public static void main(String[] args) throws Exception {
//        ZookeeperConnect zookeeperConnect = new ZookeeperConnect();
//        String host = "localhost:2181"; // Replace with your ZooKeeper host if necessary
//
//        try {
//            zookeeperConnect.connect(host);
//            System.out.println("Connected to ZooKeeper at " + host);
//
//            // Create a znode with some 
//            zookeeperConnect.createZNode("/mongo_servers", "mongodb://localhost:27017,localhost:27018,localhost:27019/?replicaSet=rs0");
//           
//          // Display znodes under the root ("/") or any specific znode
//            zookeeperConnect.displayZNodes("/");
//            
//            // Delete the created znode
//            zookeeperConnect.deleteZNode("/myznode1");
//            
//            // Close the connection after operations
//            zookeeperConnect.close();
//            System.out.println("ZooKeeper connection closed.");
//        } catch (InterruptedException e) {
//        }
//    }
}

