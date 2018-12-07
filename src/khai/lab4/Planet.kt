package khai.lab4
class Planet2 {


    fun zadanie(a:Double) {
        val planet = ArrayList<Planet>()
        planet.add(Planet(name = string_list[0], mass = num_list[0]))
        planet.add(Planet(name = string_list[1], mass = num_list[1]))
        planet.add(Planet(name = string_list[2], mass = num_list[2]))
        planet.add(Planet(name = string_list[3], mass = num_list[3]))
        planet.add(Planet(name = string_list[4], mass = num_list[4]))
        planet.add(Planet(name = string_list[5], mass = num_list[5]))
        planet.add(Planet(name = string_list[6], mass = num_list[6]))
        planet.add(Planet(name = string_list[7], mass = num_list[7]))
        planet.add(Planet(name = string_list[8], mass = num_list[8]))

        planet.sortedWith(compareBy { it.mass })
        println(planet.filter { it.mass >= a })
        print("Масса планеты в фунтах:")
        println(planet.map { it.mass * 2.2046226218 * Math.pow(10.0, 19.0) })
        print("Масса планеты в унциях:")
        println(planet.map { it.mass * 35.273962 * Math.pow(10.0, 19.0) })
        println(planet.joinToString(separator = "; ",
                transform = { p: Planet -> p.name + " (масса: ${p.mass} * 10^19 кг)" }))
    }













}






















