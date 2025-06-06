package com.balv.imdb.data.mapper

import com.balv.imdb.data.model.dto.CastMemberRemote
import com.balv.imdb.data.model.dto.CrewMemberRemote
import com.balv.imdb.data.model.dto.MovieCreditsResponseRemote
import com.balv.imdb.data.model.entity.CastMemberLocal
import com.balv.imdb.data.model.entity.CrewMemberLocal
import com.balv.imdb.domain.models.DomainCastMember
import com.balv.imdb.domain.models.DomainCrewMember
import com.balv.imdb.domain.models.MovieCredits

fun CrewMemberLocal.toDomain() = DomainCrewMember(
    personId = this.personId,
    name = this.name,
    profilePath = this.profilePath,
    job = this.job,
    department = this.department,
)

fun CastMemberLocal.toDomain(): DomainCastMember {
    return DomainCastMember(
        personId = this.personId,
        name = this.name.trim(),
        character = this.character.trim(),
        profilePath = this.profilePath,
    )
}

fun CrewMemberRemote.toDomain(): DomainCrewMember? {

    if (this.personId == null || this.name == null || this.job == null || this.department == null) {
        return null
    }
    return DomainCrewMember(
        personId = this.personId,
        name = this.name.trim(),
        profilePath = this.profilePath,
        job = this.job.trim(),
        department = this.department.trim()
    )
}

fun CastMemberRemote.toDomain() = DomainCastMember(
    personId = this.personId ?: 0,
    name = this.name.orEmpty(),
    character = this.character.orEmpty(),
    profilePath = this.profilePath
)

fun MovieCreditsResponseRemote.toDomain(): MovieCredits {

    val domainCastList = this.cast?.map { it.toDomain() } ?: emptyList()

    val domainCrewList = this.crew?.mapNotNull { it.toDomain() }
        ?.filter { it.department == "Directing" && it.job == "Director" }
        ?: emptyList()

    return MovieCredits(
        movieId = this.movieId ?: 0, cast = domainCastList, crew = domainCrewList
    )
}

