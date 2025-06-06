package com.balv.imdb.data.mapper

fun formatRuntime(runtimeMinutes: Int): String {
    if (runtimeMinutes <= 0) return "N/A" 
    val hours = runtimeMinutes / 60
    val minutes = runtimeMinutes % 60
    return buildString {
        if (hours > 0) append("${hours}h ")
        if (minutes > 0 || hours == 0) append("${minutes}m") 
    }.trim().ifEmpty { "N/A" } 
}


fun extractReleaseYear(releaseDate: String?): String {
    
    return releaseDate?.split("-")?.firstOrNull()?.takeIf { it.length == 4 } ?: "N/A"
}



