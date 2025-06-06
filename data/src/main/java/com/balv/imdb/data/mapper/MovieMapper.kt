package com.balv.imdb.data.mapper

import com.balv.imdb.data.model.dto.RemoteMovie
import com.balv.imdb.data.model.entity.MovieEntity
import com.balv.imdb.domain.models.Movie

fun MovieEntity.entityToDomain() = Movie(
    id = this.id,
    adult = this.adult,
    backdropPath = this.backdropPath,
    genreIds = this.genreIds,
    originalLanguage = this.originalLanguage,
    originalTitle = this.originalTitle,
    overview = this.overview,
    popularity = this.popularity,
    posterPath = this.posterPath,
    releaseDate = this.releaseDate,
    title = this.title,
    video = this.video,
    voteAverage = this.voteAverage,
    voteCount = this.voteCount,
    polledDate = this.polledDate
)


fun RemoteMovie.remoteMovieToEntity(): MovieEntity {
    return MovieEntity(
        id = this.id,
        adult = this.adult,
        backdropPath = this.backdropPath,
        genreIds = this.genreIds,
        originalLanguage = this.originalLanguage,
        originalTitle = this.originalTitle,
        overview = this.overview,
        popularity = this.popularity,
        posterPath = this.posterPath,
        releaseDate = this.releaseDate,
        title = this.title,
        video = this.video,
        voteAverage = this.voteAverage,
        voteCount = this.voteCount,
    )
}
