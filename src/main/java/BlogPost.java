public class BlogPost implements Commentable {
    private String header;
    private String text;
    private Comment[] comments;
    private String[] bannedWords;

    public BlogPost(){ }

    public BlogPost(String header, String text){
        this.header = header;
        this.text = text;
        this.comments = new Comment[0];
        this.bannedWords = new String[0];
    }

    public void addCommentResponse(String Comment) {

    }

    /**
     * Add a new word to the array of bannedWords
     * @param bannedWord String representation of word to be banned.
     */
    public void addBannedWord(String bannedWord){
        boolean isAdded = false;
        for(String word : bannedWords){
            if(word.equals(bannedWord)){
                isAdded = true;
                break;
            }
        }

        if(!isAdded) {
            String[] placeholder = new String[bannedWords.length + 1];
            for(int i = 0; i < bannedWords.length; i++) {
                placeholder[i] = bannedWords[i];
            }
            placeholder[placeholder.length - 1] = bannedWord;
            bannedWords = placeholder;
        }
    }

    public void removeBannedWord(String bannedWord){
        boolean isBanned = false;
        String[] placeholder = new String[bannedWords.length - 1];
        for(int i = 0; i < bannedWords.length; i++) {
            if(!bannedWords[i].equals(bannedWord)){
                if(isBanned) {
                    placeholder[i - 1] = bannedWords[i];
                } else {
                    placeholder[i] = bannedWords[i];
                }
            } else {
                isBanned = true;
            }
        }

        if(isBanned) bannedWords = placeholder;
    }

    private Boolean isBannedWord(){
        return null;
    }

    private Boolean containsBannedWord() {
        return null;
    }

    public Comment getTopComment(){
        return null;
    }

    @Override
    public String toString(){
        return null;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Comment[] getComments() {
        return new Comment[0];
    }
}
