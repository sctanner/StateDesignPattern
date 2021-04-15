/**
 * This class represents a TV object.
 * The action of its methods depends on what the State variable is set to.
 * It also includes getters for the states to be called.
 * @author Steven Tanner
 */
public class TV {

    private State homeState;
    private State netflixState;
    private State huluState;
    private State state;

    /**
     * This is the TV constructor.
     * It sets each of the states.
     * It also sets the current state to HomeState.
     */
    public TV(){
        homeState = new HomeState(this);
        netflixState = new NetflixState(this);
        huluState = new HuluState(this);
        setState(getHomeState());
    }

    /**
     * Calls pressHomeButton() based on what state is set to
     */
    public void pressHomeButton(){
        state.pressHomeButton();

    }

    /**
     * Calls pressNetflixButton based on what state is set to
     */
    public void pressNetflixButton(){
        state.pressNetflixButton();
    }   

    /**
     * Calls pressHuluButton() based on wahat state is set to
     */
    public void pressHuluButton(){
        state.pressHuluButton();
    }

    /**
     * Calls pressMovieButton() based on what state is set to
     */
    public void pressMovieButton(){
        state.pressMovieButton();
    }

    /**
     * Calls pressTVButton() based on what state is set to
     */
    public void pressTVButton(){
        state.pressTVButton();
    }

    /**
     * This is a setter for the State state varaible.
     * It takes in a State and sets it to this.state
     * @param state
     */
    public void setState(State state){
        this.state = state;
    }
    
    /**
     * A simple getter for the homeState variable to be referenced in another class
     * @return homeState
     */
    public State getHomeState(){
        return homeState;
    }

    /**
     * A simple getter for the netflixState variable to be referenced in another class
     * @return netflixState
     */
    public State getNetflixState(){
        return netflixState;
    }

    /**
     * A simple getter for the huluState variable to be referenced in another class
     * @return huluState
     */
    public State getHuluState(){
        return huluState;
    }

    




}
