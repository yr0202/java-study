public class BlockingCallExample {

    public static void main(String[] args) {
        System.out.println("👤 나: 친구에게 전화함...");

        String menu = askFriendBlocking();  // ⛔ 친구가 답할 때까지 기다림
        System.out.println("👤 나: 친구가 고른 메뉴는 → " + menu);
        System.out.println("👤 나: 이제 밥 먹으러 감 🍚");
    }

    // 블로킹 방식: 친구가 메뉴 고를 때까지 기다림
    public static String askFriendBlocking() {
        try {
            System.out.println("🧑‍🤝‍🧑 친구: 음... 뭐 먹지...");
            Thread.sleep(3000);  // 고민 중...
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "떡볶이";
    }
}
