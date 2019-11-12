public class Comment implements Commentable {
    private String text;
    private Integer upVotes;
    private Integer downVotes;
    private Comment[] responses;

    public Comment(String text){
        this.text = text;
        this.upVotes = 0;
        this.downVotes = 0;
        this.responses = new Comment[0];
    }
    public void addCommentResponse(String Comment) {

    }

    public Comment[] getComments() {
        return new Comment[0];
    }
}
