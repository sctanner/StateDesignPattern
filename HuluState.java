/**
 * This is one of the classes that implements State.java.
 * It represents the 'Hulu' state of a TV.
 * It can switch to other states, and print movies/tv shows
 * @author Steven Tanner
 */
public class HuluState implements State{
    
    private TV tv;
    //list of movies that Hulu has to offer
    String[] movies = new String[] {"The Sandlot", "Once Upon a Time in Hollywood", 
    "The Mortuary Collection", "The King of Staten Island", "The Lion King"};
    //list of tv shows that Hulu has to offer
    String[] tvShows = new String[] {"Spongebob", "Rick and Morty", "Game of Thrones", 
    "South Park", "Gravity Falls"};

    /**
     * The constrcutor takes in a TV object and sets it as this class's
     * private tv
     * @param tv
     */
    public HuluState(TV tv){
        this.tv = tv;
    }

    /**
     * This switches the TV's state to Home.
     * It also prints a message to notify the user.
     */
    @Override
    public void pressHomeButton(){
        System.out.println();
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }

    /**
     * This switches the TV's state to Netflix.
     * It also prints a message to notify the user.
     */
    @Override
    public void pressNetflixButton(){
        System.out.println();
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    /**
     * Since the TV is already in Hulu state,
     * only a message is printed to notify the user.
     */
    @Override
    public void pressHuluButton(){
        System.out.println();
        System.out.println("We are already in Hulu");
    }

    /**
     * This method prints the list of movies that Hulu has to offer
     */
    @Override
    public void pressMovieButton(){
        System.out.println();
        System.out.println("Hulu Movies:");
        for(int i=0; i<movies.length; i++){
            System.out.println("- " + movies[i]);
        }
    }
    /**
     * This method prints the list of tv shows that Hulu has to offer
     */
    @Override
    public void pressTVButton(){
        System.out.println();
        System.out.println("Hulu TV Shows:");
        for(int i=0; i<tvShows.length; i++){
            System.out.println("- " + tvShows[i]);
        }
    }

}
