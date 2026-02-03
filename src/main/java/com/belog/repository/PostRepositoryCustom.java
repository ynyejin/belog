package com.belog.repository;

import com.belog.domain.Post;
import com.belog.request.PostSearch;

import java.util.List;

public interface PostRepositoryCustom {

    List<Post> getList(PostSearch postSearch);
}
