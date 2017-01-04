import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author beyond
 * @version 1.0
 * @date 2016/12/19
 */
public class TestTmp {

    public static void main(String[] args) throws InterruptedException {
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("kill", null);
//
//        System.out.println("kill:" + map.get("kill"));
//
//        map.put(null, "ddd");
//
//        System.out.println("null:" + map.get(null));
//        System.out.println("null:" + map.containsKey(null));
//        Set<String> set = null;
//        for (String key : set) {
//
//        }

        Semaphore semaphore = new Semaphore(1,true);

        System.out.println("avai:"+semaphore.availablePermits());
        System.out.println("qlen:"+semaphore.getQueueLength());

        semaphore.tryAcquire(2, TimeUnit.SECONDS);

        System.out.println("avai:"+semaphore.availablePermits());
        System.out.println("qlen:"+semaphore.getQueueLength());

        semaphore.tryAcquire(2, TimeUnit.SECONDS);

        System.out.println("avai:"+semaphore.availablePermits());
        System.out.println("qlen:"+semaphore.getQueueLength());

    }
}
