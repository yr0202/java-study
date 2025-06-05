import java.util.concurrent.CompletableFuture;

public class AsyncRamen {

    public static void main(String[] args) {
        System.out.println("물 끓이기 시작 🫖");

        CompletableFuture<Void> boilingTask = CompletableFuture.runAsync(() -> boilWater());

        doOtherThings();  // 물 끓는 동안 다른 일 하기

        boilingTask.join(); // 물 끓이는 작업이 끝날 때까지 대기
        System.out.println("라면 넣기 🍜");
        System.out.println("라면 먹기 🤤");
    }

    public static void boilWater() {
        try {
            Thread.sleep(3000); // 물 끓이기
            System.out.println("👉 물이 끓었어요! (알람)");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void doOtherThings() {
        System.out.println("📱 핸드폰 확인 중...");
        try {
            Thread.sleep(1000);
            System.out.println("🧹 청소하는 중...");
            Thread.sleep(1000);
            System.out.println("🧺 세탁기 돌리는 중...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
