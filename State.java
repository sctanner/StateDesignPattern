/**
 * This is an interface to group HomeState.java, NetflixState.java,
 * and MovieState.java. It declares methods that
 * must be implemented in classes that implement State.java.
 * @author Steven Tanner
 */
public interface State {

    public void pressHomeButton();
    public void pressNetflixButton();
    public void pressHuluButton();
    public void pressMovieButton();
    public void pressTVButton();

}
