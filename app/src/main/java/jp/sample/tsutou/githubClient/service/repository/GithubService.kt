package jp.sample.tsutou.githubClient.service.repository

import jp.sample.tsutou.githubClient.service.model.Project

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

//Retrofitインターフェース(APIリクエストを管理)
const val HTTPS_API_GITHUB_URL = "https://api.github.com/"

internal interface GithubService {

    //一覧
    @GET("users/{user}/repos")
    fun getProjectList(@Path("user") user: String): Call<List<Project>>

    //詳細
    @GET("/repos/{user}/{reponame}")
    fun getProjectDetails(@Path("user") user: String, @Path("reponame") projectName: String): Call<Project>

}
