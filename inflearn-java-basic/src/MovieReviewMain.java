public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "무한 팽이";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "로맨스 영화";

        System.out.println("영화제목: "+inception.title+", 리뷰: "+inception.review);
        System.out.println("영화제목: "+aboutTime.title+", 리뷰: "+aboutTime.review);

    }
}

