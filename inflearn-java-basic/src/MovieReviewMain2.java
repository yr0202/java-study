public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "무한 팽이";
        reviews[0]=inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "로맨스 영화";
        reviews[1]=aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("영화제목: "+review.title+", 리뷰: "+review.review);
        }
//        System.out.println("영화제목: "+inception.title+", 리뷰: "+inception.review);
//        System.out.println("영화제목: "+aboutTime.title+", 리뷰: "+aboutTime.review);
    }
}

