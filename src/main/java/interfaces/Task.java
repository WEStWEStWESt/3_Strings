package interfaces;

import java.util.concurrent.Callable;

public interface Task extends Callable {
      Object call() throws Exception;
}
