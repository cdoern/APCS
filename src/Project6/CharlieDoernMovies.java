package Project6;

import Project6.CharlieDoernDVDCollection;

/**
 * The CharlieDoernMovies class is the client file in which the user declares a new dvd collection and manipulates
 * it and prints it out to the console.
 */
public class CharlieDoernMovies {
    public static void main(String[] args){
        CharlieDoernDVDCollection collection = new CharlieDoernDVDCollection(); //new collection
        collection.addDVD("cool movie!","me",2018,20.18,true); //adding a dvd
        collection.addDVD("pretty good movie","you",2017,25.19,false);
        collection.addDVD("best movie of all time","us",2019,30.25,false);
        System.out.println(collection); //indirect call to toString method

    }
}
