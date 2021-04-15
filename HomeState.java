/**
 * This is one of the classes that implements State.java.
 * It represents the 'home' state of a TV.
 * When a TV() is created/turned on, it initalizes the state to HomeState.
 * @author Steven Tanner
 */
public class HomeState implements State{
    
    private TV tv;
    
    /**
     * The constrcutor takes in a TV object and sets it as this class's
     * private tv
     * @param tv
     */
    public HomeState(TV tv){
        this.tv = tv;
    }

    /**
     * Since the TV is already in the home state,
     * only a message is printed.
     */
    @Override
    public void pressHomeButton(){
        System.out.println("TV is already on the home screen");
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
     * The home state does not contain movies,
     * so a message is printed to tell the user to 
     * switch to an app in order to show movies.
     */
    @Override
    public void pressMovieButton(){
        System.out.println("Home: You must pick an app to show movies");
    }

    /**
     * The home state does not contain tv shows,
     * so a message is printed to tell the user to 
     * switch to an app in order to show tv shows.
     */
    @Override
    public void pressTVButton(){
        System.out.println("Home: You must pick an app to show tv shows");
    }

}
