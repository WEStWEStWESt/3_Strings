package interfaces;

import java.util.concurrent.Callable;

public interface Task<T> extends Callable<T> {
      T call() throws Exception;
}
