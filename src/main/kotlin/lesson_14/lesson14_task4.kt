package lesson_14

fun main() {

    val planet = Planet(
        name = "Earth",
        isHaveAtmosphere = true,
        isHaveDisembarkation = true,
        mutableListOf(
            Satellite("Moon", isHaveAtmosphere = false, isHaveDisembarkation = false),
            Satellite("MoonTwo", isHaveAtmosphere = true, isHaveDisembarkation = false)
        )
    )

    println("""
        Название планеты: ${planet.name}
        Спутники планеты: ${planet.listOfSatellites.joinToString { it.name }}
    """.trimIndent()
    )



}

open class CelestialBody(
    val name: String,
    val isHaveAtmosphere: Boolean,
    val isHaveDisembarkation: Boolean,
)

class Planet(
    name: String,
    isHaveAtmosphere: Boolean,
    isHaveDisembarkation: Boolean,
    val listOfSatellites: MutableList<Satellite>,
) : CelestialBody(name, isHaveAtmosphere, isHaveDisembarkation)


class Satellite(
    name: String,
    isHaveAtmosphere: Boolean,
    isHaveDisembarkation: Boolean,
) : CelestialBody(name, isHaveAtmosphere, isHaveDisembarkation)