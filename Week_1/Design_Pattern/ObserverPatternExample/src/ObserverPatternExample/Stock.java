package ObserverPatternExample;
import java.util.ArrayList;

public interface Stock {
	void register(Observer observer);
	void deregister(Observer observer);
	void notifyobs();
}
