import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		lockForI.lock();// get lock
		i++;
		lockForI.unlock();
		// release lock
	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		lockForJ.lock();// get lock
		j++;
		// release lock
		lockForJ.unlock();
	}

	public int getJ() {
		return j;
	}
}
