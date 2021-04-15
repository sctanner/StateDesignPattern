/**
 * This is one of the classes that implements State.java.
 * It represents the 'Netflix' state of a TV.
 * It can switch to other states, and print movies/tv shows
 * @author Steven Tanner
 */
public class NetflixState implements State{
        
    private TV tv;
    //list of movies that Netflix has to offer
    String[] movies = new String[]{"Fantastic Fungi", "The Incredibles", "Star Wars",
    "The Avengers", "Interstellar"};
    //list of tv shows that Netflix has to offer
    String[] tvShows = new String[]{"The Office", "Hunter X Hunter", "Shark Tank",
    "Jeopardy", "Stranger Things" };

    /**
     * The constrcutor takes in a TV object and sets it as this class's
     * private tv
     * @param tv
     */
    public NetflixState(TV tv){
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
     * Since we are already in the netflix state,
     * this method simply prints a message that notifies the user.
     */
    @Override
    public void pressNetflixButton(){
        System.out.println("We are already in Netflix");
    }

    /**
     * This switches the TV's state to Hulu.
     * It also prints a message to notify the user.
     */
    @Override
    public void pressHuluButton(){
        System.out.println();
        System.out.println("Loading Hulu...");
        tv.setState(tv.getHuluState());
    }

    /**
     * This method prints the list of movies that Netlix has to offer
     */
    @Override
    public void pressMovieButton(){
        System.out.println();
        System.out.println("Netflix Movies:");
        for(int i=0; i<movies.length; i++){
            System.out.println("- " + movies[i]);
        }
    }

    /**
     * This method prints the list of tv shows that netflix has to offer
     */
    @Override
    public void pressTVButton(){
        System.out.println();
        System.out.println("Netflix TV Shows:");
        for(int i=0; i<tvShows.length; i++){
            System.out.println("- " + tvShows[i]);
        }
    }
    
}
