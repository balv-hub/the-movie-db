package com.balv.imdb.domain.models


data class DomainGenre(
    val id: Int,
    val name: String
)


data class DomainProductionCompany(
    val id: Int,
    val name: String,
    val logoPath: String? 
)


data class MovieDetail(
    val id: Int,
    val title: String,
    val originalTitle: String,
    val tagline: String?, 
    val overview: String,
    val posterPath: String?, 
    val backdropPath: String?, 
    val releaseDate: String, 
    val releaseYear: String, 
    val runtime: Int, 
    val voteAverage: Double, 
    val voteCount: Int?,
    val genres: List<DomainGenre>,
    val adult: Boolean,

    
    val budget: Long, 
    val revenue: Long, 
    val status: String,
    val originalLanguage: String, 
    val homepage: String?,
    val imdbId: String,
    val popularity: Double?,
    val video: Boolean,
    val formattedRuntime: String?,


    val collection: DomainCollection?, 

    
    val productionCompanyNames: List<String>,
    
    

    val spokenLanguageNames: List<String>,
    val originCountryNames: List<String>,
    val refreshedDate: Long = 0,
    val castMembers: List<DomainCastMember>,
    val crewMembers: List<DomainCrewMember>,
)


data class DomainCollection(
    val id: Int,
    val name: String,
    val posterPath: String?,
    val backdropPath: String?
)

data class MovieCredits(
    val movieId: Int,
    val cast: List<DomainCastMember>,
    val crew: List<DomainCrewMember> 
)

data class DomainCastMember(
    val personId: Int,
    val name: String,
    val character: String,
    val profilePath: String?,
)

data class DomainCrewMember(
    val personId: Int, 
    val name: String,
    val profilePath: String?, 
    val job: String,
    val department: String
)