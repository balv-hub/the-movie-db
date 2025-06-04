package com.balv.imdb.data.model.dto


import com.google.gson.annotations.SerializedName

data class MovieCreditsResponseRemote(
    @SerializedName("id") val movieId: Int?, 
    @SerializedName("cast") val cast: List<CastMemberRemote>?,
    @SerializedName("crew") val crew: List<CrewMemberRemote>?
)


data class CastMemberRemote(
    @SerializedName("adult") val adult: Boolean?,
    @SerializedName("gender") val gender: Int?, 
    @SerializedName("id") val personId: Int?, 
    @SerializedName("known_for_department") val knownForDepartment: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("original_name") val originalName: String?,
    @SerializedName("popularity") val popularity: Double?,
    @SerializedName("profile_path") val profilePath: String?, 
    @SerializedName("cast_id") val castIdInMovie: Int?, 
    @SerializedName("character") val character: String?,
    @SerializedName("credit_id") val creditId: String?, 
    @SerializedName("order") val order: Int? 
)


data class CrewMemberRemote(
    @SerializedName("adult") val adult: Boolean?,
    @SerializedName("gender") val gender: Int?,
    @SerializedName("id") val personId: Int?, 
    @SerializedName("known_for_department") val knownForDepartment: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("original_name") val originalName: String?,
    @SerializedName("popularity") val popularity: Double?,
    @SerializedName("profile_path") val profilePath: String?, 
    @SerializedName("credit_id") val creditId: String?, 
    @SerializedName("department") val department: String?,
    @SerializedName("job") val job: String?
)