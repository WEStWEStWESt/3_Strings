package interfaces;

import java.util.concurrent.Callable;

public interface Task extends Callable {
     String call() throws Exception;
}
