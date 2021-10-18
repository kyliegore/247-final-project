public class Review {
    public User writer;
    public String comment;

    public Review(User writer, String comment) {

    }
    private String getComment() {
       return ""; 
    }
    private User getWriter() {
        return writer;
    }
}