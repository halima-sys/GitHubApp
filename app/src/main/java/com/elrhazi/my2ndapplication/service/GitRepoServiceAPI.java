package com.elrhazi.my2ndapplication.service;

import com.elrhazi.my2ndapplication.model.GitRepos;
import com.elrhazi.my2ndapplication.model.GitUsersResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GitRepoServiceAPI {
    @GET("search/users")
    public Call<GitUsersResponse> searchUsers(@Query("q") String query);
    @GET("users/{u}/repos")
    public Call<List<GitRepos>> userRepositories(@Path("u") String login);
}
