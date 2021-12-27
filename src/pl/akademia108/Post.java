package pl.akademia108;

import java.util.Objects;

public class Post {
    private int id;
    private String content;
    private boolean isPublic;

    Post(int id, String content, boolean isPublic) {
        this.id = id;
        this.content = content;
        this.isPublic = isPublic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id && isPublic == post.isPublic && Objects.equals(content, post.content);
    }
}

