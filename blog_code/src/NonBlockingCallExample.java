import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NonBlockingCallExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("👤 나: 친구에게 '밥 먹자!' 하고 말함");
        System.out.println("🧑‍🤝‍🧑 친구: '조금 고민하고 문자로 알려줄게'");

        CompletableFuture<String> reply = askFriendTrulyNonBlocking();

        System.out.println("👤 나: 바로 전화 끊고 다른 일 하러 감 🧹");

        reply.thenAccept(menu -> {
            System.out.println("📩 친구 문자 옴: " + menu);
            System.out.println("👤 나: 이제 밥 먹으러 감 🍚");
        }); // 메인 스레드가 너무 빨리 종료되지 않도록 대기

        System.out.println("다른일");
        Thread.sleep(1000);
        System.out.println("다른일2");
        Thread.sleep(1000);
        System.out.println("다른일3");
        Thread.sleep(1000);
    }

    public static CompletableFuture<String> askFriendTrulyNonBlocking() {
        CompletableFuture<String> future = new CompletableFuture<>();

        // 스케줄러는 Thread.sleep 없이 타이머 기반 예약 실행
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        scheduler.schedule(() -> {
            future.complete("파스타");
            scheduler.shutdown(); // 리소스 정리
        }, 3, TimeUnit.SECONDS);  // 3초 후 실행

        return future;
    }
}
