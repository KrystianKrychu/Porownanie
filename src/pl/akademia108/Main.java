package pl.akademia108;

public class Main {

    public static void main(String[] args) {
        Post post1 = new Post(1, "content1", false);
        Post post2 = new Post(1, "content1", false);

        if (post1.equals(post2)) {
            post2 = null;
        }

    }
}