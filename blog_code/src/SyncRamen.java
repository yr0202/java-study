public class SyncRamen {

    public static void main(String[] args) {
        System.out.println("물 끓이기 시작 🫖");
        boilWater();  // 물 끓을 때까지 기다림
        System.out.println("라면 넣기 🍜");
        System.out.println("라면 먹기 🤤");
    }

    public static void boilWater() {
        try {
            Thread.sleep(3000); // 3초 동안 물 끓이기 (대기)
            System.out.println("물 끓었어요!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
